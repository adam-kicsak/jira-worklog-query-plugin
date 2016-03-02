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
 * QCwdGroupAttributes is a Querydsl query type for QCwdGroupAttributes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdGroupAttributes extends com.mysema.query.sql.RelationalPathBase<QCwdGroupAttributes> {

    private static final long serialVersionUID = 747147622;

    public static final QCwdGroupAttributes cwdGroupAttributes = new QCwdGroupAttributes("CWD_GROUP_ATTRIBUTES");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerAttributeValue = createString("lowerAttributeValue");

    public final com.mysema.query.sql.PrimaryKey<QCwdGroupAttributes> cwdGroupAttributesPk = createPrimaryKey(id);

    public QCwdGroupAttributes(String variable) {
        super(QCwdGroupAttributes.class, forVariable(variable), "PUBLIC", "CWD_GROUP_ATTRIBUTES");
        addMetadata();
    }

    public QCwdGroupAttributes(String variable, String schema, String table) {
        super(QCwdGroupAttributes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdGroupAttributes(Path<? extends QCwdGroupAttributes> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_GROUP_ATTRIBUTES");
        addMetadata();
    }

    public QCwdGroupAttributes(PathMetadata<?> metadata) {
        super(QCwdGroupAttributes.class, metadata, "PUBLIC", "CWD_GROUP_ATTRIBUTES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("ATTRIBUTE_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(attributeValue, ColumnMetadata.named("ATTRIBUTE_VALUE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(groupId, ColumnMetadata.named("GROUP_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lowerAttributeValue, ColumnMetadata.named("LOWER_ATTRIBUTE_VALUE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

