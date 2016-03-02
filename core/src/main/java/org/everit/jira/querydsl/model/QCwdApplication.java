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
 * QCwdApplication is a Querydsl query type for QCwdApplication
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdApplication extends com.mysema.query.sql.RelationalPathBase<QCwdApplication> {

    private static final long serialVersionUID = -1313962624;

    public static final QCwdApplication cwdApplication = new QCwdApplication("CWD_APPLICATION");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final StringPath applicationName = createString("applicationName");

    public final StringPath applicationType = createString("applicationType");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath credential = createString("credential");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerApplicationName = createString("lowerApplicationName");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QCwdApplication> cwdApplicationPk = createPrimaryKey(id);

    public QCwdApplication(String variable) {
        super(QCwdApplication.class, forVariable(variable), "PUBLIC", "CWD_APPLICATION");
        addMetadata();
    }

    public QCwdApplication(String variable, String schema, String table) {
        super(QCwdApplication.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdApplication(Path<? extends QCwdApplication> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_APPLICATION");
        addMetadata();
    }

    public QCwdApplication(PathMetadata<?> metadata) {
        super(QCwdApplication.class, metadata, "PUBLIC", "CWD_APPLICATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(applicationName, ColumnMetadata.named("APPLICATION_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(applicationType, ColumnMetadata.named("APPLICATION_TYPE").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(createdDate, ColumnMetadata.named("CREATED_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(credential, ColumnMetadata.named("CREDENTIAL").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lowerApplicationName, ColumnMetadata.named("LOWER_APPLICATION_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updatedDate, ColumnMetadata.named("UPDATED_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

