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
 * QAuditLog is a Querydsl query type for QAuditLog
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuditLog extends com.mysema.query.sql.RelationalPathBase<QAuditLog> {

    private static final long serialVersionUID = 1550585385;

    public static final QAuditLog auditLog = new QAuditLog("AUDIT_LOG");

    public final StringPath authorKey = createString("authorKey");

    public final NumberPath<Integer> authorType = createNumber("authorType", Integer.class);

    public final StringPath category = createString("category");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final StringPath eventSourceName = createString("eventSourceName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath objectId = createString("objectId");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectParentId = createString("objectParentId");

    public final StringPath objectParentName = createString("objectParentName");

    public final StringPath objectType = createString("objectType");

    public final StringPath remoteAddress = createString("remoteAddress");

    public final StringPath searchField = createString("searchField");

    public final StringPath summary = createString("summary");

    public final com.mysema.query.sql.PrimaryKey<QAuditLog> auditLogPk = createPrimaryKey(id);

    public QAuditLog(String variable) {
        super(QAuditLog.class, forVariable(variable), "PUBLIC", "AUDIT_LOG");
        addMetadata();
    }

    public QAuditLog(String variable, String schema, String table) {
        super(QAuditLog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditLog(Path<? extends QAuditLog> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AUDIT_LOG");
        addMetadata();
    }

    public QAuditLog(PathMetadata<?> metadata) {
        super(QAuditLog.class, metadata, "PUBLIC", "AUDIT_LOG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorKey, ColumnMetadata.named("AUTHOR_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(authorType, ColumnMetadata.named("AUTHOR_TYPE").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(category, ColumnMetadata.named("CATEGORY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(14).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(eventSourceName, ColumnMetadata.named("EVENT_SOURCE_NAME").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(objectId, ColumnMetadata.named("OBJECT_ID").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectName, ColumnMetadata.named("OBJECT_NAME").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectParentId, ColumnMetadata.named("OBJECT_PARENT_ID").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectParentName, ColumnMetadata.named("OBJECT_PARENT_NAME").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectType, ColumnMetadata.named("OBJECT_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(remoteAddress, ColumnMetadata.named("REMOTE_ADDRESS").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(searchField, ColumnMetadata.named("SEARCH_FIELD").withIndex(15).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(summary, ColumnMetadata.named("SUMMARY").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

