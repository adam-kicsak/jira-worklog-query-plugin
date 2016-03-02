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
 * QJquartzSchedulerState is a Querydsl query type for QJquartzSchedulerState
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzSchedulerState extends com.mysema.query.sql.RelationalPathBase<QJquartzSchedulerState> {

    private static final long serialVersionUID = 1878535867;

    public static final QJquartzSchedulerState jquartzSchedulerState = new QJquartzSchedulerState("JQUARTZ_SCHEDULER_STATE");

    public final NumberPath<Long> checkinInterval = createNumber("checkinInterval", Long.class);

    public final StringPath instanceName = createString("instanceName");

    public final NumberPath<Long> lastCheckinTime = createNumber("lastCheckinTime", Long.class);

    public final StringPath schedName = createString("schedName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzSchedulerState> jquartzSchedulerStatePk = createPrimaryKey(instanceName);

    public QJquartzSchedulerState(String variable) {
        super(QJquartzSchedulerState.class, forVariable(variable), "PUBLIC", "JQUARTZ_SCHEDULER_STATE");
        addMetadata();
    }

    public QJquartzSchedulerState(String variable, String schema, String table) {
        super(QJquartzSchedulerState.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzSchedulerState(Path<? extends QJquartzSchedulerState> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_SCHEDULER_STATE");
        addMetadata();
    }

    public QJquartzSchedulerState(PathMetadata<?> metadata) {
        super(QJquartzSchedulerState.class, metadata, "PUBLIC", "JQUARTZ_SCHEDULER_STATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(checkinInterval, ColumnMetadata.named("CHECKIN_INTERVAL").withIndex(4).ofType(Types.DECIMAL).withSize(13));
        addMetadata(instanceName, ColumnMetadata.named("INSTANCE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(lastCheckinTime, ColumnMetadata.named("LAST_CHECKIN_TIME").withIndex(3).ofType(Types.DECIMAL).withSize(13));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

