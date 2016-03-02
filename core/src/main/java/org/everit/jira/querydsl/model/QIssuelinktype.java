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
 * QIssuelinktype is a Querydsl query type for QIssuelinktype
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuelinktype extends com.mysema.query.sql.RelationalPathBase<QIssuelinktype> {

    private static final long serialVersionUID = 1664751949;

    public static final QIssuelinktype issuelinktype = new QIssuelinktype("ISSUELINKTYPE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath inward = createString("inward");

    public final StringPath linkname = createString("linkname");

    public final StringPath outward = createString("outward");

    public final StringPath pstyle = createString("pstyle");

    public final com.mysema.query.sql.PrimaryKey<QIssuelinktype> issuelinktypePk = createPrimaryKey(id);

    public QIssuelinktype(String variable) {
        super(QIssuelinktype.class, forVariable(variable), "PUBLIC", "ISSUELINKTYPE");
        addMetadata();
    }

    public QIssuelinktype(String variable, String schema, String table) {
        super(QIssuelinktype.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuelinktype(Path<? extends QIssuelinktype> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUELINKTYPE");
        addMetadata();
    }

    public QIssuelinktype(PathMetadata<?> metadata) {
        super(QIssuelinktype.class, metadata, "PUBLIC", "ISSUELINKTYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(inward, ColumnMetadata.named("INWARD").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(linkname, ColumnMetadata.named("LINKNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(outward, ColumnMetadata.named("OUTWARD").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pstyle, ColumnMetadata.named("PSTYLE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

