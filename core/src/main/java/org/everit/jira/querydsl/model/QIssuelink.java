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
 * QIssuelink is a Querydsl query type for QIssuelink
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuelink extends com.mysema.query.sql.RelationalPathBase<QIssuelink> {

    private static final long serialVersionUID = 816417683;

    public static final QIssuelink issuelink = new QIssuelink("ISSUELINK");

    public final NumberPath<Long> destination = createNumber("destination", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> linktype = createNumber("linktype", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final NumberPath<Long> source = createNumber("source", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QIssuelink> issuelinkPk = createPrimaryKey(id);

    public QIssuelink(String variable) {
        super(QIssuelink.class, forVariable(variable), "PUBLIC", "ISSUELINK");
        addMetadata();
    }

    public QIssuelink(String variable, String schema, String table) {
        super(QIssuelink.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuelink(Path<? extends QIssuelink> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUELINK");
        addMetadata();
    }

    public QIssuelink(PathMetadata<?> metadata) {
        super(QIssuelink.class, metadata, "PUBLIC", "ISSUELINK");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(destination, ColumnMetadata.named("DESTINATION").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(linktype, ColumnMetadata.named("LINKTYPE").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(source, ColumnMetadata.named("SOURCE").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

