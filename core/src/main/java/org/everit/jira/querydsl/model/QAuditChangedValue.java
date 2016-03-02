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
 * QAuditChangedValue is a Querydsl query type for QAuditChangedValue
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuditChangedValue extends com.mysema.query.sql.RelationalPathBase<QAuditChangedValue> {

    private static final long serialVersionUID = -13445672;

    public static final QAuditChangedValue auditChangedValue = new QAuditChangedValue("AUDIT_CHANGED_VALUE");

    public final StringPath deltaFrom = createString("deltaFrom");

    public final StringPath deltaTo = createString("deltaTo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> logId = createNumber("logId", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QAuditChangedValue> auditChangedValuePk = createPrimaryKey(id);

    public QAuditChangedValue(String variable) {
        super(QAuditChangedValue.class, forVariable(variable), "PUBLIC", "AUDIT_CHANGED_VALUE");
        addMetadata();
    }

    public QAuditChangedValue(String variable, String schema, String table) {
        super(QAuditChangedValue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditChangedValue(Path<? extends QAuditChangedValue> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AUDIT_CHANGED_VALUE");
        addMetadata();
    }

    public QAuditChangedValue(PathMetadata<?> metadata) {
        super(QAuditChangedValue.class, metadata, "PUBLIC", "AUDIT_CHANGED_VALUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deltaFrom, ColumnMetadata.named("DELTA_FROM").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(deltaTo, ColumnMetadata.named("DELTA_TO").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(logId, ColumnMetadata.named("LOG_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

