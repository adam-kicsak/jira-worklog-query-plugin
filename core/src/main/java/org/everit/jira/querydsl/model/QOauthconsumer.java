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
 * QOauthconsumer is a Querydsl query type for QOauthconsumer
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOauthconsumer extends com.mysema.query.sql.RelationalPathBase<QOauthconsumer> {

    private static final long serialVersionUID = -116935987;

    public static final QOauthconsumer oauthconsumer = new QOauthconsumer("OAUTHCONSUMER");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final StringPath consumername = createString("consumername");

    public final StringPath consumerservice = createString("consumerservice");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath privateKey = createString("privateKey");

    public final StringPath publicKey = createString("publicKey");

    public final StringPath sharedSecret = createString("sharedSecret");

    public final StringPath signatureMethod = createString("signatureMethod");

    public final com.mysema.query.sql.PrimaryKey<QOauthconsumer> oauthconsumerPk = createPrimaryKey(id);

    public QOauthconsumer(String variable) {
        super(QOauthconsumer.class, forVariable(variable), "PUBLIC", "OAUTHCONSUMER");
        addMetadata();
    }

    public QOauthconsumer(String variable, String schema, String table) {
        super(QOauthconsumer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthconsumer(Path<? extends QOauthconsumer> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OAUTHCONSUMER");
        addMetadata();
    }

    public QOauthconsumer(PathMetadata<?> metadata) {
        super(QOauthconsumer.class, metadata, "PUBLIC", "OAUTHCONSUMER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("CALLBACK").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("CONSUMER_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumername, ColumnMetadata.named("CONSUMERNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerservice, ColumnMetadata.named("CONSUMERSERVICE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(privateKey, ColumnMetadata.named("PRIVATE_KEY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(publicKey, ColumnMetadata.named("PUBLIC_KEY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sharedSecret, ColumnMetadata.named("SHARED_SECRET").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(signatureMethod, ColumnMetadata.named("SIGNATURE_METHOD").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

