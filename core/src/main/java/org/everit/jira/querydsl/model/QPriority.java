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
 * QPriority is a Querydsl query type for QPriority
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPriority extends com.mysema.query.sql.RelationalPathBase<QPriority> {

    private static final long serialVersionUID = -590919068;

    public static final QPriority priority = new QPriority("PRIORITY");

    public final StringPath description = createString("description");

    public final StringPath iconurl = createString("iconurl");

    public final StringPath id = createString("id");

    public final StringPath pname = createString("pname");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final StringPath statusColor = createString("statusColor");

    public final com.mysema.query.sql.PrimaryKey<QPriority> priorityPk = createPrimaryKey(id);

    public QPriority(String variable) {
        super(QPriority.class, forVariable(variable), "PUBLIC", "PRIORITY");
        addMetadata();
    }

    public QPriority(String variable, String schema, String table) {
        super(QPriority.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPriority(Path<? extends QPriority> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PRIORITY");
        addMetadata();
    }

    public QPriority(PathMetadata<?> metadata) {
        super(QPriority.class, metadata, "PUBLIC", "PRIORITY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(iconurl, ColumnMetadata.named("ICONURL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(pname, ColumnMetadata.named("PNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(statusColor, ColumnMetadata.named("STATUS_COLOR").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

