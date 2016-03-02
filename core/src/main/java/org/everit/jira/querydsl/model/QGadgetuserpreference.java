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
 * QGadgetuserpreference is a Querydsl query type for QGadgetuserpreference
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QGadgetuserpreference extends com.mysema.query.sql.RelationalPathBase<QGadgetuserpreference> {

    private static final long serialVersionUID = 2129196786;

    public static final QGadgetuserpreference gadgetuserpreference = new QGadgetuserpreference("GADGETUSERPREFERENCE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> portletconfiguration = createNumber("portletconfiguration", Long.class);

    public final StringPath userprefkey = createString("userprefkey");

    public final StringPath userprefvalue = createString("userprefvalue");

    public final com.mysema.query.sql.PrimaryKey<QGadgetuserpreference> gadgetuserpreferencePk = createPrimaryKey(id);

    public QGadgetuserpreference(String variable) {
        super(QGadgetuserpreference.class, forVariable(variable), "PUBLIC", "GADGETUSERPREFERENCE");
        addMetadata();
    }

    public QGadgetuserpreference(String variable, String schema, String table) {
        super(QGadgetuserpreference.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGadgetuserpreference(Path<? extends QGadgetuserpreference> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "GADGETUSERPREFERENCE");
        addMetadata();
    }

    public QGadgetuserpreference(PathMetadata<?> metadata) {
        super(QGadgetuserpreference.class, metadata, "PUBLIC", "GADGETUSERPREFERENCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(portletconfiguration, ColumnMetadata.named("PORTLETCONFIGURATION").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(userprefkey, ColumnMetadata.named("USERPREFKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(userprefvalue, ColumnMetadata.named("USERPREFVALUE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

