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
 * QCustomfield is a Querydsl query type for QCustomfield
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCustomfield extends com.mysema.query.sql.RelationalPathBase<QCustomfield> {

    private static final long serialVersionUID = -1034876055;

    public static final QCustomfield customfield = new QCustomfield("CUSTOMFIELD");

    public final StringPath cfname = createString("cfname");

    public final StringPath customfieldsearcherkey = createString("customfieldsearcherkey");

    public final StringPath customfieldtypekey = createString("customfieldtypekey");

    public final StringPath defaultvalue = createString("defaultvalue");

    public final StringPath description = createString("description");

    public final NumberPath<Long> fieldtype = createNumber("fieldtype", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QCustomfield> customfieldPk = createPrimaryKey(id);

    public QCustomfield(String variable) {
        super(QCustomfield.class, forVariable(variable), "PUBLIC", "CUSTOMFIELD");
        addMetadata();
    }

    public QCustomfield(String variable, String schema, String table) {
        super(QCustomfield.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfield(Path<? extends QCustomfield> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CUSTOMFIELD");
        addMetadata();
    }

    public QCustomfield(PathMetadata<?> metadata) {
        super(QCustomfield.class, metadata, "PUBLIC", "CUSTOMFIELD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cfname, ColumnMetadata.named("CFNAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(customfieldsearcherkey, ColumnMetadata.named("CUSTOMFIELDSEARCHERKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(customfieldtypekey, ColumnMetadata.named("CUSTOMFIELDTYPEKEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(defaultvalue, ColumnMetadata.named("DEFAULTVALUE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldtype, ColumnMetadata.named("FIELDTYPE").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(8).ofType(Types.BIGINT).withSize(19));
    }

}

