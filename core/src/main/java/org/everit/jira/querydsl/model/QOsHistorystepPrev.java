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
 * QOsHistorystepPrev is a Querydsl query type for QOsHistorystepPrev
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOsHistorystepPrev extends com.mysema.query.sql.RelationalPathBase<QOsHistorystepPrev> {

    private static final long serialVersionUID = 17863791;

    public static final QOsHistorystepPrev osHistorystepPrev = new QOsHistorystepPrev("OS_HISTORYSTEP_PREV");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> previousId = createNumber("previousId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QOsHistorystepPrev> osHistorystepPrevPk = createPrimaryKey(id, previousId);

    public QOsHistorystepPrev(String variable) {
        super(QOsHistorystepPrev.class, forVariable(variable), "PUBLIC", "OS_HISTORYSTEP_PREV");
        addMetadata();
    }

    public QOsHistorystepPrev(String variable, String schema, String table) {
        super(QOsHistorystepPrev.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsHistorystepPrev(Path<? extends QOsHistorystepPrev> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_HISTORYSTEP_PREV");
        addMetadata();
    }

    public QOsHistorystepPrev(PathMetadata<?> metadata) {
        super(QOsHistorystepPrev.class, metadata, "PUBLIC", "OS_HISTORYSTEP_PREV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(previousId, ColumnMetadata.named("PREVIOUS_ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

