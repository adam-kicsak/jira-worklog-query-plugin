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
 * QPluginstate is a Querydsl query type for QPluginstate
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPluginstate extends com.mysema.query.sql.RelationalPathBase<QPluginstate> {

    private static final long serialVersionUID = 1652446334;

    public static final QPluginstate pluginstate = new QPluginstate("PLUGINSTATE");

    public final StringPath pluginenabled = createString("pluginenabled");

    public final StringPath pluginkey = createString("pluginkey");

    public final com.mysema.query.sql.PrimaryKey<QPluginstate> pluginstatePk = createPrimaryKey(pluginkey);

    public QPluginstate(String variable) {
        super(QPluginstate.class, forVariable(variable), "PUBLIC", "PLUGINSTATE");
        addMetadata();
    }

    public QPluginstate(String variable, String schema, String table) {
        super(QPluginstate.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPluginstate(Path<? extends QPluginstate> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PLUGINSTATE");
        addMetadata();
    }

    public QPluginstate(PathMetadata<?> metadata) {
        super(QPluginstate.class, metadata, "PUBLIC", "PLUGINSTATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(pluginenabled, ColumnMetadata.named("PLUGINENABLED").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pluginkey, ColumnMetadata.named("PLUGINKEY").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

