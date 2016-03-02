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
 * QRemembermetoken is a Querydsl query type for QRemembermetoken
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRemembermetoken extends com.mysema.query.sql.RelationalPathBase<QRemembermetoken> {

    private static final long serialVersionUID = -198618252;

    public static final QRemembermetoken remembermetoken = new QRemembermetoken("REMEMBERMETOKEN");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath token = createString("token");

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QRemembermetoken> remembermetokenPk = createPrimaryKey(id);

    public QRemembermetoken(String variable) {
        super(QRemembermetoken.class, forVariable(variable), "PUBLIC", "REMEMBERMETOKEN");
        addMetadata();
    }

    public QRemembermetoken(String variable, String schema, String table) {
        super(QRemembermetoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemembermetoken(Path<? extends QRemembermetoken> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "REMEMBERMETOKEN");
        addMetadata();
    }

    public QRemembermetoken(PathMetadata<?> metadata) {
        super(QRemembermetoken.class, metadata, "PUBLIC", "REMEMBERMETOKEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(token, ColumnMetadata.named("TOKEN").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

