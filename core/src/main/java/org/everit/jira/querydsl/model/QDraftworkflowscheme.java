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
 * QDraftworkflowscheme is a Querydsl query type for QDraftworkflowscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDraftworkflowscheme extends com.mysema.query.sql.RelationalPathBase<QDraftworkflowscheme> {

    private static final long serialVersionUID = 760071493;

    public static final QDraftworkflowscheme draftworkflowscheme = new QDraftworkflowscheme("DRAFTWORKFLOWSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastModifiedDate = createDateTime("lastModifiedDate", java.sql.Timestamp.class);

    public final StringPath lastModifiedUser = createString("lastModifiedUser");

    public final StringPath name = createString("name");

    public final NumberPath<Long> workflowSchemeId = createNumber("workflowSchemeId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QDraftworkflowscheme> draftworkflowschemePk = createPrimaryKey(id);

    public QDraftworkflowscheme(String variable) {
        super(QDraftworkflowscheme.class, forVariable(variable), "PUBLIC", "DRAFTWORKFLOWSCHEME");
        addMetadata();
    }

    public QDraftworkflowscheme(String variable, String schema, String table) {
        super(QDraftworkflowscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDraftworkflowscheme(Path<? extends QDraftworkflowscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "DRAFTWORKFLOWSCHEME");
        addMetadata();
    }

    public QDraftworkflowscheme(PathMetadata<?> metadata) {
        super(QDraftworkflowscheme.class, metadata, "PUBLIC", "DRAFTWORKFLOWSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastModifiedDate, ColumnMetadata.named("LAST_MODIFIED_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(lastModifiedUser, ColumnMetadata.named("LAST_MODIFIED_USER").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(workflowSchemeId, ColumnMetadata.named("WORKFLOW_SCHEME_ID").withIndex(4).ofType(Types.BIGINT).withSize(19));
    }

}

