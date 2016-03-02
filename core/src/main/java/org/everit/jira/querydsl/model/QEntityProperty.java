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
 * QEntityProperty is a Querydsl query type for QEntityProperty
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QEntityProperty extends com.mysema.query.sql.RelationalPathBase<QEntityProperty> {

    private static final long serialVersionUID = 1844499352;

    public static final QEntityProperty entityProperty = new QEntityProperty("ENTITY_PROPERTY");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> entityId = createNumber("entityId", Long.class);

    public final StringPath entityName = createString("entityName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jsonValue = createString("jsonValue");

    public final StringPath propertyKey = createString("propertyKey");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QEntityProperty> entityPropertyPk = createPrimaryKey(id);

    public QEntityProperty(String variable) {
        super(QEntityProperty.class, forVariable(variable), "PUBLIC", "ENTITY_PROPERTY");
        addMetadata();
    }

    public QEntityProperty(String variable, String schema, String table) {
        super(QEntityProperty.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEntityProperty(Path<? extends QEntityProperty> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ENTITY_PROPERTY");
        addMetadata();
    }

    public QEntityProperty(PathMetadata<?> metadata) {
        super(QEntityProperty.class, metadata, "PUBLIC", "ENTITY_PROPERTY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(entityId, ColumnMetadata.named("ENTITY_ID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(entityName, ColumnMetadata.named("ENTITY_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(jsonValue, ColumnMetadata.named("JSON_VALUE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(propertyKey, ColumnMetadata.named("PROPERTY_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updated, ColumnMetadata.named("UPDATED").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

