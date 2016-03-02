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
 * QJiraaction is a Querydsl query type for QJiraaction
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJiraaction extends com.mysema.query.sql.RelationalPathBase<QJiraaction> {

    private static final long serialVersionUID = 2096753700;

    public static final QJiraaction jiraaction = new QJiraaction("JIRAACTION");

    public final StringPath actionbody = createString("actionbody");

    public final StringPath actionlevel = createString("actionlevel");

    public final NumberPath<Long> actionnum = createNumber("actionnum", Long.class);

    public final StringPath actiontype = createString("actiontype");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final NumberPath<Long> rolelevel = createNumber("rolelevel", Long.class);

    public final StringPath updateauthor = createString("updateauthor");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QJiraaction> jiraactionPk = createPrimaryKey(id);

    public QJiraaction(String variable) {
        super(QJiraaction.class, forVariable(variable), "PUBLIC", "JIRAACTION");
        addMetadata();
    }

    public QJiraaction(String variable, String schema, String table) {
        super(QJiraaction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraaction(Path<? extends QJiraaction> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRAACTION");
        addMetadata();
    }

    public QJiraaction(PathMetadata<?> metadata) {
        super(QJiraaction.class, metadata, "PUBLIC", "JIRAACTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionbody, ColumnMetadata.named("ACTIONBODY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(actionlevel, ColumnMetadata.named("ACTIONLEVEL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(actionnum, ColumnMetadata.named("ACTIONNUM").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(actiontype, ColumnMetadata.named("ACTIONTYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(rolelevel, ColumnMetadata.named("ROLELEVEL").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(updateauthor, ColumnMetadata.named("UPDATEAUTHOR").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

