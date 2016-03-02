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
 * QUserpickerfiltergroup is a Querydsl query type for QUserpickerfiltergroup
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserpickerfiltergroup extends com.mysema.query.sql.RelationalPathBase<QUserpickerfiltergroup> {

    private static final long serialVersionUID = 1381593998;

    public static final QUserpickerfiltergroup userpickerfiltergroup = new QUserpickerfiltergroup("USERPICKERFILTERGROUP");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> userpickerfilter = createNumber("userpickerfilter", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QUserpickerfiltergroup> userpickerfiltergroupPk = createPrimaryKey(id);

    public QUserpickerfiltergroup(String variable) {
        super(QUserpickerfiltergroup.class, forVariable(variable), "PUBLIC", "USERPICKERFILTERGROUP");
        addMetadata();
    }

    public QUserpickerfiltergroup(String variable, String schema, String table) {
        super(QUserpickerfiltergroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfiltergroup(Path<? extends QUserpickerfiltergroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERPICKERFILTERGROUP");
        addMetadata();
    }

    public QUserpickerfiltergroup(PathMetadata<?> metadata) {
        super(QUserpickerfiltergroup.class, metadata, "PUBLIC", "USERPICKERFILTERGROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupname, ColumnMetadata.named("GROUPNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userpickerfilter, ColumnMetadata.named("USERPICKERFILTER").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

