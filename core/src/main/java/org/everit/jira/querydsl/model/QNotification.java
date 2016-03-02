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
 * QNotification is a Querydsl query type for QNotification
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QNotification extends com.mysema.query.sql.RelationalPathBase<QNotification> {

    private static final long serialVersionUID = 1952643499;

    public static final QNotification notification = new QNotification("NOTIFICATION");

    public final StringPath event = createString("event");

    public final NumberPath<Long> eventTypeId = createNumber("eventTypeId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notifParameter = createString("notifParameter");

    public final StringPath notifType = createString("notifType");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final NumberPath<Long> templateId = createNumber("templateId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QNotification> notificationPk = createPrimaryKey(id);

    public QNotification(String variable) {
        super(QNotification.class, forVariable(variable), "PUBLIC", "NOTIFICATION");
        addMetadata();
    }

    public QNotification(String variable, String schema, String table) {
        super(QNotification.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNotification(Path<? extends QNotification> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NOTIFICATION");
        addMetadata();
    }

    public QNotification(PathMetadata<?> metadata) {
        super(QNotification.class, metadata, "PUBLIC", "NOTIFICATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(event, ColumnMetadata.named("EVENT").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(eventTypeId, ColumnMetadata.named("EVENT_TYPE_ID").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(notifParameter, ColumnMetadata.named("NOTIF_PARAMETER").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(notifType, ColumnMetadata.named("NOTIF_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(templateId, ColumnMetadata.named("TEMPLATE_ID").withIndex(5).ofType(Types.BIGINT).withSize(19));
    }

}

