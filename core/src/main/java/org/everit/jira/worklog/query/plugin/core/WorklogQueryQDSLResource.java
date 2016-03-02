/**
 * This file is part of org.everit.jira.worklog.query.plugin.core.
 *
 * org.everit.jira.worklog.query.plugin.core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * org.everit.jira.worklog.query.plugin.core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with org.everit.jira.worklog.query.plugin.core.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.jira.worklog.query.plugin.core;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.everit.jira.querydsl.model.QAppUser;
import org.everit.jira.querydsl.model.QCwdUser;
import org.everit.jira.querydsl.model.QJiraissue;
import org.everit.jira.querydsl.model.QProject;
import org.everit.jira.querydsl.model.QWorklog;
import org.ofbiz.core.entity.GenericEntityException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import com.atlassian.crowd.embedded.api.User;
import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.exception.DataAccessException;
import com.atlassian.jira.project.Project;
import com.atlassian.jira.rest.api.util.StringList;
import com.atlassian.jira.security.JiraAuthenticationContext;
import com.atlassian.jira.security.Permissions;
import com.atlassian.jira.usercompatibility.UserCompatibilityHelper;
import com.atlassian.jira.util.json.JSONArray;
import com.atlassian.jira.util.json.JSONException;
import com.atlassian.jira.util.json.JSONObject;
import com.atlassian.pocketknife.api.querydsl.ConnectionProvider;
import com.atlassian.pocketknife.api.querydsl.DialectProvider;
import com.atlassian.pocketknife.internal.querydsl.JiraConnectionProviderImpl;
import com.atlassian.pocketknife.internal.querydsl.QueryFactoryImpl;
import com.atlassian.pocketknife.spi.querydsl.DefaultDialectConfiguration;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.mysema.query.sql.SQLQuery;
import com.mysema.query.types.QBean;
import com.mysema.query.types.expr.BooleanExpression;
import com.mysema.query.types.expr.DateTimeExpression;
import com.mysema.query.types.expr.NumberExpression;
import com.mysema.query.types.expr.SimpleExpression;
import com.mysema.query.types.expr.StringExpression;

/**
 * The WorklogQueryResource class. The class contains the findWorklogs method. The class grant the
 * JIRA worklog query.
 */
@Path("/find-qdsl")
public class WorklogQueryQDSLResource {

  public static class JsonWorklog extends JSONObject {

    private static final String UPDATED = "updated";

    private static final String DURATION = "duration";

    private static final String START_DATE = "startDate";

    private static final String ISSUE_KEY = "issueKey";

    private static final String ID = "id";

    private static final String COMMENT = "comment";

    private static final String USER_ID = "userId";

    public static QBean<JsonWorklog> createProjection(NumberExpression<Long> id,
        DateTimeExpression<Timestamp> startDate, StringExpression issueKey, StringExpression userId,
        NumberExpression<Long> duration, StringExpression comment,
        DateTimeExpression<Timestamp> updated) {

      List<SimpleExpression<?>> expressionList = new ArrayList<>();
      expressionList.add(id.as(ID));
      expressionList.add(startDate.as(START_DATE));
      expressionList.add(issueKey.as(ISSUE_KEY));
      expressionList.add(userId.as(USER_ID));
      expressionList.add(duration.as(DURATION));
      if (comment != null) {
        expressionList.add(comment.as(COMMENT));
      }
      if (updated != null) {
        expressionList.add(updated.as(UPDATED));
      }
      SimpleExpression<?>[] expressions = new SimpleExpression<?>[expressionList.size()];
      return new QBean<>(JsonWorklog.class, expressionList.toArray(expressions));
    }

    public void setComment(String comment) throws JSONException {
      put(COMMENT, comment);
    }

    public void setDuration(long duration) throws JSONException {
      put(DURATION, duration);
    }

    public void setId(long id) throws JSONException {
      put(ID, Long.valueOf(id));
    }

    public void setIssueKey(String issueKey) throws JSONException {
      put(ISSUE_KEY, issueKey);
    }

    public void setStartDate(Timestamp startDate) throws JSONException {
      put(START_DATE, DateTimeConverterUtil.stringDateToISO8601FormatString(startDate));
    }

    public void setUpdated(Timestamp updated) throws JSONException {
      put(UPDATED, DateTimeConverterUtil.stringDateToISO8601FormatString(updated));
    }

    public void setUserId(String userId) throws JSONException {
      put(USER_ID, userId);
    }

  }

  /**
   * The last hour of a day.
   */
  private static final int LAST_HOUR_OF_DAY = 23;

  /**
   * The last minute of an hour.
   */
  private static final int LAST_MINUTE_OF_HOUR = 59;

  /**
   * The last second of a minute.
   */
  private static final int LAST_SECOND_OF_MINUTE = 59;
  /**
   * The logger used to log.
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(WorklogQueryQDSLResource.class);

  private QueryFactoryImpl queryFactory;

  public WorklogQueryQDSLResource() {
    ConnectionProvider connectionProvider = new JiraConnectionProviderImpl();
    DialectProvider dialectProvider = new DefaultDialectConfiguration(connectionProvider);
    queryFactory = new QueryFactoryImpl(connectionProvider, dialectProvider);
  }

  /**
   * Check the required (or optional) parameters. If any parameter missing or conflict return with
   * the right Response what describes the problem. If everything is right then return with null.
   *
   * @param startDate
   *          The findWorklogs startDate parameter.
   * @param user
   *          The findWorklogs user parameter.
   * @param group
   *          The findWorklogs group parameter.
   * @return If find bad parameter then return with Response else null.
   */
  private Response checkRequiredFindWorklogsParameter(final String startDate, final String user,
      final String group) {
    if (isStringEmpty(startDate)) {
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("The 'startDate' parameter is missing!").build();
    }
    if ((isStringEmpty(user)) && (isStringEmpty(group))) {
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("The 'user' or the 'group' parameter is missing!").build();
    }
    if ((!isStringEmpty(user)) && (!isStringEmpty(group))) {
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("The 'user' and the 'group' parameters cannot be present at the same time.")
          .build();
    }
    return null;
  }

  /**
   * Convert the endDate String to Calendar.
   *
   * @param endDateString
   *          The endDate parameter.
   * @return The formated, valid calendar.
   * @throws ParseException
   *           If cannot parse the String to Calendar.
   */
  private Calendar convertEndDate(final String endDateString) throws ParseException {
    Calendar endDate;
    if ((endDateString == null) || (endDateString.length() == 0)) {
      endDate = Calendar.getInstance();
    } else {
      endDate = DateTimeConverterUtil.inputStringToCalendar(endDateString);
    }
    endDate = DateTimeConverterUtil.setCalendarHourMinSec(endDate,
        LAST_HOUR_OF_DAY, LAST_MINUTE_OF_HOUR, LAST_SECOND_OF_MINUTE);
    return endDate;
  }

  /**
   * Convert the startDate String to Calendar.
   *
   * @param startDateString
   *          The startDate parameter.
   * @return The formated, valid calendar.
   * @throws ParseException
   *           Id cannot parse the String to Calendar.
   */
  private Calendar convertStartDate(final String startDateString) throws ParseException {
    Calendar startDate = DateTimeConverterUtil.inputStringToCalendar(startDateString);
    startDate = DateTimeConverterUtil.setCalendarHourMinSec(startDate, 0, 0, 0);
    return startDate;
  }

  /**
   * Creates a list of project Id's. Filtering based on project permission and the query
   * projectString parameter.
   *
   * @param projectString
   *          The query projectString parameter.
   * @param user
   *          The logged user.
   *
   * @return The list of the issues conditions.
   * @throws GenericEntityException
   *           If the GenericDelegator throw a GenericEntityException.
   */
  private List<Long> createProjects(final String projectString, final User user) {

    Collection<Project> projects = ComponentAccessor.getPermissionManager()
        .getProjectObjects(Permissions.BROWSE, user);

    List<Long> projectList = new ArrayList<Long>();
    for (Project project : projects) {
      if ((projectString != null) && (projectString.length() != 0)) {
        if (projectString.equals(project.getKey())) {
          projectList.add(project.getId());
        }
      } else {
        projectList.add(project.getId());
      }
    }
    return projectList;
  }

  /**
   * Creates a list of user's. If the group variable is defined, then collect all of the user's keys
   * in that group. If userName is defined then add the users key to the list.
   *
   * @param userName
   *          the user name of the user
   * @param group
   *          the name of the group
   * @return
   */
  private List<String> createUsers(final String userName, final String group) {
    List<String> users = new ArrayList<String>();
    if ((group != null) && (group.length() != 0)) {
      Set<User> groupUsers = ComponentAccessor.getUserUtil().getAllUsersInGroupNames(
          Arrays.asList(new String[] { group }));
      Set<String> assigneeIds = new TreeSet<String>();
      for (User groupUser : groupUsers) {
        assigneeIds.add(groupUser.getName());
        String userKey = UserCompatibilityHelper.getKeyForUser(groupUser);
        users.add(userKey);
      }
    } else if ((userName != null) && (userName.length() != 0)) {
      User user = ComponentAccessor.getUserUtil().getUserObject(userName);
      if (user != null) {
        String userKey = UserCompatibilityHelper.getKeyForUser(user);
        users.add(userKey);
      }
    }
    return users;
  }

  /**
   * The worklogs restful api method.
   *
   * @param startDate
   *          The query startDate parameter.
   * @param endDate
   *          The query endDate parameter, optional. Default value is the current time.
   * @param user
   *          The query user parameter, optional. This or the group parameter is required.
   * @param group
   *          The query group parameter, optional. This or the user parameter is required.
   * @param project
   *          The query project parameter, optional. Default is all project.
   * @return {@link Response} what contains the result of the query. If the method parameters was
   *         wrong then a message what contains the description of the bad request. In case of any
   *         exception return {@link Response} with INTERNAL_SERVER_ERROR status what contains the
   *         original exception message.
   */
  @GET
  @Produces({ MediaType.APPLICATION_JSON })
  @Path("/worklogs")
  public Response findWorklogs(
      @QueryParam("startDate") final String startDate,
      @QueryParam("endDate") final String endDate,
      @QueryParam("user") final String user,
      @QueryParam("group") final String group,
      @QueryParam("project") final String project,
      @QueryParam("fields") final List<StringList> fields) {

    Response checkRequiredFindWorklogsParamResponse = checkRequiredFindWorklogsParameter(startDate,
        user, group);
    if (checkRequiredFindWorklogsParamResponse != null) {
      return checkRequiredFindWorklogsParamResponse;
    }
    Calendar startDateCalendar;
    try {
      startDateCalendar = convertStartDate(startDate);
    } catch (ParseException e) {
      LOGGER.debug("Failed to convert start date", e);
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("Cannot parse the 'startDate' parameter: " + startDate).build();
    }
    Calendar endDateCalendar;
    try {
      endDateCalendar = convertEndDate(endDate);
    } catch (ParseException e) {
      LOGGER.debug("Failed to convert end date", e);
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("Cannot parse the 'endDate' parameter: " + endDate).build();
    }
    try {
      return worklogQuery(startDateCalendar, endDateCalendar, user, group, project, fields, false);
    } catch (Exception e) {
      LOGGER.error("Failed to query the worklogs", e);
      return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
          .entity(e.getMessage()).build();
    }
  }

  /**
   * Check the given String is empty.
   *
   * @param theString
   *          The String variable.
   * @return If the String is null or the String length equals whit 0 then true, else false.
   */
  private boolean isStringEmpty(final String theString) {
    if ((theString == null) || (theString.length() == 0)) {
      return true;
    }
    return false;
  }

  /**
   * The method to query worklogs.
   *
   * @param startDate
   *          The startDate calendar parameter.
   * @param endDate
   *          The endDate calendar parameter.
   * @param userString
   *          The user String parameter.
   * @param groupString
   *          The group String parameter.
   * @param projectString
   *          The project String parameter.
   * @param updated
   *          True if the method give back the worklogs which were created or updated in the given
   *          period, else false. The false give back the worklogs of the period.
   * @return JSONString what contains a list of queried worklogs.
   * @throws ParseException
   *           If can't parse the dates.
   * @throws GenericEntityException
   *           If the GenericDelegator throw a GenericEntityException.
   * @throws JSONException
   *           If the createWorklogJSONObject method throw a JSONException.
   */
  private Response worklogQuery(final Calendar startDate, final Calendar endDate,
      final String userString,
      final String groupString, final String projectString, final List<StringList> fields,
      final boolean updated)
          throws DataAccessException,
          SQLException, JSONException, ParseException {

    StopWatch fullWatch = new StopWatch();
    fullWatch.start();

    StopWatch partialWatch = new StopWatch();
    partialWatch.start();

    JiraAuthenticationContext authenticationContext = ComponentAccessor
        .getJiraAuthenticationContext();
    User loggedInUser = authenticationContext.getLoggedInUser();
    final List<Long> projects = createProjects(projectString, loggedInUser);
    if ((projectString != null) && projects.isEmpty()) {
      return Response
          .status(Response.Status.BAD_REQUEST)
          .entity(
              "Error running search: There is no project matching the given 'project' parameter: "
                  + projectString)
          .build();
    }
    final List<String> users = createUsers(userString, groupString);
    if (users.isEmpty()) {
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("Error running search: There is no group or user matching the given parameters.")
          .build();
    }

    partialWatch.stop();
    long timeValidation = partialWatch.getTotalTimeMillis();

    partialWatch = new StopWatch();
    partialWatch.start();

    List<JsonWorklog> worklogs = null;

    ImmutableList<String> fieldsAsList = StringList.joinLists(fields).asList();
    final boolean useComment = fieldsAsList.contains("comment");
    final boolean useUpdated = fieldsAsList.contains("updated");

    final Timestamp startTimestamp = new Timestamp(startDate.getTimeInMillis());
    final Timestamp endTimestamp = new Timestamp(endDate.getTimeInMillis());

    worklogs = queryFactory.fetch(new Function<SQLQuery, List<JsonWorklog>>() {
      @Override
      public List<JsonWorklog> apply(SQLQuery query) {

        QWorklog worklog = new QWorklog("worklog");
        QJiraissue issue = new QJiraissue("issue");
        QProject project = new QProject("project");
        QCwdUser cwduser = new QCwdUser("cwd_user");
        QAppUser appuser = new QAppUser("app_user");

        StringExpression issueKey = project.pkey.concat("-").concat(issue.issuenum.stringValue());

        QBean<JsonWorklog> listing = JsonWorklog.createProjection(
            worklog.id, worklog.startdate, issueKey, cwduser.userName, worklog.timeworked,
            useComment ? worklog.worklogbody : null,
            useUpdated ? worklog.updated : null);

        BooleanExpression predicate = worklog.startdate.goe(startTimestamp)
            .and(worklog.startdate.lt(endTimestamp))
            .and(worklog.author.in(users))
            .and(issue.project.in(projects));

        return query.from(worklog)
            .join(issue).on(issue.id.eq(worklog.issueid))
            .join(project).on(project.id.eq(issue.project))
            .join(appuser).on(appuser.userKey.eq(worklog.author))
            .join(cwduser).on(cwduser.lowerUserName.eq(appuser.lowerUserName))
            .where(predicate)
            .orderBy(worklog.id.asc())
            .list(listing);
      }
    });

    partialWatch.stop();
    long timeQuery = partialWatch.getTotalTimeMillis();

    partialWatch = new StopWatch();
    partialWatch.start();

    JSONArray jsonArrayResult = new JSONArray();
    jsonArrayResult.put(worklogs);
    String result = jsonArrayResult.toString();

    partialWatch.stop();
    long timeResultCreation = partialWatch.getTotalTimeMillis();

    fullWatch.stop();
    long timeFull = fullWatch.getTotalTimeMillis();

    LOGGER.error(
        "+++++++++++++++++++++++++++++++++ worklog query stopped, full time is " + timeFull + "ms");
    return Response
        .ok(result)
        .header("X-Count", String.valueOf(worklogs.size()))
        .header("X-Time-Validation", timeValidation + "ms")
        .header("X-Time-Query", timeQuery + "ms")
        .header("X-Time-Sorting", "-")
        .header("X-Time-Result-Creation", timeResultCreation + "ms")
        .header("X-Time-Full", timeFull + "ms")
        .build();

  }
}
