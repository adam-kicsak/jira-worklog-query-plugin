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
 * QProjectKey is a Querydsl query type for QProjectKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProjectKey extends com.mysema.query.sql.RelationalPathBase<QProjectKey> {

    private static final long serialVersionUID = 409073990;

    public static final QProjectKey projectKey1 = new QProjectKey("PROJECT_KEY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectId = createNumber("projectId", Long.class);

    public final StringPath projectKey = createString("projectKey");

    public final com.mysema.query.sql.PrimaryKey<QProjectKey> projectKeyPk = createPrimaryKey(id);

    public QProjectKey(String variable) {
        super(QProjectKey.class, forVariable(variable), "PUBLIC", "PROJECT_KEY");
        addMetadata();
    }

    public QProjectKey(String variable, String schema, String table) {
        super(QProjectKey.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectKey(Path<? extends QProjectKey> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECT_KEY");
        addMetadata();
    }

    public QProjectKey(PathMetadata<?> metadata) {
        super(QProjectKey.class, metadata, "PUBLIC", "PROJECT_KEY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(projectId, ColumnMetadata.named("PROJECT_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(projectKey, ColumnMetadata.named("PROJECT_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

