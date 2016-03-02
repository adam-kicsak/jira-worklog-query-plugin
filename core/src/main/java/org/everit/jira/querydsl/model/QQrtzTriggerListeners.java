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
 * QQrtzTriggerListeners is a Querydsl query type for QQrtzTriggerListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzTriggerListeners extends com.mysema.query.sql.RelationalPathBase<QQrtzTriggerListeners> {

    private static final long serialVersionUID = -727651666;

    public static final QQrtzTriggerListeners qrtzTriggerListeners = new QQrtzTriggerListeners("QRTZ_TRIGGER_LISTENERS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final StringPath triggerListener = createString("triggerListener");

    public final com.mysema.query.sql.PrimaryKey<QQrtzTriggerListeners> qrtzTriggerListenersPk = createPrimaryKey(id);

    public QQrtzTriggerListeners(String variable) {
        super(QQrtzTriggerListeners.class, forVariable(variable), "PUBLIC", "QRTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QQrtzTriggerListeners(String variable, String schema, String table) {
        super(QQrtzTriggerListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzTriggerListeners(Path<? extends QQrtzTriggerListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QQrtzTriggerListeners(PathMetadata<?> metadata) {
        super(QQrtzTriggerListeners.class, metadata, "PUBLIC", "QRTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(triggerListener, ColumnMetadata.named("TRIGGER_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

