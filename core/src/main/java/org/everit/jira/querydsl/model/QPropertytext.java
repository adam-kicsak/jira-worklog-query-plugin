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
 * QPropertytext is a Querydsl query type for QPropertytext
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPropertytext extends com.mysema.query.sql.RelationalPathBase<QPropertytext> {

    private static final long serialVersionUID = 493855042;

    public static final QPropertytext propertytext = new QPropertytext("PROPERTYTEXT");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath propertyvalue = createString("propertyvalue");

    public final com.mysema.query.sql.PrimaryKey<QPropertytext> propertytextPk = createPrimaryKey(id);

    public QPropertytext(String variable) {
        super(QPropertytext.class, forVariable(variable), "PUBLIC", "PROPERTYTEXT");
        addMetadata();
    }

    public QPropertytext(String variable, String schema, String table) {
        super(QPropertytext.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertytext(Path<? extends QPropertytext> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYTEXT");
        addMetadata();
    }

    public QPropertytext(PathMetadata<?> metadata) {
        super(QPropertytext.class, metadata, "PUBLIC", "PROPERTYTEXT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

