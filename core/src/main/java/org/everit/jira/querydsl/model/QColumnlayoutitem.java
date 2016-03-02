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
 * QColumnlayoutitem is a Querydsl query type for QColumnlayoutitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumnlayoutitem extends com.mysema.query.sql.RelationalPathBase<QColumnlayoutitem> {

    private static final long serialVersionUID = -1542454829;

    public static final QColumnlayoutitem columnlayoutitem = new QColumnlayoutitem("COLUMNLAYOUTITEM");

    public final NumberPath<Long> columnlayout = createNumber("columnlayout", Long.class);

    public final StringPath fieldidentifier = createString("fieldidentifier");

    public final NumberPath<Long> horizontalposition = createNumber("horizontalposition", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QColumnlayoutitem> columnlayoutitemPk = createPrimaryKey(id);

    public QColumnlayoutitem(String variable) {
        super(QColumnlayoutitem.class, forVariable(variable), "PUBLIC", "COLUMNLAYOUTITEM");
        addMetadata();
    }

    public QColumnlayoutitem(String variable, String schema, String table) {
        super(QColumnlayoutitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnlayoutitem(Path<? extends QColumnlayoutitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "COLUMNLAYOUTITEM");
        addMetadata();
    }

    public QColumnlayoutitem(PathMetadata<?> metadata) {
        super(QColumnlayoutitem.class, metadata, "PUBLIC", "COLUMNLAYOUTITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnlayout, ColumnMetadata.named("COLUMNLAYOUT").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(fieldidentifier, ColumnMetadata.named("FIELDIDENTIFIER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(horizontalposition, ColumnMetadata.named("HORIZONTALPOSITION").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

