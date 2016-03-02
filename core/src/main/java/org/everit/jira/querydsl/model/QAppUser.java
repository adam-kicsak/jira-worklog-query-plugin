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
 * QAppUser is a Querydsl query type for QAppUser
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAppUser extends com.mysema.query.sql.RelationalPathBase<QAppUser> {

    private static final long serialVersionUID = 1995569356;

    public static final QAppUser appUser = new QAppUser("APP_USER");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerUserName = createString("lowerUserName");

    public final StringPath userKey = createString("userKey");

    public final com.mysema.query.sql.PrimaryKey<QAppUser> appUserPk = createPrimaryKey(id);

    public QAppUser(String variable) {
        super(QAppUser.class, forVariable(variable), "PUBLIC", "APP_USER");
        addMetadata();
    }

    public QAppUser(String variable, String schema, String table) {
        super(QAppUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAppUser(Path<? extends QAppUser> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "APP_USER");
        addMetadata();
    }

    public QAppUser(PathMetadata<?> metadata) {
        super(QAppUser.class, metadata, "PUBLIC", "APP_USER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lowerUserName, ColumnMetadata.named("LOWER_USER_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(userKey, ColumnMetadata.named("USER_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

