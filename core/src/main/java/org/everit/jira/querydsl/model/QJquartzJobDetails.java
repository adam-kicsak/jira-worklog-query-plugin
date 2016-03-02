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
 * QJquartzJobDetails is a Querydsl query type for QJquartzJobDetails
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzJobDetails extends com.mysema.query.sql.RelationalPathBase<QJquartzJobDetails> {

    private static final long serialVersionUID = 394946666;

    public static final QJquartzJobDetails jquartzJobDetails = new QJquartzJobDetails("JQUARTZ_JOB_DETAILS");

    public final StringPath description = createString("description");

    public final BooleanPath isDurable = createBoolean("isDurable");

    public final BooleanPath isNonconcurrent = createBoolean("isNonconcurrent");

    public final BooleanPath isStateful = createBoolean("isStateful");

    public final BooleanPath isUpdateData = createBoolean("isUpdateData");

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final StringPath jobClassName = createString("jobClassName");

    public final SimplePath<byte[]> jobData = createSimple("jobData", byte[].class);

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final BooleanPath requestsRecovery = createBoolean("requestsRecovery");

    public final StringPath schedName = createString("schedName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzJobDetails> jquartzJobDetailsPk = createPrimaryKey(jobGroup, jobName);

    public QJquartzJobDetails(String variable) {
        super(QJquartzJobDetails.class, forVariable(variable), "PUBLIC", "JQUARTZ_JOB_DETAILS");
        addMetadata();
    }

    public QJquartzJobDetails(String variable, String schema, String table) {
        super(QJquartzJobDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzJobDetails(Path<? extends QJquartzJobDetails> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_JOB_DETAILS");
        addMetadata();
    }

    public QJquartzJobDetails(PathMetadata<?> metadata) {
        super(QJquartzJobDetails.class, metadata, "PUBLIC", "JQUARTZ_JOB_DETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(250));
        addMetadata(isDurable, ColumnMetadata.named("IS_DURABLE").withIndex(6).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(isNonconcurrent, ColumnMetadata.named("IS_NONCONCURRENT").withIndex(9).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(isStateful, ColumnMetadata.named("IS_STATEFUL").withIndex(8).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(isUpdateData, ColumnMetadata.named("IS_UPDATE_DATA").withIndex(10).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(isVolatile, ColumnMetadata.named("IS_VOLATILE").withIndex(7).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(jobClassName, ColumnMetadata.named("JOB_CLASS_NAME").withIndex(5).ofType(Types.VARCHAR).withSize(250));
        addMetadata(jobData, ColumnMetadata.named("JOB_DATA").withIndex(12).ofType(Types.VARBINARY).withSize(16000));
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(requestsRecovery, ColumnMetadata.named("REQUESTS_RECOVERY").withIndex(11).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

