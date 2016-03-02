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
 * QOauthspconsumer is a Querydsl query type for QOauthspconsumer
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOauthspconsumer extends com.mysema.query.sql.RelationalPathBase<QOauthspconsumer> {

    private static final long serialVersionUID = 1491450474;

    public static final QOauthspconsumer oauthspconsumer = new QOauthspconsumer("OAUTHSPCONSUMER");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final StringPath consumername = createString("consumername");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final StringPath executingTwoLOUser = createString("executingTwoLOUser");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath publicKey = createString("publicKey");

    public final StringPath threeLOAllowed = createString("threeLOAllowed");

    public final StringPath twoLOAllowed = createString("twoLOAllowed");

    public final StringPath twoLOImpersonationAllowed = createString("twoLOImpersonationAllowed");

    public final com.mysema.query.sql.PrimaryKey<QOauthspconsumer> oauthspconsumerPk = createPrimaryKey(id);

    public QOauthspconsumer(String variable) {
        super(QOauthspconsumer.class, forVariable(variable), "PUBLIC", "OAUTHSPCONSUMER");
        addMetadata();
    }

    public QOauthspconsumer(String variable, String schema, String table) {
        super(QOauthspconsumer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthspconsumer(Path<? extends QOauthspconsumer> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OAUTHSPCONSUMER");
        addMetadata();
    }

    public QOauthspconsumer(PathMetadata<?> metadata) {
        super(QOauthspconsumer.class, metadata, "PUBLIC", "OAUTHSPCONSUMER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("CALLBACK").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("CONSUMER_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumername, ColumnMetadata.named("CONSUMERNAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(executingTwoLOUser, ColumnMetadata.named("EXECUTING_TWO_L_O_USER").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(publicKey, ColumnMetadata.named("PUBLIC_KEY").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(threeLOAllowed, ColumnMetadata.named("THREE_L_O_ALLOWED").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(twoLOAllowed, ColumnMetadata.named("TWO_L_O_ALLOWED").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(twoLOImpersonationAllowed, ColumnMetadata.named("TWO_L_O_IMPERSONATION_ALLOWED").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

