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
 * QChangeitem is a Querydsl query type for QChangeitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QChangeitem extends com.mysema.query.sql.RelationalPathBase<QChangeitem> {

    private static final long serialVersionUID = 247781251;

    public static final QChangeitem changeitem = new QChangeitem("CHANGEITEM");

    public final StringPath field = createString("field");

    public final StringPath fieldtype = createString("fieldtype");

    public final NumberPath<Long> groupid = createNumber("groupid", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath newstring = createString("newstring");

    public final StringPath newvalue = createString("newvalue");

    public final StringPath oldstring = createString("oldstring");

    public final StringPath oldvalue = createString("oldvalue");

    public final com.mysema.query.sql.PrimaryKey<QChangeitem> changeitemPk = createPrimaryKey(id);

    public QChangeitem(String variable) {
        super(QChangeitem.class, forVariable(variable), "PUBLIC", "CHANGEITEM");
        addMetadata();
    }

    public QChangeitem(String variable, String schema, String table) {
        super(QChangeitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChangeitem(Path<? extends QChangeitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CHANGEITEM");
        addMetadata();
    }

    public QChangeitem(PathMetadata<?> metadata) {
        super(QChangeitem.class, metadata, "PUBLIC", "CHANGEITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(field, ColumnMetadata.named("FIELD").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldtype, ColumnMetadata.named("FIELDTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(groupid, ColumnMetadata.named("GROUPID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(newstring, ColumnMetadata.named("NEWSTRING").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(newvalue, ColumnMetadata.named("NEWVALUE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(oldstring, ColumnMetadata.named("OLDSTRING").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(oldvalue, ColumnMetadata.named("OLDVALUE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

