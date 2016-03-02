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
 * QAvatar is a Querydsl query type for QAvatar
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAvatar extends com.mysema.query.sql.RelationalPathBase<QAvatar> {

    private static final long serialVersionUID = 762233369;

    public static final QAvatar avatar = new QAvatar("AVATAR");

    public final StringPath avatartype = createString("avatartype");

    public final StringPath contenttype = createString("contenttype");

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath owner = createString("owner");

    public final NumberPath<Integer> systemavatar = createNumber("systemavatar", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QAvatar> avatarPk = createPrimaryKey(id);

    public QAvatar(String variable) {
        super(QAvatar.class, forVariable(variable), "PUBLIC", "AVATAR");
        addMetadata();
    }

    public QAvatar(String variable, String schema, String table) {
        super(QAvatar.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvatar(Path<? extends QAvatar> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AVATAR");
        addMetadata();
    }

    public QAvatar(PathMetadata<?> metadata) {
        super(QAvatar.class, metadata, "PUBLIC", "AVATAR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avatartype, ColumnMetadata.named("AVATARTYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(contenttype, ColumnMetadata.named("CONTENTTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(owner, ColumnMetadata.named("OWNER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(systemavatar, ColumnMetadata.named("SYSTEMAVATAR").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

