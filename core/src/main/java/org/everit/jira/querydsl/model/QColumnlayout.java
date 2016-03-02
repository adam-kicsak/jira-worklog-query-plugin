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
 * QColumnlayout is a Querydsl query type for QColumnlayout
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumnlayout extends com.mysema.query.sql.RelationalPathBase<QColumnlayout> {

    private static final long serialVersionUID = 1605363392;

    public static final QColumnlayout columnlayout = new QColumnlayout("COLUMNLAYOUT");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> searchrequest = createNumber("searchrequest", Long.class);

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QColumnlayout> columnlayoutPk = createPrimaryKey(id);

    public QColumnlayout(String variable) {
        super(QColumnlayout.class, forVariable(variable), "PUBLIC", "COLUMNLAYOUT");
        addMetadata();
    }

    public QColumnlayout(String variable, String schema, String table) {
        super(QColumnlayout.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnlayout(Path<? extends QColumnlayout> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "COLUMNLAYOUT");
        addMetadata();
    }

    public QColumnlayout(PathMetadata<?> metadata) {
        super(QColumnlayout.class, metadata, "PUBLIC", "COLUMNLAYOUT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(searchrequest, ColumnMetadata.named("SEARCHREQUEST").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

