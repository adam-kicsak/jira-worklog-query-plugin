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
 * QCwdDirectoryOperation is a Querydsl query type for QCwdDirectoryOperation
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdDirectoryOperation extends com.mysema.query.sql.RelationalPathBase<QCwdDirectoryOperation> {

    private static final long serialVersionUID = 47295306;

    public static final QCwdDirectoryOperation cwdDirectoryOperation = new QCwdDirectoryOperation("CWD_DIRECTORY_OPERATION");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath operationType = createString("operationType");

    public final com.mysema.query.sql.PrimaryKey<QCwdDirectoryOperation> cwdDirectoryOperationPk = createPrimaryKey(directoryId, operationType);

    public QCwdDirectoryOperation(String variable) {
        super(QCwdDirectoryOperation.class, forVariable(variable), "PUBLIC", "CWD_DIRECTORY_OPERATION");
        addMetadata();
    }

    public QCwdDirectoryOperation(String variable, String schema, String table) {
        super(QCwdDirectoryOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectoryOperation(Path<? extends QCwdDirectoryOperation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_DIRECTORY_OPERATION");
        addMetadata();
    }

    public QCwdDirectoryOperation(PathMetadata<?> metadata) {
        super(QCwdDirectoryOperation.class, metadata, "PUBLIC", "CWD_DIRECTORY_OPERATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(operationType, ColumnMetadata.named("OPERATION_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

