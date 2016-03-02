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
 * QFieldscreenschemeitem is a Querydsl query type for QFieldscreenschemeitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldscreenschemeitem extends com.mysema.query.sql.RelationalPathBase<QFieldscreenschemeitem> {

    private static final long serialVersionUID = -757967906;

    public static final QFieldscreenschemeitem fieldscreenschemeitem = new QFieldscreenschemeitem("FIELDSCREENSCHEMEITEM");

    public final NumberPath<Long> fieldscreen = createNumber("fieldscreen", Long.class);

    public final NumberPath<Long> fieldscreenscheme = createNumber("fieldscreenscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> operation = createNumber("operation", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldscreenschemeitem> fieldscreenschemeitemPk = createPrimaryKey(id);

    public QFieldscreenschemeitem(String variable) {
        super(QFieldscreenschemeitem.class, forVariable(variable), "PUBLIC", "FIELDSCREENSCHEMEITEM");
        addMetadata();
    }

    public QFieldscreenschemeitem(String variable, String schema, String table) {
        super(QFieldscreenschemeitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreenschemeitem(Path<? extends QFieldscreenschemeitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREENSCHEMEITEM");
        addMetadata();
    }

    public QFieldscreenschemeitem(PathMetadata<?> metadata) {
        super(QFieldscreenschemeitem.class, metadata, "PUBLIC", "FIELDSCREENSCHEMEITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldscreen, ColumnMetadata.named("FIELDSCREEN").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(fieldscreenscheme, ColumnMetadata.named("FIELDSCREENSCHEME").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(operation, ColumnMetadata.named("OPERATION").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

