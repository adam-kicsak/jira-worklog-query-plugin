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
 * QUserpickerfilter is a Querydsl query type for QUserpickerfilter
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserpickerfilter extends com.mysema.query.sql.RelationalPathBase<QUserpickerfilter> {

    private static final long serialVersionUID = -1195158127;

    public static final QUserpickerfilter userpickerfilter = new QUserpickerfilter("USERPICKERFILTER");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final NumberPath<Long> customfieldconfig = createNumber("customfieldconfig", Long.class);

    public final StringPath enabled = createString("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QUserpickerfilter> userpickerfilterPk = createPrimaryKey(id);

    public QUserpickerfilter(String variable) {
        super(QUserpickerfilter.class, forVariable(variable), "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public QUserpickerfilter(String variable, String schema, String table) {
        super(QUserpickerfilter.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfilter(Path<? extends QUserpickerfilter> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public QUserpickerfilter(PathMetadata<?> metadata) {
        super(QUserpickerfilter.class, metadata, "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(customfieldconfig, ColumnMetadata.named("CUSTOMFIELDCONFIG").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(enabled, ColumnMetadata.named("ENABLED").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

