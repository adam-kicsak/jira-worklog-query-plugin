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
 * QPortalpage is a Querydsl query type for QPortalpage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPortalpage extends com.mysema.query.sql.RelationalPathBase<QPortalpage> {

    private static final long serialVersionUID = -1646234181;

    public static final QPortalpage portalpage = new QPortalpage("PORTALPAGE");

    public final StringPath description = createString("description");

    public final NumberPath<Long> favCount = createNumber("favCount", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath layout = createString("layout");

    public final StringPath pagename = createString("pagename");

    public final NumberPath<Long> ppversion = createNumber("ppversion", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final StringPath username = createString("username");

    public final com.mysema.query.sql.PrimaryKey<QPortalpage> portalpagePk = createPrimaryKey(id);

    public QPortalpage(String variable) {
        super(QPortalpage.class, forVariable(variable), "PUBLIC", "PORTALPAGE");
        addMetadata();
    }

    public QPortalpage(String variable, String schema, String table) {
        super(QPortalpage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPortalpage(Path<? extends QPortalpage> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PORTALPAGE");
        addMetadata();
    }

    public QPortalpage(PathMetadata<?> metadata) {
        super(QPortalpage.class, metadata, "PUBLIC", "PORTALPAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(favCount, ColumnMetadata.named("FAV_COUNT").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(layout, ColumnMetadata.named("LAYOUT").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pagename, ColumnMetadata.named("PAGENAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(ppversion, ColumnMetadata.named("PPVERSION").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

