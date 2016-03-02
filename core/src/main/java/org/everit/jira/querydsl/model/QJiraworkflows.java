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
 * QJiraworkflows is a Querydsl query type for QJiraworkflows
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJiraworkflows extends com.mysema.query.sql.RelationalPathBase<QJiraworkflows> {

    private static final long serialVersionUID = -716323866;

    public static final QJiraworkflows jiraworkflows = new QJiraworkflows("JIRAWORKFLOWS");

    public final StringPath creatorname = createString("creatorname");

    public final StringPath descriptor = createString("descriptor");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath islocked = createString("islocked");

    public final StringPath workflowname = createString("workflowname");

    public final com.mysema.query.sql.PrimaryKey<QJiraworkflows> jiraworkflowsPk = createPrimaryKey(id);

    public QJiraworkflows(String variable) {
        super(QJiraworkflows.class, forVariable(variable), "PUBLIC", "JIRAWORKFLOWS");
        addMetadata();
    }

    public QJiraworkflows(String variable, String schema, String table) {
        super(QJiraworkflows.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraworkflows(Path<? extends QJiraworkflows> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRAWORKFLOWS");
        addMetadata();
    }

    public QJiraworkflows(PathMetadata<?> metadata) {
        super(QJiraworkflows.class, metadata, "PUBLIC", "JIRAWORKFLOWS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creatorname, ColumnMetadata.named("CREATORNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(descriptor, ColumnMetadata.named("DESCRIPTOR").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(islocked, ColumnMetadata.named("ISLOCKED").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(workflowname, ColumnMetadata.named("WORKFLOWNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

