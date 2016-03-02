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
 * QComponent is a Querydsl query type for QComponent
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QComponent extends com.mysema.query.sql.RelationalPathBase<QComponent> {

    private static final long serialVersionUID = -768973763;

    public static final QComponent component = new QComponent("COMPONENT");

    public final NumberPath<Long> assigneetype = createNumber("assigneetype", Long.class);

    public final StringPath cname = createString("cname");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lead = createString("lead");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath url = createString("url");

    public final com.mysema.query.sql.PrimaryKey<QComponent> componentPk = createPrimaryKey(id);

    public QComponent(String variable) {
        super(QComponent.class, forVariable(variable), "PUBLIC", "COMPONENT");
        addMetadata();
    }

    public QComponent(String variable, String schema, String table) {
        super(QComponent.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QComponent(Path<? extends QComponent> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "COMPONENT");
        addMetadata();
    }

    public QComponent(PathMetadata<?> metadata) {
        super(QComponent.class, metadata, "PUBLIC", "COMPONENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assigneetype, ColumnMetadata.named("ASSIGNEETYPE").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(cname, ColumnMetadata.named("CNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lead, ColumnMetadata.named("LEAD").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

