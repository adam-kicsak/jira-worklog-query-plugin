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
 * QFieldlayout is a Querydsl query type for QFieldlayout
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldlayout extends com.mysema.query.sql.RelationalPathBase<QFieldlayout> {

    private static final long serialVersionUID = 1793978340;

    public static final QFieldlayout fieldlayout = new QFieldlayout("FIELDLAYOUT");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> layoutscheme = createNumber("layoutscheme", Long.class);

    public final StringPath layoutType = createString("layoutType");

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QFieldlayout> fieldlayoutPk = createPrimaryKey(id);

    public QFieldlayout(String variable) {
        super(QFieldlayout.class, forVariable(variable), "PUBLIC", "FIELDLAYOUT");
        addMetadata();
    }

    public QFieldlayout(String variable, String schema, String table) {
        super(QFieldlayout.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayout(Path<? extends QFieldlayout> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUT");
        addMetadata();
    }

    public QFieldlayout(PathMetadata<?> metadata) {
        super(QFieldlayout.class, metadata, "PUBLIC", "FIELDLAYOUT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(layoutscheme, ColumnMetadata.named("LAYOUTSCHEME").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(layoutType, ColumnMetadata.named("LAYOUT_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

