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
package org.everit.jira.querydsl.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJquartzCalendars is a Querydsl query type for QJquartzCalendars
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzCalendars extends com.mysema.query.sql.RelationalPathBase<QJquartzCalendars> {

    private static final long serialVersionUID = -105673808;

    public static final QJquartzCalendars jquartzCalendars = new QJquartzCalendars("JQUARTZ_CALENDARS");

    public final SimplePath<byte[]> calendar = createSimple("calendar", byte[].class);

    public final StringPath calendarName = createString("calendarName");

    public final StringPath schedName = createString("schedName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzCalendars> jquartzCalendarsPk = createPrimaryKey(calendarName);

    public QJquartzCalendars(String variable) {
        super(QJquartzCalendars.class, forVariable(variable), "PUBLIC", "JQUARTZ_CALENDARS");
        addMetadata();
    }

    public QJquartzCalendars(String variable, String schema, String table) {
        super(QJquartzCalendars.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzCalendars(Path<? extends QJquartzCalendars> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_CALENDARS");
        addMetadata();
    }

    public QJquartzCalendars(PathMetadata<?> metadata) {
        super(QJquartzCalendars.class, metadata, "PUBLIC", "JQUARTZ_CALENDARS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendar, ColumnMetadata.named("CALENDAR").withIndex(3).ofType(Types.VARBINARY).withSize(16000));
        addMetadata(calendarName, ColumnMetadata.named("CALENDAR_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

