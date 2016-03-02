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
 * QChangegroup is a Querydsl query type for QChangegroup
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QChangegroup extends com.mysema.query.sql.RelationalPathBase<QChangegroup> {

    private static final long serialVersionUID = -910612465;

    public static final QChangegroup changegroup = new QChangegroup("CHANGEGROUP");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QChangegroup> changegroupPk = createPrimaryKey(id);

    public QChangegroup(String variable) {
        super(QChangegroup.class, forVariable(variable), "PUBLIC", "CHANGEGROUP");
        addMetadata();
    }

    public QChangegroup(String variable, String schema, String table) {
        super(QChangegroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChangegroup(Path<? extends QChangegroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CHANGEGROUP");
        addMetadata();
    }

    public QChangegroup(PathMetadata<?> metadata) {
        super(QChangegroup.class, metadata, "PUBLIC", "CHANGEGROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

