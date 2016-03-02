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
 * QJquartzPausedTriggerGrps is a Querydsl query type for QJquartzPausedTriggerGrps
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzPausedTriggerGrps extends com.mysema.query.sql.RelationalPathBase<QJquartzPausedTriggerGrps> {

    private static final long serialVersionUID = 1402278835;

    public static final QJquartzPausedTriggerGrps jquartzPausedTriggerGrps = new QJquartzPausedTriggerGrps("JQUARTZ_PAUSED_TRIGGER_GRPS");

    public final StringPath schedName = createString("schedName");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final com.mysema.query.sql.PrimaryKey<QJquartzPausedTriggerGrps> jquartzPausedTriggerGrpsPk = createPrimaryKey(triggerGroup);

    public QJquartzPausedTriggerGrps(String variable) {
        super(QJquartzPausedTriggerGrps.class, forVariable(variable), "PUBLIC", "JQUARTZ_PAUSED_TRIGGER_GRPS");
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(String variable, String schema, String table) {
        super(QJquartzPausedTriggerGrps.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(Path<? extends QJquartzPausedTriggerGrps> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_PAUSED_TRIGGER_GRPS");
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(PathMetadata<?> metadata) {
        super(QJquartzPausedTriggerGrps.class, metadata, "PUBLIC", "JQUARTZ_PAUSED_TRIGGER_GRPS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

