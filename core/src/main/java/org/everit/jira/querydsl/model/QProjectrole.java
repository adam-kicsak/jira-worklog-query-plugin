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
 * QProjectrole is a Querydsl query type for QProjectrole
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProjectrole extends com.mysema.query.sql.RelationalPathBase<QProjectrole> {

    private static final long serialVersionUID = -202437041;

    public static final QProjectrole projectrole = new QProjectrole("PROJECTROLE");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QProjectrole> projectrolePk = createPrimaryKey(id);

    public QProjectrole(String variable) {
        super(QProjectrole.class, forVariable(variable), "PUBLIC", "PROJECTROLE");
        addMetadata();
    }

    public QProjectrole(String variable, String schema, String table) {
        super(QProjectrole.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectrole(Path<? extends QProjectrole> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECTROLE");
        addMetadata();
    }

    public QProjectrole(PathMetadata<?> metadata) {
        super(QProjectrole.class, metadata, "PUBLIC", "PROJECTROLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

