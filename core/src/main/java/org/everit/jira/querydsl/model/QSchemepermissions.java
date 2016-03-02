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
 * QSchemepermissions is a Querydsl query type for QSchemepermissions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemepermissions extends com.mysema.query.sql.RelationalPathBase<QSchemepermissions> {

    private static final long serialVersionUID = 1447967999;

    public static final QSchemepermissions schemepermissions = new QSchemepermissions("SCHEMEPERMISSIONS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> permission = createNumber("permission", Long.class);

    public final StringPath permissionKey = createString("permissionKey");

    public final StringPath permParameter = createString("permParameter");

    public final StringPath permType = createString("permType");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QSchemepermissions> schemepermissionsPk = createPrimaryKey(id);

    public QSchemepermissions(String variable) {
        super(QSchemepermissions.class, forVariable(variable), "PUBLIC", "SCHEMEPERMISSIONS");
        addMetadata();
    }

    public QSchemepermissions(String variable, String schema, String table) {
        super(QSchemepermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemepermissions(Path<? extends QSchemepermissions> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SCHEMEPERMISSIONS");
        addMetadata();
    }

    public QSchemepermissions(PathMetadata<?> metadata) {
        super(QSchemepermissions.class, metadata, "PUBLIC", "SCHEMEPERMISSIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(permission, ColumnMetadata.named("PERMISSION").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(permissionKey, ColumnMetadata.named("PERMISSION_KEY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(permParameter, ColumnMetadata.named("PERM_PARAMETER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(permType, ColumnMetadata.named("PERM_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

