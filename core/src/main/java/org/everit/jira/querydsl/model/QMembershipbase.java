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
 * QMembershipbase is a Querydsl query type for QMembershipbase
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMembershipbase extends com.mysema.query.sql.RelationalPathBase<QMembershipbase> {

    private static final long serialVersionUID = -1937312665;

    public static final QMembershipbase membershipbase = new QMembershipbase("MEMBERSHIPBASE");

    public final StringPath groupName = createString("groupName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath userName = createString("userName");

    public final com.mysema.query.sql.PrimaryKey<QMembershipbase> membershipbasePk = createPrimaryKey(id);

    public QMembershipbase(String variable) {
        super(QMembershipbase.class, forVariable(variable), "PUBLIC", "MEMBERSHIPBASE");
        addMetadata();
    }

    public QMembershipbase(String variable, String schema, String table) {
        super(QMembershipbase.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMembershipbase(Path<? extends QMembershipbase> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MEMBERSHIPBASE");
        addMetadata();
    }

    public QMembershipbase(PathMetadata<?> metadata) {
        super(QMembershipbase.class, metadata, "PUBLIC", "MEMBERSHIPBASE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupName, ColumnMetadata.named("GROUP_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userName, ColumnMetadata.named("USER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

