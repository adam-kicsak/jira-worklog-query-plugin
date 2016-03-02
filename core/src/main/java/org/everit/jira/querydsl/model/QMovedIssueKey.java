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
 * QMovedIssueKey is a Querydsl query type for QMovedIssueKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMovedIssueKey extends com.mysema.query.sql.RelationalPathBase<QMovedIssueKey> {

    private static final long serialVersionUID = -896202279;

    public static final QMovedIssueKey movedIssueKey = new QMovedIssueKey("MOVED_ISSUE_KEY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueId = createNumber("issueId", Long.class);

    public final StringPath oldIssueKey = createString("oldIssueKey");

    public final com.mysema.query.sql.PrimaryKey<QMovedIssueKey> movedIssueKeyPk = createPrimaryKey(id);

    public QMovedIssueKey(String variable) {
        super(QMovedIssueKey.class, forVariable(variable), "PUBLIC", "MOVED_ISSUE_KEY");
        addMetadata();
    }

    public QMovedIssueKey(String variable, String schema, String table) {
        super(QMovedIssueKey.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMovedIssueKey(Path<? extends QMovedIssueKey> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MOVED_ISSUE_KEY");
        addMetadata();
    }

    public QMovedIssueKey(PathMetadata<?> metadata) {
        super(QMovedIssueKey.class, metadata, "PUBLIC", "MOVED_ISSUE_KEY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueId, ColumnMetadata.named("ISSUE_ID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(oldIssueKey, ColumnMetadata.named("OLD_ISSUE_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

