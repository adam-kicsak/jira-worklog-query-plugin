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
 * QFieldconfigschemeissuetype is a Querydsl query type for QFieldconfigschemeissuetype
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldconfigschemeissuetype extends com.mysema.query.sql.RelationalPathBase<QFieldconfigschemeissuetype> {

    private static final long serialVersionUID = -2059827182;

    public static final QFieldconfigschemeissuetype fieldconfigschemeissuetype = new QFieldconfigschemeissuetype("FIELDCONFIGSCHEMEISSUETYPE");

    public final NumberPath<Long> fieldconfigscheme = createNumber("fieldconfigscheme", Long.class);

    public final NumberPath<Long> fieldconfiguration = createNumber("fieldconfiguration", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final com.mysema.query.sql.PrimaryKey<QFieldconfigschemeissuetype> fieldconfigschemeissuetypePk = createPrimaryKey(id);

    public QFieldconfigschemeissuetype(String variable) {
        super(QFieldconfigschemeissuetype.class, forVariable(variable), "PUBLIC", "FIELDCONFIGSCHEMEISSUETYPE");
        addMetadata();
    }

    public QFieldconfigschemeissuetype(String variable, String schema, String table) {
        super(QFieldconfigschemeissuetype.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldconfigschemeissuetype(Path<? extends QFieldconfigschemeissuetype> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDCONFIGSCHEMEISSUETYPE");
        addMetadata();
    }

    public QFieldconfigschemeissuetype(PathMetadata<?> metadata) {
        super(QFieldconfigschemeissuetype.class, metadata, "PUBLIC", "FIELDCONFIGSCHEMEISSUETYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldconfigscheme, ColumnMetadata.named("FIELDCONFIGSCHEME").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(fieldconfiguration, ColumnMetadata.named("FIELDCONFIGURATION").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

