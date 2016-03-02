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
 * QQrtzTriggers is a Querydsl query type for QQrtzTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzTriggers extends com.mysema.query.sql.RelationalPathBase<QQrtzTriggers> {

    private static final long serialVersionUID = -1149241342;

    public static final QQrtzTriggers qrtzTriggers = new QQrtzTriggers("QRTZ_TRIGGERS");

    public final StringPath calendarName = createString("calendarName");

    public final DateTimePath<java.sql.Timestamp> endTime = createDateTime("endTime", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> job = createNumber("job", Long.class);

    public final NumberPath<Integer> misfireInstr = createNumber("misfireInstr", Integer.class);

    public final DateTimePath<java.sql.Timestamp> nextFire = createDateTime("nextFire", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final StringPath triggerState = createString("triggerState");

    public final StringPath triggerType = createString("triggerType");

    public final com.mysema.query.sql.PrimaryKey<QQrtzTriggers> qrtzTriggersPk = createPrimaryKey(id);

    public QQrtzTriggers(String variable) {
        super(QQrtzTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_TRIGGERS");
        addMetadata();
    }

    public QQrtzTriggers(String variable, String schema, String table) {
        super(QQrtzTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzTriggers(Path<? extends QQrtzTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_TRIGGERS");
        addMetadata();
    }

    public QQrtzTriggers(PathMetadata<?> metadata) {
        super(QQrtzTriggers.class, metadata, "PUBLIC", "QRTZ_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendarName, ColumnMetadata.named("CALENDAR_NAME").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(endTime, ColumnMetadata.named("END_TIME").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(job, ColumnMetadata.named("JOB").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(misfireInstr, ColumnMetadata.named("MISFIRE_INSTR").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(nextFire, ColumnMetadata.named("NEXT_FIRE").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(startTime, ColumnMetadata.named("START_TIME").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerState, ColumnMetadata.named("TRIGGER_STATE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerType, ColumnMetadata.named("TRIGGER_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

