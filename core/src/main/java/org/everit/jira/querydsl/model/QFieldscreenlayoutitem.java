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
 * QFieldscreenlayoutitem is a Querydsl query type for QFieldscreenlayoutitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldscreenlayoutitem extends com.mysema.query.sql.RelationalPathBase<QFieldscreenlayoutitem> {

    private static final long serialVersionUID = 28561123;

    public static final QFieldscreenlayoutitem fieldscreenlayoutitem = new QFieldscreenlayoutitem("FIELDSCREENLAYOUTITEM");

    public final StringPath fieldidentifier = createString("fieldidentifier");

    public final NumberPath<Long> fieldscreentab = createNumber("fieldscreentab", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldscreenlayoutitem> fieldscreenlayoutitemPk = createPrimaryKey(id);

    public QFieldscreenlayoutitem(String variable) {
        super(QFieldscreenlayoutitem.class, forVariable(variable), "PUBLIC", "FIELDSCREENLAYOUTITEM");
        addMetadata();
    }

    public QFieldscreenlayoutitem(String variable, String schema, String table) {
        super(QFieldscreenlayoutitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreenlayoutitem(Path<? extends QFieldscreenlayoutitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREENLAYOUTITEM");
        addMetadata();
    }

    public QFieldscreenlayoutitem(PathMetadata<?> metadata) {
        super(QFieldscreenlayoutitem.class, metadata, "PUBLIC", "FIELDSCREENLAYOUTITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldidentifier, ColumnMetadata.named("FIELDIDENTIFIER").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldscreentab, ColumnMetadata.named("FIELDSCREENTAB").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

