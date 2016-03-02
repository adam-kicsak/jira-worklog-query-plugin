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
 * QGroupbase is a Querydsl query type for QGroupbase
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QGroupbase extends com.mysema.query.sql.RelationalPathBase<QGroupbase> {

    private static final long serialVersionUID = -851645168;

    public static final QGroupbase groupbase = new QGroupbase("GROUPBASE");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QGroupbase> groupbasePk = createPrimaryKey(id);

    public QGroupbase(String variable) {
        super(QGroupbase.class, forVariable(variable), "PUBLIC", "GROUPBASE");
        addMetadata();
    }

    public QGroupbase(String variable, String schema, String table) {
        super(QGroupbase.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGroupbase(Path<? extends QGroupbase> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "GROUPBASE");
        addMetadata();
    }

    public QGroupbase(PathMetadata<?> metadata) {
        super(QGroupbase.class, metadata, "PUBLIC", "GROUPBASE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupname, ColumnMetadata.named("GROUPNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

