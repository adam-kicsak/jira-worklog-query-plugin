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
 * QOauthsptoken is a Querydsl query type for QOauthsptoken
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOauthsptoken extends com.mysema.query.sql.RelationalPathBase<QOauthsptoken> {

    private static final long serialVersionUID = -1564067835;

    public static final QOauthsptoken oauthsptoken = new QOauthsptoken("OAUTHSPTOKEN");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> sessionCreationTime = createDateTime("sessionCreationTime", java.sql.Timestamp.class);

    public final StringPath sessionHandle = createString("sessionHandle");

    public final DateTimePath<java.sql.Timestamp> sessionLastRenewalTime = createDateTime("sessionLastRenewalTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sessionTimeToLive = createDateTime("sessionTimeToLive", java.sql.Timestamp.class);

    public final StringPath spauth = createString("spauth");

    public final StringPath spverifier = createString("spverifier");

    public final StringPath spversion = createString("spversion");

    public final StringPath token = createString("token");

    public final StringPath tokenSecret = createString("tokenSecret");

    public final StringPath tokenType = createString("tokenType");

    public final NumberPath<Long> ttl = createNumber("ttl", Long.class);

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QOauthsptoken> oauthsptokenPk = createPrimaryKey(id);

    public QOauthsptoken(String variable) {
        super(QOauthsptoken.class, forVariable(variable), "PUBLIC", "OAUTHSPTOKEN");
        addMetadata();
    }

    public QOauthsptoken(String variable, String schema, String table) {
        super(QOauthsptoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthsptoken(Path<? extends QOauthsptoken> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OAUTHSPTOKEN");
        addMetadata();
    }

    public QOauthsptoken(PathMetadata<?> metadata) {
        super(QOauthsptoken.class, metadata, "PUBLIC", "OAUTHSPTOKEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("CALLBACK").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("CONSUMER_KEY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sessionCreationTime, ColumnMetadata.named("SESSION_CREATION_TIME").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sessionHandle, ColumnMetadata.named("SESSION_HANDLE").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sessionLastRenewalTime, ColumnMetadata.named("SESSION_LAST_RENEWAL_TIME").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sessionTimeToLive, ColumnMetadata.named("SESSION_TIME_TO_LIVE").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(spauth, ColumnMetadata.named("SPAUTH").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(spverifier, ColumnMetadata.named("SPVERIFIER").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(spversion, ColumnMetadata.named("SPVERSION").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(token, ColumnMetadata.named("TOKEN").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenSecret, ColumnMetadata.named("TOKEN_SECRET").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenType, ColumnMetadata.named("TOKEN_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(ttl, ColumnMetadata.named("TTL").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

