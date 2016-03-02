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
 * QClusterlockstatus is a Querydsl query type for QClusterlockstatus
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QClusterlockstatus extends com.mysema.query.sql.RelationalPathBase<QClusterlockstatus> {

    private static final long serialVersionUID = 531968407;

    public static final QClusterlockstatus clusterlockstatus = new QClusterlockstatus("CLUSTERLOCKSTATUS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lockedByNode = createString("lockedByNode");

    public final StringPath lockName = createString("lockName");

    public final NumberPath<Long> updateTime = createNumber("updateTime", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QClusterlockstatus> clusterlockstatusPk = createPrimaryKey(id);

    public QClusterlockstatus(String variable) {
        super(QClusterlockstatus.class, forVariable(variable), "PUBLIC", "CLUSTERLOCKSTATUS");
        addMetadata();
    }

    public QClusterlockstatus(String variable, String schema, String table) {
        super(QClusterlockstatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusterlockstatus(Path<? extends QClusterlockstatus> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTERLOCKSTATUS");
        addMetadata();
    }

    public QClusterlockstatus(PathMetadata<?> metadata) {
        super(QClusterlockstatus.class, metadata, "PUBLIC", "CLUSTERLOCKSTATUS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lockedByNode, ColumnMetadata.named("LOCKED_BY_NODE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lockName, ColumnMetadata.named("LOCK_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updateTime, ColumnMetadata.named("UPDATE_TIME").withIndex(4).ofType(Types.BIGINT).withSize(19));
    }

}

