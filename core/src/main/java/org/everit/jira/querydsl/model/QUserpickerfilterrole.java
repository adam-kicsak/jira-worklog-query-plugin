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
 * QUserpickerfilterrole is a Querydsl query type for QUserpickerfilterrole
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserpickerfilterrole extends com.mysema.query.sql.RelationalPathBase<QUserpickerfilterrole> {

    private static final long serialVersionUID = 1430365575;

    public static final QUserpickerfilterrole userpickerfilterrole = new QUserpickerfilterrole("USERPICKERFILTERROLE");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectroleid = createNumber("projectroleid", Long.class);

    public final NumberPath<Long> userpickerfilter = createNumber("userpickerfilter", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QUserpickerfilterrole> userpickerfilterrolePk = createPrimaryKey(id);

    public QUserpickerfilterrole(String variable) {
        super(QUserpickerfilterrole.class, forVariable(variable), "PUBLIC", "USERPICKERFILTERROLE");
        addMetadata();
    }

    public QUserpickerfilterrole(String variable, String schema, String table) {
        super(QUserpickerfilterrole.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfilterrole(Path<? extends QUserpickerfilterrole> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERPICKERFILTERROLE");
        addMetadata();
    }

    public QUserpickerfilterrole(PathMetadata<?> metadata) {
        super(QUserpickerfilterrole.class, metadata, "PUBLIC", "USERPICKERFILTERROLE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(projectroleid, ColumnMetadata.named("PROJECTROLEID").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(userpickerfilter, ColumnMetadata.named("USERPICKERFILTER").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

