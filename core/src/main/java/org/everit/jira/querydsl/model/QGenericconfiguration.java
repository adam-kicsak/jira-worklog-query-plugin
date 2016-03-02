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
 * QGenericconfiguration is a Querydsl query type for QGenericconfiguration
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QGenericconfiguration extends com.mysema.query.sql.RelationalPathBase<QGenericconfiguration> {

    private static final long serialVersionUID = -960425665;

    public static final QGenericconfiguration genericconfiguration = new QGenericconfiguration("GENERICCONFIGURATION");

    public final StringPath datakey = createString("datakey");

    public final StringPath datatype = createString("datatype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath xmlvalue = createString("xmlvalue");

    public final com.mysema.query.sql.PrimaryKey<QGenericconfiguration> genericconfigurationPk = createPrimaryKey(id);

    public QGenericconfiguration(String variable) {
        super(QGenericconfiguration.class, forVariable(variable), "PUBLIC", "GENERICCONFIGURATION");
        addMetadata();
    }

    public QGenericconfiguration(String variable, String schema, String table) {
        super(QGenericconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGenericconfiguration(Path<? extends QGenericconfiguration> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "GENERICCONFIGURATION");
        addMetadata();
    }

    public QGenericconfiguration(PathMetadata<?> metadata) {
        super(QGenericconfiguration.class, metadata, "PUBLIC", "GENERICCONFIGURATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(datakey, ColumnMetadata.named("DATAKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(datatype, ColumnMetadata.named("DATATYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(xmlvalue, ColumnMetadata.named("XMLVALUE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

