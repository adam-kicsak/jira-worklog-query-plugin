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
 * QQrtzJobListeners is a Querydsl query type for QQrtzJobListeners
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzJobListeners extends com.mysema.query.sql.RelationalPathBase<QQrtzJobListeners> {

    private static final long serialVersionUID = -449227319;

    public static final QQrtzJobListeners qrtzJobListeners = new QQrtzJobListeners("QRTZ_JOB_LISTENERS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> job = createNumber("job", Long.class);

    public final StringPath jobListener = createString("jobListener");

    public final com.mysema.query.sql.PrimaryKey<QQrtzJobListeners> qrtzJobListenersPk = createPrimaryKey(id);

    public QQrtzJobListeners(String variable) {
        super(QQrtzJobListeners.class, forVariable(variable), "PUBLIC", "QRTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QQrtzJobListeners(String variable, String schema, String table) {
        super(QQrtzJobListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzJobListeners(Path<? extends QQrtzJobListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QQrtzJobListeners(PathMetadata<?> metadata) {
        super(QQrtzJobListeners.class, metadata, "PUBLIC", "QRTZ_JOB_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(job, ColumnMetadata.named("JOB").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(jobListener, ColumnMetadata.named("JOB_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

