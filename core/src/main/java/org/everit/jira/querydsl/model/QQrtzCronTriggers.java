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
 * QQrtzCronTriggers is a Querydsl query type for QQrtzCronTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzCronTriggers extends com.mysema.query.sql.RelationalPathBase<QQrtzCronTriggers> {

    private static final long serialVersionUID = -1177408208;

    public static final QQrtzCronTriggers qrtzCronTriggers = new QQrtzCronTriggers("QRTZ_CRON_TRIGGERS");

    public final StringPath cronexperssion = createString("cronexperssion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QQrtzCronTriggers> qrtzCronTriggersPk = createPrimaryKey(id);

    public QQrtzCronTriggers(String variable) {
        super(QQrtzCronTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QQrtzCronTriggers(String variable, String schema, String table) {
        super(QQrtzCronTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzCronTriggers(Path<? extends QQrtzCronTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QQrtzCronTriggers(PathMetadata<?> metadata) {
        super(QQrtzCronTriggers.class, metadata, "PUBLIC", "QRTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cronexperssion, ColumnMetadata.named("CRONEXPERSSION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

