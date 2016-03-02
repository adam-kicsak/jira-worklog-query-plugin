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
 * QOauthconsumertoken is a Querydsl query type for QOauthconsumertoken
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOauthconsumertoken extends com.mysema.query.sql.RelationalPathBase<QOauthconsumertoken> {

    private static final long serialVersionUID = -1235239092;

    public static final QOauthconsumertoken oauthconsumertoken = new QOauthconsumertoken("OAUTHCONSUMERTOKEN");

    public final StringPath consumerKey = createString("consumerKey");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath token = createString("token");

    public final StringPath tokenKey = createString("tokenKey");

    public final StringPath tokenSecret = createString("tokenSecret");

    public final StringPath tokenType = createString("tokenType");

    public final com.mysema.query.sql.PrimaryKey<QOauthconsumertoken> oauthconsumertokenPk = createPrimaryKey(id);

    public QOauthconsumertoken(String variable) {
        super(QOauthconsumertoken.class, forVariable(variable), "PUBLIC", "OAUTHCONSUMERTOKEN");
        addMetadata();
    }

    public QOauthconsumertoken(String variable, String schema, String table) {
        super(QOauthconsumertoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthconsumertoken(Path<? extends QOauthconsumertoken> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OAUTHCONSUMERTOKEN");
        addMetadata();
    }

    public QOauthconsumertoken(PathMetadata<?> metadata) {
        super(QOauthconsumertoken.class, metadata, "PUBLIC", "OAUTHCONSUMERTOKEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(consumerKey, ColumnMetadata.named("CONSUMER_KEY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(token, ColumnMetadata.named("TOKEN").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenKey, ColumnMetadata.named("TOKEN_KEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenSecret, ColumnMetadata.named("TOKEN_SECRET").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(tokenType, ColumnMetadata.named("TOKEN_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

