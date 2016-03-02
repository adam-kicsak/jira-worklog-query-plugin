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
 * QJquartzJobListeners is a Querydsl query type for QJquartzJobListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzJobListeners extends com.mysema.query.sql.RelationalPathBase<QJquartzJobListeners> {

    private static final long serialVersionUID = -1953997209;

    public static final QJquartzJobListeners jquartzJobListeners = new QJquartzJobListeners("JQUARTZ_JOB_LISTENERS");

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobListener = createString("jobListener");

    public final StringPath jobName = createString("jobName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzJobListeners> jquartzJobListenersPk = createPrimaryKey(jobGroup, jobListener, jobName);

    public QJquartzJobListeners(String variable) {
        super(QJquartzJobListeners.class, forVariable(variable), "PUBLIC", "JQUARTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QJquartzJobListeners(String variable, String schema, String table) {
        super(QJquartzJobListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzJobListeners(Path<? extends QJquartzJobListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QJquartzJobListeners(PathMetadata<?> metadata) {
        super(QJquartzJobListeners.class, metadata, "PUBLIC", "JQUARTZ_JOB_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobListener, ColumnMetadata.named("JOB_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

