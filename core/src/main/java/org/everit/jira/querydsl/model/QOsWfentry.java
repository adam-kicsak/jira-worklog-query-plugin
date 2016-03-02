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
 * QOsWfentry is a Querydsl query type for QOsWfentry
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOsWfentry extends com.mysema.query.sql.RelationalPathBase<QOsWfentry> {

    private static final long serialVersionUID = -948040769;

    public static final QOsWfentry osWfentry = new QOsWfentry("OS_WFENTRY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> initialized = createNumber("initialized", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> state = createNumber("state", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QOsWfentry> osWfentryPk = createPrimaryKey(id);

    public QOsWfentry(String variable) {
        super(QOsWfentry.class, forVariable(variable), "PUBLIC", "OS_WFENTRY");
        addMetadata();
    }

    public QOsWfentry(String variable, String schema, String table) {
        super(QOsWfentry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsWfentry(Path<? extends QOsWfentry> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_WFENTRY");
        addMetadata();
    }

    public QOsWfentry(PathMetadata<?> metadata) {
        super(QOsWfentry.class, metadata, "PUBLIC", "OS_WFENTRY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(initialized, ColumnMetadata.named("INITIALIZED").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(state, ColumnMetadata.named("STATE").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

