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
 * QNodeindexcounter is a Querydsl query type for QNodeindexcounter
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QNodeindexcounter extends com.mysema.query.sql.RelationalPathBase<QNodeindexcounter> {

    private static final long serialVersionUID = 22857900;

    public static final QNodeindexcounter nodeindexcounter = new QNodeindexcounter("NODEINDEXCOUNTER");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> indexOperationId = createNumber("indexOperationId", Long.class);

    public final StringPath nodeId = createString("nodeId");

    public final StringPath sendingNodeId = createString("sendingNodeId");

    public final com.mysema.query.sql.PrimaryKey<QNodeindexcounter> nodeindexcounterPk = createPrimaryKey(id);

    public QNodeindexcounter(String variable) {
        super(QNodeindexcounter.class, forVariable(variable), "PUBLIC", "NODEINDEXCOUNTER");
        addMetadata();
    }

    public QNodeindexcounter(String variable, String schema, String table) {
        super(QNodeindexcounter.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNodeindexcounter(Path<? extends QNodeindexcounter> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NODEINDEXCOUNTER");
        addMetadata();
    }

    public QNodeindexcounter(PathMetadata<?> metadata) {
        super(QNodeindexcounter.class, metadata, "PUBLIC", "NODEINDEXCOUNTER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(indexOperationId, ColumnMetadata.named("INDEX_OPERATION_ID").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sendingNodeId, ColumnMetadata.named("SENDING_NODE_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

