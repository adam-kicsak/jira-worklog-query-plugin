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
 * QPropertydata is a Querydsl query type for QPropertydata
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertydata extends com.mysema.query.sql.RelationalPathBase<QPropertydata> {

    private static final long serialVersionUID = 493374399;

    public static final QPropertydata propertydata = new QPropertydata("PROPERTYDATA");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SimplePath<Object> propertyvalue = createSimple("propertyvalue", Object.class);

    public final com.mysema.query.sql.PrimaryKey<QPropertydata> propertydataPk = createPrimaryKey(id);

    public QPropertydata(String variable) {
        super(QPropertydata.class, forVariable(variable), "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public QPropertydata(String variable, String schema, String table) {
        super(QPropertydata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertydata(Path<? extends QPropertydata> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public QPropertydata(PathMetadata<?> metadata) {
        super(QPropertydata.class, metadata, "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.OTHER).withSize(2147483647));
    }

}

