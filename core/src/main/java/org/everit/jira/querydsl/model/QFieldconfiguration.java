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
 * QFieldconfiguration is a Querydsl query type for QFieldconfiguration
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFieldconfiguration extends com.mysema.query.sql.RelationalPathBase<QFieldconfiguration> {

    private static final long serialVersionUID = 1715510012;

    public static final QFieldconfiguration fieldconfiguration = new QFieldconfiguration("FIELDCONFIGURATION");

    public final StringPath configname = createString("configname");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final StringPath description = createString("description");

    public final StringPath fieldid = createString("fieldid");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QFieldconfiguration> fieldconfigurationPk = createPrimaryKey(id);

    public QFieldconfiguration(String variable) {
        super(QFieldconfiguration.class, forVariable(variable), "PUBLIC", "FIELDCONFIGURATION");
        addMetadata();
    }

    public QFieldconfiguration(String variable, String schema, String table) {
        super(QFieldconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldconfiguration(Path<? extends QFieldconfiguration> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDCONFIGURATION");
        addMetadata();
    }

    public QFieldconfiguration(PathMetadata<?> metadata) {
        super(QFieldconfiguration.class, metadata, "PUBLIC", "FIELDCONFIGURATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(configname, ColumnMetadata.named("CONFIGNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldid, ColumnMetadata.named("FIELDID").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

