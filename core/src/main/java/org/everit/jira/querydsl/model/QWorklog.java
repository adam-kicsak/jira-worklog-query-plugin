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
 * QWorklog is a Querydsl query type for QWorklog
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QWorklog extends com.mysema.query.sql.RelationalPathBase<QWorklog> {

    private static final long serialVersionUID = 19680723;

    public static final QWorklog worklog = new QWorklog("WORKLOG");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath grouplevel = createString("grouplevel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final NumberPath<Long> rolelevel = createNumber("rolelevel", Long.class);

    public final DateTimePath<java.sql.Timestamp> startdate = createDateTime("startdate", java.sql.Timestamp.class);

    public final NumberPath<Long> timeworked = createNumber("timeworked", Long.class);

    public final StringPath updateauthor = createString("updateauthor");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final StringPath worklogbody = createString("worklogbody");

    public final com.mysema.query.sql.PrimaryKey<QWorklog> worklogPk = createPrimaryKey(id);

    public QWorklog(String variable) {
        super(QWorklog.class, forVariable(variable), "PUBLIC", "WORKLOG");
        addMetadata();
    }

    public QWorklog(String variable, String schema, String table) {
        super(QWorklog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWorklog(Path<? extends QWorklog> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "WORKLOG");
        addMetadata();
    }

    public QWorklog(PathMetadata<?> metadata) {
        super(QWorklog.class, metadata, "PUBLIC", "WORKLOG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(grouplevel, ColumnMetadata.named("GROUPLEVEL").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(rolelevel, ColumnMetadata.named("ROLELEVEL").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(timeworked, ColumnMetadata.named("TIMEWORKED").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(updateauthor, ColumnMetadata.named("UPDATEAUTHOR").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(worklogbody, ColumnMetadata.named("WORKLOGBODY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

