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
 * QSearchrequest is a Querydsl query type for QSearchrequest
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSearchrequest extends com.mysema.query.sql.RelationalPathBase<QSearchrequest> {

    private static final long serialVersionUID = -122419417;

    public static final QSearchrequest searchrequest = new QSearchrequest("SEARCHREQUEST");

    public final StringPath authorname = createString("authorname");

    public final StringPath description = createString("description");

    public final NumberPath<Long> favCount = createNumber("favCount", Long.class);

    public final StringPath filtername = createString("filtername");

    public final StringPath filternameLower = createString("filternameLower");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectid = createNumber("projectid", Long.class);

    public final StringPath reqcontent = createString("reqcontent");

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QSearchrequest> searchrequestPk = createPrimaryKey(id);

    public QSearchrequest(String variable) {
        super(QSearchrequest.class, forVariable(variable), "PUBLIC", "SEARCHREQUEST");
        addMetadata();
    }

    public QSearchrequest(String variable, String schema, String table) {
        super(QSearchrequest.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSearchrequest(Path<? extends QSearchrequest> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SEARCHREQUEST");
        addMetadata();
    }

    public QSearchrequest(PathMetadata<?> metadata) {
        super(QSearchrequest.class, metadata, "PUBLIC", "SEARCHREQUEST");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorname, ColumnMetadata.named("AUTHORNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(favCount, ColumnMetadata.named("FAV_COUNT").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(filtername, ColumnMetadata.named("FILTERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filternameLower, ColumnMetadata.named("FILTERNAME_LOWER").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(groupname, ColumnMetadata.named("GROUPNAME").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(projectid, ColumnMetadata.named("PROJECTID").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(reqcontent, ColumnMetadata.named("REQCONTENT").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

