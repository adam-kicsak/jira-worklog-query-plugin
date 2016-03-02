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
 * QLicenserolesgroup is a Querydsl query type for QLicenserolesgroup
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QLicenserolesgroup extends com.mysema.query.sql.RelationalPathBase<QLicenserolesgroup> {

    private static final long serialVersionUID = 218104867;

    public static final QLicenserolesgroup licenserolesgroup = new QLicenserolesgroup("LICENSEROLESGROUP");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath licenseRoleName = createString("licenseRoleName");

    public final StringPath primaryGroup = createString("primaryGroup");

    public final com.mysema.query.sql.PrimaryKey<QLicenserolesgroup> licenserolesgroupPk = createPrimaryKey(id);

    public QLicenserolesgroup(String variable) {
        super(QLicenserolesgroup.class, forVariable(variable), "PUBLIC", "LICENSEROLESGROUP");
        addMetadata();
    }

    public QLicenserolesgroup(String variable, String schema, String table) {
        super(QLicenserolesgroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLicenserolesgroup(Path<? extends QLicenserolesgroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LICENSEROLESGROUP");
        addMetadata();
    }

    public QLicenserolesgroup(PathMetadata<?> metadata) {
        super(QLicenserolesgroup.class, metadata, "PUBLIC", "LICENSEROLESGROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("GROUP_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(licenseRoleName, ColumnMetadata.named("LICENSE_ROLE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(primaryGroup, ColumnMetadata.named("PRIMARY_GROUP").withIndex(4).ofType(Types.CHAR).withSize(2147483647));
    }

}

