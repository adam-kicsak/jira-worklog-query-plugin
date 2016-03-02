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
 * QManagedconfigurationitem is a Querydsl query type for QManagedconfigurationitem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QManagedconfigurationitem extends com.mysema.query.sql.RelationalPathBase<QManagedconfigurationitem> {

    private static final long serialVersionUID = -1739778038;

    public static final QManagedconfigurationitem managedconfigurationitem = new QManagedconfigurationitem("MANAGEDCONFIGURATIONITEM");

    public final StringPath accessLevel = createString("accessLevel");

    public final StringPath descriptionKey = createString("descriptionKey");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath itemId = createString("itemId");

    public final StringPath itemType = createString("itemType");

    public final StringPath managed = createString("managed");

    public final StringPath source = createString("source");

    public final com.mysema.query.sql.PrimaryKey<QManagedconfigurationitem> managedconfigurationitemPk = createPrimaryKey(id);

    public QManagedconfigurationitem(String variable) {
        super(QManagedconfigurationitem.class, forVariable(variable), "PUBLIC", "MANAGEDCONFIGURATIONITEM");
        addMetadata();
    }

    public QManagedconfigurationitem(String variable, String schema, String table) {
        super(QManagedconfigurationitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagedconfigurationitem(Path<? extends QManagedconfigurationitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MANAGEDCONFIGURATIONITEM");
        addMetadata();
    }

    public QManagedconfigurationitem(PathMetadata<?> metadata) {
        super(QManagedconfigurationitem.class, metadata, "PUBLIC", "MANAGEDCONFIGURATIONITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accessLevel, ColumnMetadata.named("ACCESS_LEVEL").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(descriptionKey, ColumnMetadata.named("DESCRIPTION_KEY").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(itemId, ColumnMetadata.named("ITEM_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(itemType, ColumnMetadata.named("ITEM_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(managed, ColumnMetadata.named("MANAGED").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(source, ColumnMetadata.named("SOURCE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

