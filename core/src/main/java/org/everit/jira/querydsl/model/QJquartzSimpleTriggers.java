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
 * QJquartzSimpleTriggers is a Querydsl query type for QJquartzSimpleTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzSimpleTriggers extends com.mysema.query.sql.RelationalPathBase<QJquartzSimpleTriggers> {

    private static final long serialVersionUID = -710409294;

    public static final QJquartzSimpleTriggers jquartzSimpleTriggers = new QJquartzSimpleTriggers("JQUARTZ_SIMPLE_TRIGGERS");

    public final NumberPath<Long> repeatCount = createNumber("repeatCount", Long.class);

    public final NumberPath<Long> repeatInterval = createNumber("repeatInterval", Long.class);

    public final StringPath schedName = createString("schedName");

    public final NumberPath<Long> timesTriggered = createNumber("timesTriggered", Long.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzSimpleTriggers> jquartzSimpleTriggersPk = createPrimaryKey(triggerGroup, triggerName);

    public QJquartzSimpleTriggers(String variable) {
        super(QJquartzSimpleTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public QJquartzSimpleTriggers(String variable, String schema, String table) {
        super(QJquartzSimpleTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzSimpleTriggers(Path<? extends QJquartzSimpleTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public QJquartzSimpleTriggers(PathMetadata<?> metadata) {
        super(QJquartzSimpleTriggers.class, metadata, "PUBLIC", "JQUARTZ_SIMPLE_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(repeatCount, ColumnMetadata.named("REPEAT_COUNT").withIndex(4).ofType(Types.DECIMAL).withSize(13));
        addMetadata(repeatInterval, ColumnMetadata.named("REPEAT_INTERVAL").withIndex(5).ofType(Types.DECIMAL).withSize(13));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(timesTriggered, ColumnMetadata.named("TIMES_TRIGGERED").withIndex(6).ofType(Types.DECIMAL).withSize(13));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

