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
 * QJquartzLocks is a Querydsl query type for QJquartzLocks
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzLocks extends com.mysema.query.sql.RelationalPathBase<QJquartzLocks> {

    private static final long serialVersionUID = 471045347;

    public static final QJquartzLocks jquartzLocks = new QJquartzLocks("JQUARTZ_LOCKS");

    public final StringPath lockName = createString("lockName");

    public final StringPath schedName = createString("schedName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzLocks> jquartzLocksPk = createPrimaryKey(lockName);

    public QJquartzLocks(String variable) {
        super(QJquartzLocks.class, forVariable(variable), "PUBLIC", "JQUARTZ_LOCKS");
        addMetadata();
    }

    public QJquartzLocks(String variable, String schema, String table) {
        super(QJquartzLocks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzLocks(Path<? extends QJquartzLocks> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_LOCKS");
        addMetadata();
    }

    public QJquartzLocks(PathMetadata<?> metadata) {
        super(QJquartzLocks.class, metadata, "PUBLIC", "JQUARTZ_LOCKS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lockName, ColumnMetadata.named("LOCK_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(40).notNull());
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

