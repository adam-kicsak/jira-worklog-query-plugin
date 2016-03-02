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
 * QNodeassociation is a Querydsl query type for QNodeassociation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QNodeassociation extends com.mysema.query.sql.RelationalPathBase<QNodeassociation> {

    private static final long serialVersionUID = 332959871;

    public static final QNodeassociation nodeassociation = new QNodeassociation("NODEASSOCIATION");

    public final StringPath associationType = createString("associationType");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final StringPath sinkNodeEntity = createString("sinkNodeEntity");

    public final NumberPath<Long> sinkNodeId = createNumber("sinkNodeId", Long.class);

    public final StringPath sourceNodeEntity = createString("sourceNodeEntity");

    public final NumberPath<Long> sourceNodeId = createNumber("sourceNodeId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QNodeassociation> nodeassociationPk = createPrimaryKey(associationType, sinkNodeEntity, sinkNodeId, sourceNodeEntity, sourceNodeId);

    public QNodeassociation(String variable) {
        super(QNodeassociation.class, forVariable(variable), "PUBLIC", "NODEASSOCIATION");
        addMetadata();
    }

    public QNodeassociation(String variable, String schema, String table) {
        super(QNodeassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNodeassociation(Path<? extends QNodeassociation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NODEASSOCIATION");
        addMetadata();
    }

    public QNodeassociation(PathMetadata<?> metadata) {
        super(QNodeassociation.class, metadata, "PUBLIC", "NODEASSOCIATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(associationType, ColumnMetadata.named("ASSOCIATION_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(sinkNodeEntity, ColumnMetadata.named("SINK_NODE_ENTITY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(sinkNodeId, ColumnMetadata.named("SINK_NODE_ID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sourceNodeEntity, ColumnMetadata.named("SOURCE_NODE_ENTITY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(sourceNodeId, ColumnMetadata.named("SOURCE_NODE_ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

