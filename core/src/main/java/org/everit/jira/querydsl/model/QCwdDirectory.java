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
 * QCwdDirectory is a Querydsl query type for QCwdDirectory
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdDirectory extends com.mysema.query.sql.RelationalPathBase<QCwdDirectory> {

    private static final long serialVersionUID = 732752541;

    public static final QCwdDirectory cwdDirectory = new QCwdDirectory("CWD_DIRECTORY");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final StringPath directoryName = createString("directoryName");

    public final NumberPath<Long> directoryPosition = createNumber("directoryPosition", Long.class);

    public final StringPath directoryType = createString("directoryType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath implClass = createString("implClass");

    public final StringPath lowerDirectoryName = createString("lowerDirectoryName");

    public final StringPath lowerImplClass = createString("lowerImplClass");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QCwdDirectory> cwdDirectoryPk = createPrimaryKey(id);

    public QCwdDirectory(String variable) {
        super(QCwdDirectory.class, forVariable(variable), "PUBLIC", "CWD_DIRECTORY");
        addMetadata();
    }

    public QCwdDirectory(String variable, String schema, String table) {
        super(QCwdDirectory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectory(Path<? extends QCwdDirectory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_DIRECTORY");
        addMetadata();
    }

    public QCwdDirectory(PathMetadata<?> metadata) {
        super(QCwdDirectory.class, metadata, "PUBLIC", "CWD_DIRECTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdDate, ColumnMetadata.named("CREATED_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryName, ColumnMetadata.named("DIRECTORY_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryPosition, ColumnMetadata.named("DIRECTORY_POSITION").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(directoryType, ColumnMetadata.named("DIRECTORY_TYPE").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(implClass, ColumnMetadata.named("IMPL_CLASS").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerDirectoryName, ColumnMetadata.named("LOWER_DIRECTORY_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerImplClass, ColumnMetadata.named("LOWER_IMPL_CLASS").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updatedDate, ColumnMetadata.named("UPDATED_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

