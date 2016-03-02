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
 * QFieldscreen is a Querydsl query type for QFieldscreen
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldscreen extends com.mysema.query.sql.RelationalPathBase<QFieldscreen> {

    private static final long serialVersionUID = 1996010790;

    public static final QFieldscreen fieldscreen = new QFieldscreen("FIELDSCREEN");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QFieldscreen> fieldscreenPk = createPrimaryKey(id);

    public QFieldscreen(String variable) {
        super(QFieldscreen.class, forVariable(variable), "PUBLIC", "FIELDSCREEN");
        addMetadata();
    }

    public QFieldscreen(String variable, String schema, String table) {
        super(QFieldscreen.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreen(Path<? extends QFieldscreen> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREEN");
        addMetadata();
    }

    public QFieldscreen(PathMetadata<?> metadata) {
        super(QFieldscreen.class, metadata, "PUBLIC", "FIELDSCREEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

