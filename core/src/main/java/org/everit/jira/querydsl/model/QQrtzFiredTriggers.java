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
 * QQrtzFiredTriggers is a Querydsl query type for QQrtzFiredTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzFiredTriggers extends com.mysema.query.sql.RelationalPathBase<QQrtzFiredTriggers> {

    private static final long serialVersionUID = 641533666;

    public static final QQrtzFiredTriggers qrtzFiredTriggers = new QQrtzFiredTriggers("QRTZ_FIRED_TRIGGERS");

    public final StringPath entryId = createString("entryId");

    public final DateTimePath<java.sql.Timestamp> firedTime = createDateTime("firedTime", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final StringPath triggerListener = createString("triggerListener");

    public final StringPath triggerState = createString("triggerState");

    public final com.mysema.query.sql.PrimaryKey<QQrtzFiredTriggers> qrtzFiredTriggersPk = createPrimaryKey(entryId);

    public QQrtzFiredTriggers(String variable) {
        super(QQrtzFiredTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_FIRED_TRIGGERS");
        addMetadata();
    }

    public QQrtzFiredTriggers(String variable, String schema, String table) {
        super(QQrtzFiredTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzFiredTriggers(Path<? extends QQrtzFiredTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_FIRED_TRIGGERS");
        addMetadata();
    }

    public QQrtzFiredTriggers(PathMetadata<?> metadata) {
        super(QQrtzFiredTriggers.class, metadata, "PUBLIC", "QRTZ_FIRED_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entryId, ColumnMetadata.named("ENTRY_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(firedTime, ColumnMetadata.named("FIRED_TIME").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(triggerListener, ColumnMetadata.named("TRIGGER_LISTENER").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(triggerState, ColumnMetadata.named("TRIGGER_STATE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

