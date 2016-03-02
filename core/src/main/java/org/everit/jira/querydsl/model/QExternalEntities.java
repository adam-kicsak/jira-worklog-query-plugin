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
 * QExternalEntities is a Querydsl query type for QExternalEntities
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QExternalEntities extends com.mysema.query.sql.RelationalPathBase<QExternalEntities> {

    private static final long serialVersionUID = 1811621228;

    public static final QExternalEntities externalEntities = new QExternalEntities("EXTERNAL_ENTITIES");

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QExternalEntities> externalEntitiesPk = createPrimaryKey(id);

    public QExternalEntities(String variable) {
        super(QExternalEntities.class, forVariable(variable), "PUBLIC", "EXTERNAL_ENTITIES");
        addMetadata();
    }

    public QExternalEntities(String variable, String schema, String table) {
        super(QExternalEntities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalEntities(Path<? extends QExternalEntities> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "EXTERNAL_ENTITIES");
        addMetadata();
    }

    public QExternalEntities(PathMetadata<?> metadata) {
        super(QExternalEntities.class, metadata, "PUBLIC", "EXTERNAL_ENTITIES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

