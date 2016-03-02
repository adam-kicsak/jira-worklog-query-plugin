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
 * QLicenserolesdefault is a Querydsl query type for QLicenserolesdefault
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QLicenserolesdefault extends com.mysema.query.sql.RelationalPathBase<QLicenserolesdefault> {

    private static final long serialVersionUID = 396757733;

    public static final QLicenserolesdefault licenserolesdefault = new QLicenserolesdefault("LICENSEROLESDEFAULT");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath licenseRoleName = createString("licenseRoleName");

    public final com.mysema.query.sql.PrimaryKey<QLicenserolesdefault> licenserolesdefaultPk = createPrimaryKey(id);

    public QLicenserolesdefault(String variable) {
        super(QLicenserolesdefault.class, forVariable(variable), "PUBLIC", "LICENSEROLESDEFAULT");
        addMetadata();
    }

    public QLicenserolesdefault(String variable, String schema, String table) {
        super(QLicenserolesdefault.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLicenserolesdefault(Path<? extends QLicenserolesdefault> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LICENSEROLESDEFAULT");
        addMetadata();
    }

    public QLicenserolesdefault(PathMetadata<?> metadata) {
        super(QLicenserolesdefault.class, metadata, "PUBLIC", "LICENSEROLESDEFAULT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(licenseRoleName, ColumnMetadata.named("LICENSE_ROLE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

