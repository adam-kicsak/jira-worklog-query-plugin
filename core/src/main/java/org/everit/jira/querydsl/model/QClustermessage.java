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
 * QClustermessage is a Querydsl query type for QClustermessage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QClustermessage extends com.mysema.query.sql.RelationalPathBase<QClustermessage> {

    private static final long serialVersionUID = -1023417971;

    public static final QClustermessage clustermessage = new QClustermessage("CLUSTERMESSAGE");

    public final StringPath claimedByNode = createString("claimedByNode");

    public final StringPath destinationNode = createString("destinationNode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath message = createString("message");

    public final DateTimePath<java.sql.Timestamp> messageTime = createDateTime("messageTime", java.sql.Timestamp.class);

    public final StringPath sourceNode = createString("sourceNode");

    public final com.mysema.query.sql.PrimaryKey<QClustermessage> clustermessagePk = createPrimaryKey(id);

    public QClustermessage(String variable) {
        super(QClustermessage.class, forVariable(variable), "PUBLIC", "CLUSTERMESSAGE");
        addMetadata();
    }

    public QClustermessage(String variable, String schema, String table) {
        super(QClustermessage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClustermessage(Path<? extends QClustermessage> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTERMESSAGE");
        addMetadata();
    }

    public QClustermessage(PathMetadata<?> metadata) {
        super(QClustermessage.class, metadata, "PUBLIC", "CLUSTERMESSAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(claimedByNode, ColumnMetadata.named("CLAIMED_BY_NODE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(destinationNode, ColumnMetadata.named("DESTINATION_NODE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(message, ColumnMetadata.named("MESSAGE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(messageTime, ColumnMetadata.named("MESSAGE_TIME").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sourceNode, ColumnMetadata.named("SOURCE_NODE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

