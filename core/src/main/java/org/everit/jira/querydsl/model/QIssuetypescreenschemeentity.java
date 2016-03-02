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
 * QIssuetypescreenschemeentity is a Querydsl query type for QIssuetypescreenschemeentity
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QIssuetypescreenschemeentity extends com.mysema.query.sql.RelationalPathBase<QIssuetypescreenschemeentity> {

    private static final long serialVersionUID = -532052921;

    public static final QIssuetypescreenschemeentity issuetypescreenschemeentity = new QIssuetypescreenschemeentity("ISSUETYPESCREENSCHEMEENTITY");

    public final NumberPath<Long> fieldscreenscheme = createNumber("fieldscreenscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QIssuetypescreenschemeentity> issuetypescreenschemeentityPk = createPrimaryKey(id);

    public QIssuetypescreenschemeentity(String variable) {
        super(QIssuetypescreenschemeentity.class, forVariable(variable), "PUBLIC", "ISSUETYPESCREENSCHEMEENTITY");
        addMetadata();
    }

    public QIssuetypescreenschemeentity(String variable, String schema, String table) {
        super(QIssuetypescreenschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuetypescreenschemeentity(Path<? extends QIssuetypescreenschemeentity> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "ISSUETYPESCREENSCHEMEENTITY");
        addMetadata();
    }

    public QIssuetypescreenschemeentity(PathMetadata<?> metadata) {
        super(QIssuetypescreenschemeentity.class, metadata, "PUBLIC", "ISSUETYPESCREENSCHEMEENTITY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldscreenscheme, ColumnMetadata.named("FIELDSCREENSCHEME").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

