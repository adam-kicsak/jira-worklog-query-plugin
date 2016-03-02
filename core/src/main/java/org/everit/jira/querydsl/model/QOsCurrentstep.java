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
 * QOsCurrentstep is a Querydsl query type for QOsCurrentstep
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOsCurrentstep extends com.mysema.query.sql.RelationalPathBase<QOsCurrentstep> {

    private static final long serialVersionUID = 856738433;

    public static final QOsCurrentstep osCurrentstep = new QOsCurrentstep("OS_CURRENTSTEP");

    public final NumberPath<Integer> actionId = createNumber("actionId", Integer.class);

    public final StringPath caller = createString("caller");

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final NumberPath<Long> entryId = createNumber("entryId", Long.class);

    public final DateTimePath<java.sql.Timestamp> finishDate = createDateTime("finishDate", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath owner = createString("owner");

    public final DateTimePath<java.sql.Timestamp> startDate = createDateTime("startDate", java.sql.Timestamp.class);

    public final StringPath status = createString("status");

    public final NumberPath<Integer> stepId = createNumber("stepId", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QOsCurrentstep> osCurrentstepPk = createPrimaryKey(id);

    public QOsCurrentstep(String variable) {
        super(QOsCurrentstep.class, forVariable(variable), "PUBLIC", "OS_CURRENTSTEP");
        addMetadata();
    }

    public QOsCurrentstep(String variable, String schema, String table) {
        super(QOsCurrentstep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsCurrentstep(Path<? extends QOsCurrentstep> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_CURRENTSTEP");
        addMetadata();
    }

    public QOsCurrentstep(PathMetadata<?> metadata) {
        super(QOsCurrentstep.class, metadata, "PUBLIC", "OS_CURRENTSTEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("ACTION_ID").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(caller, ColumnMetadata.named("CALLER").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(dueDate, ColumnMetadata.named("DUE_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(entryId, ColumnMetadata.named("ENTRY_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(finishDate, ColumnMetadata.named("FINISH_DATE").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(owner, ColumnMetadata.named("OWNER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(startDate, ColumnMetadata.named("START_DATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(stepId, ColumnMetadata.named("STEP_ID").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

