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
 * QTrustedapp is a Querydsl query type for QTrustedapp
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTrustedapp extends com.mysema.query.sql.RelationalPathBase<QTrustedapp> {

    private static final long serialVersionUID = 1318375050;

    public static final QTrustedapp trustedapp = new QTrustedapp("TRUSTEDAPP");

    public final StringPath applicationId = createString("applicationId");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipMatch = createString("ipMatch");

    public final StringPath name = createString("name");

    public final StringPath publicKey = createString("publicKey");

    public final NumberPath<Long> timeout = createNumber("timeout", Long.class);

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final StringPath updatedBy = createString("updatedBy");

    public final StringPath urlMatch = createString("urlMatch");

    public final com.mysema.query.sql.PrimaryKey<QTrustedapp> trustedappPk = createPrimaryKey(id);

    public QTrustedapp(String variable) {
        super(QTrustedapp.class, forVariable(variable), "PUBLIC", "TRUSTEDAPP");
        addMetadata();
    }

    public QTrustedapp(String variable, String schema, String table) {
        super(QTrustedapp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTrustedapp(Path<? extends QTrustedapp> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "TRUSTEDAPP");
        addMetadata();
    }

    public QTrustedapp(PathMetadata<?> metadata) {
        super(QTrustedapp.class, metadata, "PUBLIC", "TRUSTEDAPP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(applicationId, ColumnMetadata.named("APPLICATION_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(createdBy, ColumnMetadata.named("CREATED_BY").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(ipMatch, ColumnMetadata.named("IP_MATCH").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(publicKey, ColumnMetadata.named("PUBLIC_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timeout, ColumnMetadata.named("TIMEOUT").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(updatedBy, ColumnMetadata.named("UPDATED_BY").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(urlMatch, ColumnMetadata.named("URL_MATCH").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

