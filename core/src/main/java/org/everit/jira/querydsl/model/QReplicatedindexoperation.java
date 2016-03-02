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
 * QReplicatedindexoperation is a Querydsl query type for QReplicatedindexoperation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QReplicatedindexoperation extends com.mysema.query.sql.RelationalPathBase<QReplicatedindexoperation> {

    private static final long serialVersionUID = -2088557904;

    public static final QReplicatedindexoperation replicatedindexoperation = new QReplicatedindexoperation("REPLICATEDINDEXOPERATION");

    public final StringPath affectedIds = createString("affectedIds");

    public final StringPath affectedIndex = createString("affectedIndex");

    public final StringPath entityType = createString("entityType");

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> indexTime = createDateTime("indexTime", java.sql.Timestamp.class);

    public final StringPath nodeId = createString("nodeId");

    public final StringPath operation = createString("operation");

    public final com.mysema.query.sql.PrimaryKey<QReplicatedindexoperation> replicatedindexoperationPk = createPrimaryKey(id);

    public QReplicatedindexoperation(String variable) {
        super(QReplicatedindexoperation.class, forVariable(variable), "PUBLIC", "REPLICATEDINDEXOPERATION");
        addMetadata();
    }

    public QReplicatedindexoperation(String variable, String schema, String table) {
        super(QReplicatedindexoperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReplicatedindexoperation(Path<? extends QReplicatedindexoperation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REPLICATEDINDEXOPERATION");
        addMetadata();
    }

    public QReplicatedindexoperation(PathMetadata<?> metadata) {
        super(QReplicatedindexoperation.class, metadata, "PUBLIC", "REPLICATEDINDEXOPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affectedIds, ColumnMetadata.named("AFFECTED_IDS").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(affectedIndex, ColumnMetadata.named("AFFECTED_INDEX").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(entityType, ColumnMetadata.named("ENTITY_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(indexTime, ColumnMetadata.named("INDEX_TIME").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(operation, ColumnMetadata.named("OPERATION").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

