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
 * QPropertydecimal is a Querydsl query type for QPropertydecimal
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertydecimal extends com.mysema.query.sql.RelationalPathBase<QPropertydecimal> {

    private static final long serialVersionUID = 837796636;

    public static final QPropertydecimal propertydecimal = new QPropertydecimal("PROPERTYDECIMAL");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> propertyvalue = createNumber("propertyvalue", Double.class);

    public final com.mysema.query.sql.PrimaryKey<QPropertydecimal> propertydecimalPk = createPrimaryKey(id);

    public QPropertydecimal(String variable) {
        super(QPropertydecimal.class, forVariable(variable), "PUBLIC", "PROPERTYDECIMAL");
        addMetadata();
    }

    public QPropertydecimal(String variable, String schema, String table) {
        super(QPropertydecimal.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertydecimal(Path<? extends QPropertydecimal> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYDECIMAL");
        addMetadata();
    }

    public QPropertydecimal(PathMetadata<?> metadata) {
        super(QPropertydecimal.class, metadata, "PUBLIC", "PROPERTYDECIMAL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.DOUBLE).withSize(17));
    }

}

