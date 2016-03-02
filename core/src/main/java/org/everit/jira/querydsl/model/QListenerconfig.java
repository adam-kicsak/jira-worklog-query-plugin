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
 * QListenerconfig is a Querydsl query type for QListenerconfig
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QListenerconfig extends com.mysema.query.sql.RelationalPathBase<QListenerconfig> {

    private static final long serialVersionUID = 306852278;

    public static final QListenerconfig listenerconfig = new QListenerconfig("LISTENERCONFIG");

    public final StringPath clazz = createString("clazz");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath listenername = createString("listenername");

    public final com.mysema.query.sql.PrimaryKey<QListenerconfig> listenerconfigPk = createPrimaryKey(id);

    public QListenerconfig(String variable) {
        super(QListenerconfig.class, forVariable(variable), "PUBLIC", "LISTENERCONFIG");
        addMetadata();
    }

    public QListenerconfig(String variable, String schema, String table) {
        super(QListenerconfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QListenerconfig(Path<? extends QListenerconfig> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LISTENERCONFIG");
        addMetadata();
    }

    public QListenerconfig(PathMetadata<?> metadata) {
        super(QListenerconfig.class, metadata, "PUBLIC", "LISTENERCONFIG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clazz, ColumnMetadata.named("CLAZZ").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(listenername, ColumnMetadata.named("LISTENERNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

