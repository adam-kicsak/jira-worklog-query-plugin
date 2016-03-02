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
 * QWorkflowschemeentity is a Querydsl query type for QWorkflowschemeentity
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QWorkflowschemeentity extends com.mysema.query.sql.RelationalPathBase<QWorkflowschemeentity> {

    private static final long serialVersionUID = 1325820871;

    public static final QWorkflowschemeentity workflowschemeentity = new QWorkflowschemeentity("WORKFLOWSCHEMEENTITY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final StringPath workflow = createString("workflow");

    public final com.mysema.query.sql.PrimaryKey<QWorkflowschemeentity> workflowschemeentityPk = createPrimaryKey(id);

    public QWorkflowschemeentity(String variable) {
        super(QWorkflowschemeentity.class, forVariable(variable), "PUBLIC", "WORKFLOWSCHEMEENTITY");
        addMetadata();
    }

    public QWorkflowschemeentity(String variable, String schema, String table) {
        super(QWorkflowschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWorkflowschemeentity(Path<? extends QWorkflowschemeentity> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "WORKFLOWSCHEMEENTITY");
        addMetadata();
    }

    public QWorkflowschemeentity(PathMetadata<?> metadata) {
        super(QWorkflowschemeentity.class, metadata, "PUBLIC", "WORKFLOWSCHEMEENTITY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(workflow, ColumnMetadata.named("WORKFLOW").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

