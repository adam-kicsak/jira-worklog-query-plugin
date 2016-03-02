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
 * QSharepermissions is a Querydsl query type for QSharepermissions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSharepermissions extends com.mysema.query.sql.RelationalPathBase<QSharepermissions> {

    private static final long serialVersionUID = -1082694651;

    public static final QSharepermissions sharepermissions = new QSharepermissions("SHAREPERMISSIONS");

    public final NumberPath<Long> entityid = createNumber("entityid", Long.class);

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath param1 = createString("param1");

    public final StringPath param2 = createString("param2");

    public final StringPath sharetype = createString("sharetype");

    public final com.mysema.query.sql.PrimaryKey<QSharepermissions> sharepermissionsPk = createPrimaryKey(id);

    public QSharepermissions(String variable) {
        super(QSharepermissions.class, forVariable(variable), "PUBLIC", "SHAREPERMISSIONS");
        addMetadata();
    }

    public QSharepermissions(String variable, String schema, String table) {
        super(QSharepermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSharepermissions(Path<? extends QSharepermissions> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SHAREPERMISSIONS");
        addMetadata();
    }

    public QSharepermissions(PathMetadata<?> metadata) {
        super(QSharepermissions.class, metadata, "PUBLIC", "SHAREPERMISSIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entityid, ColumnMetadata.named("ENTITYID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(param1, ColumnMetadata.named("PARAM1").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(param2, ColumnMetadata.named("PARAM2").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sharetype, ColumnMetadata.named("SHARETYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

