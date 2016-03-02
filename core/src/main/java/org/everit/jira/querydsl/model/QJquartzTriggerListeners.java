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
 * QJquartzTriggerListeners is a Querydsl query type for QJquartzTriggerListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzTriggerListeners extends com.mysema.query.sql.RelationalPathBase<QJquartzTriggerListeners> {

    private static final long serialVersionUID = 886993996;

    public static final QJquartzTriggerListeners jquartzTriggerListeners = new QJquartzTriggerListeners("JQUARTZ_TRIGGER_LISTENERS");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerListener = createString("triggerListener");

    public final StringPath triggerName = createString("triggerName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzTriggerListeners> jquartzTriggerListenersPk = createPrimaryKey(triggerGroup, triggerListener);

    public QJquartzTriggerListeners(String variable) {
        super(QJquartzTriggerListeners.class, forVariable(variable), "PUBLIC", "JQUARTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QJquartzTriggerListeners(String variable, String schema, String table) {
        super(QJquartzTriggerListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzTriggerListeners(Path<? extends QJquartzTriggerListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public QJquartzTriggerListeners(PathMetadata<?> metadata) {
        super(QJquartzTriggerListeners.class, metadata, "PUBLIC", "JQUARTZ_TRIGGER_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerListener, ColumnMetadata.named("TRIGGER_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(200));
    }

}

