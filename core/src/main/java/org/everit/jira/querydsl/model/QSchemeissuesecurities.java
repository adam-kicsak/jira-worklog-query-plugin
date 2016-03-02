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
 * QSchemeissuesecurities is a Querydsl query type for QSchemeissuesecurities
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemeissuesecurities extends com.mysema.query.sql.RelationalPathBase<QSchemeissuesecurities> {

    private static final long serialVersionUID = 1364539506;

    public static final QSchemeissuesecurities schemeissuesecurities = new QSchemeissuesecurities("SCHEMEISSUESECURITIES");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final StringPath secParameter = createString("secParameter");

    public final StringPath secType = createString("secType");

    public final NumberPath<Long> security = createNumber("security", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QSchemeissuesecurities> schemeissuesecuritiesPk = createPrimaryKey(id);

    public QSchemeissuesecurities(String variable) {
        super(QSchemeissuesecurities.class, forVariable(variable), "PUBLIC", "SCHEMEISSUESECURITIES");
        addMetadata();
    }

    public QSchemeissuesecurities(String variable, String schema, String table) {
        super(QSchemeissuesecurities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemeissuesecurities(Path<? extends QSchemeissuesecurities> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SCHEMEISSUESECURITIES");
        addMetadata();
    }

    public QSchemeissuesecurities(PathMetadata<?> metadata) {
        super(QSchemeissuesecurities.class, metadata, "PUBLIC", "SCHEMEISSUESECURITIES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(secParameter, ColumnMetadata.named("SEC_PARAMETER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(secType, ColumnMetadata.named("SEC_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(security, ColumnMetadata.named("SECURITY").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

