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
 * QIssuesecurityscheme is a Querydsl query type for QIssuesecurityscheme
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuesecurityscheme extends com.mysema.query.sql.RelationalPathBase<QIssuesecurityscheme> {

    private static final long serialVersionUID = 1117596990;

    public static final QIssuesecurityscheme issuesecurityscheme = new QIssuesecurityscheme("ISSUESECURITYSCHEME");

    public final NumberPath<Long> defaultlevel = createNumber("defaultlevel", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QIssuesecurityscheme> issuesecurityschemePk = createPrimaryKey(id);

    public QIssuesecurityscheme(String variable) {
        super(QIssuesecurityscheme.class, forVariable(variable), "PUBLIC", "ISSUESECURITYSCHEME");
        addMetadata();
    }

    public QIssuesecurityscheme(String variable, String schema, String table) {
        super(QIssuesecurityscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuesecurityscheme(Path<? extends QIssuesecurityscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUESECURITYSCHEME");
        addMetadata();
    }

    public QIssuesecurityscheme(PathMetadata<?> metadata) {
        super(QIssuesecurityscheme.class, metadata, "PUBLIC", "ISSUESECURITYSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultlevel, ColumnMetadata.named("DEFAULTLEVEL").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

