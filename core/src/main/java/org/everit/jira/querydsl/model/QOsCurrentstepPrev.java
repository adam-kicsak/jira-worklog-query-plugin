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
 * QOsCurrentstepPrev is a Querydsl query type for QOsCurrentstepPrev
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QOsCurrentstepPrev extends com.mysema.query.sql.RelationalPathBase<QOsCurrentstepPrev> {

    private static final long serialVersionUID = 1356576852;

    public static final QOsCurrentstepPrev osCurrentstepPrev = new QOsCurrentstepPrev("OS_CURRENTSTEP_PREV");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> previousId = createNumber("previousId", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QOsCurrentstepPrev> osCurrentstepPrevPk = createPrimaryKey(id, previousId);

    public QOsCurrentstepPrev(String variable) {
        super(QOsCurrentstepPrev.class, forVariable(variable), "PUBLIC", "OS_CURRENTSTEP_PREV");
        addMetadata();
    }

    public QOsCurrentstepPrev(String variable, String schema, String table) {
        super(QOsCurrentstepPrev.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsCurrentstepPrev(Path<? extends QOsCurrentstepPrev> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_CURRENTSTEP_PREV");
        addMetadata();
    }

    public QOsCurrentstepPrev(PathMetadata<?> metadata) {
        super(QOsCurrentstepPrev.class, metadata, "PUBLIC", "OS_CURRENTSTEP_PREV");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(previousId, ColumnMetadata.named("PREVIOUS_ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

