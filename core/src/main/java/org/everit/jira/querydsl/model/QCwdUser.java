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
 * QCwdUser is a Querydsl query type for QCwdUser
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdUser extends com.mysema.query.sql.RelationalPathBase<QCwdUser> {

    private static final long serialVersionUID = -335068773;

    public static final QCwdUser cwdUser = new QCwdUser("CWD_USER");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath credential = createString("credential");

    public final NumberPath<Integer> deletedExternally = createNumber("deletedExternally", Integer.class);

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath displayName = createString("displayName");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath externalId = createString("externalId");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath lowerDisplayName = createString("lowerDisplayName");

    public final StringPath lowerEmailAddress = createString("lowerEmailAddress");

    public final StringPath lowerFirstName = createString("lowerFirstName");

    public final StringPath lowerLastName = createString("lowerLastName");

    public final StringPath lowerUserName = createString("lowerUserName");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final StringPath userName = createString("userName");

    public final com.mysema.query.sql.PrimaryKey<QCwdUser> cwdUserPk = createPrimaryKey(id);

    public QCwdUser(String variable) {
        super(QCwdUser.class, forVariable(variable), "PUBLIC", "CWD_USER");
        addMetadata();
    }

    public QCwdUser(String variable, String schema, String table) {
        super(QCwdUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdUser(Path<? extends QCwdUser> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_USER");
        addMetadata();
    }

    public QCwdUser(PathMetadata<?> metadata) {
        super(QCwdUser.class, metadata, "PUBLIC", "CWD_USER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdDate, ColumnMetadata.named("CREATED_DATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(credential, ColumnMetadata.named("CREDENTIAL").withIndex(16).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(deletedExternally, ColumnMetadata.named("DELETED_EXTERNALLY").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(displayName, ColumnMetadata.named("DISPLAY_NAME").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(emailAddress, ColumnMetadata.named("EMAIL_ADDRESS").withIndex(14).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(externalId, ColumnMetadata.named("EXTERNAL_ID").withIndex(18).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(firstName, ColumnMetadata.named("FIRST_NAME").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastName, ColumnMetadata.named("LAST_NAME").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerDisplayName, ColumnMetadata.named("LOWER_DISPLAY_NAME").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerEmailAddress, ColumnMetadata.named("LOWER_EMAIL_ADDRESS").withIndex(15).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerFirstName, ColumnMetadata.named("LOWER_FIRST_NAME").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerLastName, ColumnMetadata.named("LOWER_LAST_NAME").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerUserName, ColumnMetadata.named("LOWER_USER_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updatedDate, ColumnMetadata.named("UPDATED_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(userName, ColumnMetadata.named("USER_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

