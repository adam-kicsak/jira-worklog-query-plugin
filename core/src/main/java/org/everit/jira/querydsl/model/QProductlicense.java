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
 * QProductlicense is a Querydsl query type for QProductlicense
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProductlicense extends com.mysema.query.sql.RelationalPathBase<QProductlicense> {

    private static final long serialVersionUID = 1464687922;

    public static final QProductlicense productlicense = new QProductlicense("PRODUCTLICENSE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath license = createString("license");

    public final com.mysema.query.sql.PrimaryKey<QProductlicense> productlicensePk = createPrimaryKey(id);

    public QProductlicense(String variable) {
        super(QProductlicense.class, forVariable(variable), "PUBLIC", "PRODUCTLICENSE");
        addMetadata();
    }

    public QProductlicense(String variable, String schema, String table) {
        super(QProductlicense.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProductlicense(Path<? extends QProductlicense> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PRODUCTLICENSE");
        addMetadata();
    }

    public QProductlicense(PathMetadata<?> metadata) {
        super(QProductlicense.class, metadata, "PUBLIC", "PRODUCTLICENSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(license, ColumnMetadata.named("LICENSE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

