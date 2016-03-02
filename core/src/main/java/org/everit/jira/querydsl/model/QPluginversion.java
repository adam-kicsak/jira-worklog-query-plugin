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
 * QPluginversion is a Querydsl query type for QPluginversion
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPluginversion extends com.mysema.query.sql.RelationalPathBase<QPluginversion> {

    private static final long serialVersionUID = 1111778693;

    public static final QPluginversion pluginversion1 = new QPluginversion("PLUGINVERSION");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath pluginkey = createString("pluginkey");

    public final StringPath pluginname = createString("pluginname");

    public final StringPath pluginversion = createString("pluginversion");

    public final com.mysema.query.sql.PrimaryKey<QPluginversion> pluginversionPk = createPrimaryKey(id);

    public QPluginversion(String variable) {
        super(QPluginversion.class, forVariable(variable), "PUBLIC", "PLUGINVERSION");
        addMetadata();
    }

    public QPluginversion(String variable, String schema, String table) {
        super(QPluginversion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPluginversion(Path<? extends QPluginversion> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PLUGINVERSION");
        addMetadata();
    }

    public QPluginversion(PathMetadata<?> metadata) {
        super(QPluginversion.class, metadata, "PUBLIC", "PLUGINVERSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pluginkey, ColumnMetadata.named("PLUGINKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pluginname, ColumnMetadata.named("PLUGINNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(pluginversion, ColumnMetadata.named("PLUGINVERSION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

