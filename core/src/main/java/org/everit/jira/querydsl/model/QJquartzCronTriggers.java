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
 * QJquartzCronTriggers is a Querydsl query type for QJquartzCronTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzCronTriggers extends com.mysema.query.sql.RelationalPathBase<QJquartzCronTriggers> {

    private static final long serialVersionUID = 1612789198;

    public static final QJquartzCronTriggers jquartzCronTriggers = new QJquartzCronTriggers("JQUARTZ_CRON_TRIGGERS");

    public final StringPath cronExpression = createString("cronExpression");

    public final StringPath schedName = createString("schedName");

    public final StringPath timeZoneId = createString("timeZoneId");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzCronTriggers> jquartzCronTriggersPk = createPrimaryKey(triggerGroup, triggerName);

    public QJquartzCronTriggers(String variable) {
        super(QJquartzCronTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QJquartzCronTriggers(String variable, String schema, String table) {
        super(QJquartzCronTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzCronTriggers(Path<? extends QJquartzCronTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QJquartzCronTriggers(PathMetadata<?> metadata) {
        super(QJquartzCronTriggers.class, metadata, "PUBLIC", "JQUARTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cronExpression, ColumnMetadata.named("CRON_EXPRESSION").withIndex(4).ofType(Types.VARCHAR).withSize(120));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(timeZoneId, ColumnMetadata.named("TIME_ZONE_ID").withIndex(5).ofType(Types.VARCHAR).withSize(80));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

