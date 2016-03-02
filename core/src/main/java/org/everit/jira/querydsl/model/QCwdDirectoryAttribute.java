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
 * QCwdDirectoryAttribute is a Querydsl query type for QCwdDirectoryAttribute
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdDirectoryAttribute extends com.mysema.query.sql.RelationalPathBase<QCwdDirectoryAttribute> {

    private static final long serialVersionUID = -1602322305;

    public static final QCwdDirectoryAttribute cwdDirectoryAttribute = new QCwdDirectoryAttribute("CWD_DIRECTORY_ATTRIBUTE");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QCwdDirectoryAttribute> cwdDirectoryAttributePk = createPrimaryKey(attributeName, directoryId);

    public QCwdDirectoryAttribute(String variable) {
        super(QCwdDirectoryAttribute.class, forVariable(variable), "PUBLIC", "CWD_DIRECTORY_ATTRIBUTE");
        addMetadata();
    }

    public QCwdDirectoryAttribute(String variable, String schema, String table) {
        super(QCwdDirectoryAttribute.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectoryAttribute(Path<? extends QCwdDirectoryAttribute> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_DIRECTORY_ATTRIBUTE");
        addMetadata();
    }

    public QCwdDirectoryAttribute(PathMetadata<?> metadata) {
        super(QCwdDirectoryAttribute.class, metadata, "PUBLIC", "CWD_DIRECTORY_ATTRIBUTE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("ATTRIBUTE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(attributeValue, ColumnMetadata.named("ATTRIBUTE_VALUE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

