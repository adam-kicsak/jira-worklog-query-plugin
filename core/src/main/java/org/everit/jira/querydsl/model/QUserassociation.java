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
 * QUserassociation is a Querydsl query type for QUserassociation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserassociation extends com.mysema.query.sql.RelationalPathBase<QUserassociation> {

    private static final long serialVersionUID = 1658325782;

    public static final QUserassociation userassociation = new QUserassociation("USERASSOCIATION");

    public final StringPath associationType = createString("associationType");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final StringPath sinkNodeEntity = createString("sinkNodeEntity");

    public final NumberPath<Long> sinkNodeId = createNumber("sinkNodeId", Long.class);

    public final StringPath sourceName = createString("sourceName");

    public final com.mysema.query.sql.PrimaryKey<QUserassociation> userassociationPk = createPrimaryKey(associationType, sinkNodeEntity, sinkNodeId, sourceName);

    public QUserassociation(String variable) {
        super(QUserassociation.class, forVariable(variable), "PUBLIC", "USERASSOCIATION");
        addMetadata();
    }

    public QUserassociation(String variable, String schema, String table) {
        super(QUserassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserassociation(Path<? extends QUserassociation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERASSOCIATION");
        addMetadata();
    }

    public QUserassociation(PathMetadata<?> metadata) {
        super(QUserassociation.class, metadata, "PUBLIC", "USERASSOCIATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(associationType, ColumnMetadata.named("ASSOCIATION_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(sinkNodeEntity, ColumnMetadata.named("SINK_NODE_ENTITY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(sinkNodeId, ColumnMetadata.named("SINK_NODE_ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sourceName, ColumnMetadata.named("SOURCE_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

