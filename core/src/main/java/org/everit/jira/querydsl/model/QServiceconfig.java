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
 * QServiceconfig is a Querydsl query type for QServiceconfig
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QServiceconfig extends com.mysema.query.sql.RelationalPathBase<QServiceconfig> {

    private static final long serialVersionUID = 1812223351;

    public static final QServiceconfig serviceconfig = new QServiceconfig("SERVICECONFIG");

    public final StringPath clazz = createString("clazz");

    public final StringPath cronExpression = createString("cronExpression");

    public final NumberPath<Long> delaytime = createNumber("delaytime", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath servicename = createString("servicename");

    public final com.mysema.query.sql.PrimaryKey<QServiceconfig> serviceconfigPk = createPrimaryKey(id);

    public QServiceconfig(String variable) {
        super(QServiceconfig.class, forVariable(variable), "PUBLIC", "SERVICECONFIG");
        addMetadata();
    }

    public QServiceconfig(String variable, String schema, String table) {
        super(QServiceconfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceconfig(Path<? extends QServiceconfig> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SERVICECONFIG");
        addMetadata();
    }

    public QServiceconfig(PathMetadata<?> metadata) {
        super(QServiceconfig.class, metadata, "PUBLIC", "SERVICECONFIG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clazz, ColumnMetadata.named("CLAZZ").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(cronExpression, ColumnMetadata.named("CRON_EXPRESSION").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(delaytime, ColumnMetadata.named("DELAYTIME").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(servicename, ColumnMetadata.named("SERVICENAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

