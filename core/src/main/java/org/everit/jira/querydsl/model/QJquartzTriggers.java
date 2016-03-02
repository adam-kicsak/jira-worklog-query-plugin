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
 * QJquartzTriggers is a Querydsl query type for QJquartzTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzTriggers extends com.mysema.query.sql.RelationalPathBase<QJquartzTriggers> {

    private static final long serialVersionUID = 846725024;

    public static final QJquartzTriggers jquartzTriggers = new QJquartzTriggers("JQUARTZ_TRIGGERS");

    public final StringPath calendarName = createString("calendarName");

    public final StringPath description = createString("description");

    public final NumberPath<Long> endTime = createNumber("endTime", Long.class);

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final SimplePath<byte[]> jobData = createSimple("jobData", byte[].class);

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final NumberPath<Byte> misfireInstr = createNumber("misfireInstr", Byte.class);

    public final NumberPath<Long> nextFireTime = createNumber("nextFireTime", Long.class);

    public final NumberPath<Long> prevFireTime = createNumber("prevFireTime", Long.class);

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final StringPath schedName = createString("schedName");

    public final NumberPath<Long> startTime = createNumber("startTime", Long.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final StringPath triggerState = createString("triggerState");

    public final StringPath triggerType = createString("triggerType");

    public final com.mysema.query.sql.PrimaryKey<QJquartzTriggers> jquartzTriggersPk = createPrimaryKey(triggerGroup, triggerName);

    public QJquartzTriggers(String variable) {
        super(QJquartzTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_TRIGGERS");
        addMetadata();
    }

    public QJquartzTriggers(String variable, String schema, String table) {
        super(QJquartzTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzTriggers(Path<? extends QJquartzTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_TRIGGERS");
        addMetadata();
    }

    public QJquartzTriggers(PathMetadata<?> metadata) {
        super(QJquartzTriggers.class, metadata, "PUBLIC", "JQUARTZ_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendarName, ColumnMetadata.named("CALENDAR_NAME").withIndex(15).ofType(Types.VARCHAR).withSize(200));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(7).ofType(Types.VARCHAR).withSize(250));
        addMetadata(endTime, ColumnMetadata.named("END_TIME").withIndex(14).ofType(Types.DECIMAL).withSize(13));
        addMetadata(isVolatile, ColumnMetadata.named("IS_VOLATILE").withIndex(6).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(jobData, ColumnMetadata.named("JOB_DATA").withIndex(17).ofType(Types.VARBINARY).withSize(16000));
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(5).ofType(Types.VARCHAR).withSize(200));
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(misfireInstr, ColumnMetadata.named("MISFIRE_INSTR").withIndex(16).ofType(Types.DECIMAL).withSize(2));
        addMetadata(nextFireTime, ColumnMetadata.named("NEXT_FIRE_TIME").withIndex(8).ofType(Types.DECIMAL).withSize(13));
        addMetadata(prevFireTime, ColumnMetadata.named("PREV_FIRE_TIME").withIndex(9).ofType(Types.DECIMAL).withSize(13));
        addMetadata(priority, ColumnMetadata.named("PRIORITY").withIndex(10).ofType(Types.DECIMAL).withSize(9));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(startTime, ColumnMetadata.named("START_TIME").withIndex(13).ofType(Types.DECIMAL).withSize(13));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerState, ColumnMetadata.named("TRIGGER_STATE").withIndex(11).ofType(Types.VARCHAR).withSize(16));
        addMetadata(triggerType, ColumnMetadata.named("TRIGGER_TYPE").withIndex(12).ofType(Types.VARCHAR).withSize(8));
    }

}

