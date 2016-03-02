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
 * QNotificationinstance is a Querydsl query type for QNotificationinstance
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QNotificationinstance extends com.mysema.query.sql.RelationalPathBase<QNotificationinstance> {

    private static final long serialVersionUID = -1389972672;

    public static final QNotificationinstance notificationinstance = new QNotificationinstance("NOTIFICATIONINSTANCE");

    public final StringPath emailaddress = createString("emailaddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath messageid = createString("messageid");

    public final StringPath notificationtype = createString("notificationtype");

    public final NumberPath<Long> source = createNumber("source", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QNotificationinstance> notificationinstancePk = createPrimaryKey(id);

    public QNotificationinstance(String variable) {
        super(QNotificationinstance.class, forVariable(variable), "PUBLIC", "NOTIFICATIONINSTANCE");
        addMetadata();
    }

    public QNotificationinstance(String variable, String schema, String table) {
        super(QNotificationinstance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNotificationinstance(Path<? extends QNotificationinstance> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NOTIFICATIONINSTANCE");
        addMetadata();
    }

    public QNotificationinstance(PathMetadata<?> metadata) {
        super(QNotificationinstance.class, metadata, "PUBLIC", "NOTIFICATIONINSTANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(emailaddress, ColumnMetadata.named("EMAILADDRESS").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(messageid, ColumnMetadata.named("MESSAGEID").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(notificationtype, ColumnMetadata.named("NOTIFICATIONTYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(source, ColumnMetadata.named("SOURCE").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

