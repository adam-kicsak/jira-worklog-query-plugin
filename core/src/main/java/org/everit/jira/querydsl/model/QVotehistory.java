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
 * QVotehistory is a Querydsl query type for QVotehistory
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QVotehistory extends com.mysema.query.sql.RelationalPathBase<QVotehistory> {

    private static final long serialVersionUID = 457297322;

    public static final QVotehistory votehistory = new QVotehistory("VOTEHISTORY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final DateTimePath<java.sql.Timestamp> timestamp = createDateTime("timestamp", java.sql.Timestamp.class);

    public final NumberPath<Long> votes = createNumber("votes", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QVotehistory> votehistoryPk = createPrimaryKey(id);

    public QVotehistory(String variable) {
        super(QVotehistory.class, forVariable(variable), "PUBLIC", "VOTEHISTORY");
        addMetadata();
    }

    public QVotehistory(String variable, String schema, String table) {
        super(QVotehistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVotehistory(Path<? extends QVotehistory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "VOTEHISTORY");
        addMetadata();
    }

    public QVotehistory(PathMetadata<?> metadata) {
        super(QVotehistory.class, metadata, "PUBLIC", "VOTEHISTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(timestamp, ColumnMetadata.named("TIMESTAMP").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(votes, ColumnMetadata.named("VOTES").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

