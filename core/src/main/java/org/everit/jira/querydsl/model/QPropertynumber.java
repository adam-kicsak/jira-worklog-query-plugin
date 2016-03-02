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
 * QPropertynumber is a Querydsl query type for QPropertynumber
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertynumber extends com.mysema.query.sql.RelationalPathBase<QPropertynumber> {

    private static final long serialVersionUID = 1990952478;

    public static final QPropertynumber propertynumber = new QPropertynumber("PROPERTYNUMBER");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> propertyvalue = createNumber("propertyvalue", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QPropertynumber> propertynumberPk = createPrimaryKey(id);

    public QPropertynumber(String variable) {
        super(QPropertynumber.class, forVariable(variable), "PUBLIC", "PROPERTYNUMBER");
        addMetadata();
    }

    public QPropertynumber(String variable, String schema, String table) {
        super(QPropertynumber.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertynumber(Path<? extends QPropertynumber> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYNUMBER");
        addMetadata();
    }

    public QPropertynumber(PathMetadata<?> metadata) {
        super(QPropertynumber.class, metadata, "PUBLIC", "PROPERTYNUMBER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

