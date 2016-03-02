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
 * QQrtzSimpleTriggers is a Querydsl query type for QQrtzSimpleTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzSimpleTriggers extends com.mysema.query.sql.RelationalPathBase<QQrtzSimpleTriggers> {

    private static final long serialVersionUID = -2030523756;

    public static final QQrtzSimpleTriggers qrtzSimpleTriggers = new QQrtzSimpleTriggers("QRTZ_SIMPLE_TRIGGERS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> repeatCount = createNumber("repeatCount", Integer.class);

    public final NumberPath<Long> repeatInterval = createNumber("repeatInterval", Long.class);

    public final NumberPath<Integer> timesTriggered = createNumber("timesTriggered", Integer.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QQrtzSimpleTriggers> qrtzSimpleTriggersPk = createPrimaryKey(id);

    public QQrtzSimpleTriggers(String variable) {
        super(QQrtzSimpleTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public QQrtzSimpleTriggers(String variable, String schema, String table) {
        super(QQrtzSimpleTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzSimpleTriggers(Path<? extends QQrtzSimpleTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public QQrtzSimpleTriggers(PathMetadata<?> metadata) {
        super(QQrtzSimpleTriggers.class, metadata, "PUBLIC", "QRTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(repeatCount, ColumnMetadata.named("REPEAT_COUNT").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(repeatInterval, ColumnMetadata.named("REPEAT_INTERVAL").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(timesTriggered, ColumnMetadata.named("TIMES_TRIGGERED").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

