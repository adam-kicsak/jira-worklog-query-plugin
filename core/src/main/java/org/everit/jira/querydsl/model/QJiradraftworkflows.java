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
 * QJiradraftworkflows is a Querydsl query type for QJiradraftworkflows
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJiradraftworkflows extends com.mysema.query.sql.RelationalPathBase<QJiradraftworkflows> {

    private static final long serialVersionUID = 62753793;

    public static final QJiradraftworkflows jiradraftworkflows = new QJiradraftworkflows("JIRADRAFTWORKFLOWS");

    public final StringPath descriptor = createString("descriptor");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath parentname = createString("parentname");

    public final com.mysema.query.sql.PrimaryKey<QJiradraftworkflows> jiradraftworkflowsPk = createPrimaryKey(id);

    public QJiradraftworkflows(String variable) {
        super(QJiradraftworkflows.class, forVariable(variable), "PUBLIC", "JIRADRAFTWORKFLOWS");
        addMetadata();
    }

    public QJiradraftworkflows(String variable, String schema, String table) {
        super(QJiradraftworkflows.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiradraftworkflows(Path<? extends QJiradraftworkflows> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRADRAFTWORKFLOWS");
        addMetadata();
    }

    public QJiradraftworkflows(PathMetadata<?> metadata) {
        super(QJiradraftworkflows.class, metadata, "PUBLIC", "JIRADRAFTWORKFLOWS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(descriptor, ColumnMetadata.named("DESCRIPTOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(parentname, ColumnMetadata.named("PARENTNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

