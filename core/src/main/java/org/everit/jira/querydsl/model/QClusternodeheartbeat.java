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
 * QClusternodeheartbeat is a Querydsl query type for QClusternodeheartbeat
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QClusternodeheartbeat extends com.mysema.query.sql.RelationalPathBase<QClusternodeheartbeat> {

    private static final long serialVersionUID = 508004928;

    public static final QClusternodeheartbeat clusternodeheartbeat = new QClusternodeheartbeat("CLUSTERNODEHEARTBEAT");

    public final NumberPath<Long> databaseTime = createNumber("databaseTime", Long.class);

    public final NumberPath<Long> heartbeatTime = createNumber("heartbeatTime", Long.class);

    public final StringPath nodeId = createString("nodeId");

    public final com.mysema.query.sql.PrimaryKey<QClusternodeheartbeat> clusternodeheartbeatPk = createPrimaryKey(nodeId);

    public QClusternodeheartbeat(String variable) {
        super(QClusternodeheartbeat.class, forVariable(variable), "PUBLIC", "CLUSTERNODEHEARTBEAT");
        addMetadata();
    }

    public QClusternodeheartbeat(String variable, String schema, String table) {
        super(QClusternodeheartbeat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusternodeheartbeat(Path<? extends QClusternodeheartbeat> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTERNODEHEARTBEAT");
        addMetadata();
    }

    public QClusternodeheartbeat(PathMetadata<?> metadata) {
        super(QClusternodeheartbeat.class, metadata, "PUBLIC", "CLUSTERNODEHEARTBEAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseTime, ColumnMetadata.named("DATABASE_TIME").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(heartbeatTime, ColumnMetadata.named("HEARTBEAT_TIME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

