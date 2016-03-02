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
 * QFieldlayoutschemeassociation is a Querydsl query type for QFieldlayoutschemeassociation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldlayoutschemeassociation extends com.mysema.query.sql.RelationalPathBase<QFieldlayoutschemeassociation> {

    private static final long serialVersionUID = 398422616;

    public static final QFieldlayoutschemeassociation fieldlayoutschemeassociation = new QFieldlayoutschemeassociation("FIELDLAYOUTSCHEMEASSOCIATION");

    public final NumberPath<Long> fieldlayoutscheme = createNumber("fieldlayoutscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldlayoutschemeassociation> fieldlayoutschemeassociatioPk = createPrimaryKey(id);

    public QFieldlayoutschemeassociation(String variable) {
        super(QFieldlayoutschemeassociation.class, forVariable(variable), "PUBLIC", "FIELDLAYOUTSCHEMEASSOCIATION");
        addMetadata();
    }

    public QFieldlayoutschemeassociation(String variable, String schema, String table) {
        super(QFieldlayoutschemeassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutschemeassociation(Path<? extends QFieldlayoutschemeassociation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUTSCHEMEASSOCIATION");
        addMetadata();
    }

    public QFieldlayoutschemeassociation(PathMetadata<?> metadata) {
        super(QFieldlayoutschemeassociation.class, metadata, "PUBLIC", "FIELDLAYOUTSCHEMEASSOCIATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldlayoutscheme, ColumnMetadata.named("FIELDLAYOUTSCHEME").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

