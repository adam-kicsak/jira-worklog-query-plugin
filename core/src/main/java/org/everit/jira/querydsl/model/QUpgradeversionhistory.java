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
 * QUpgradeversionhistory is a Querydsl query type for QUpgradeversionhistory
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUpgradeversionhistory extends com.mysema.query.sql.RelationalPathBase<QUpgradeversionhistory> {

    private static final long serialVersionUID = -362920680;

    public static final QUpgradeversionhistory upgradeversionhistory = new QUpgradeversionhistory("UPGRADEVERSIONHISTORY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath targetbuild = createString("targetbuild");

    public final StringPath targetversion = createString("targetversion");

    public final DateTimePath<java.sql.Timestamp> timeperformed = createDateTime("timeperformed", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QUpgradeversionhistory> upgradeversionhistoryPk = createPrimaryKey(targetbuild);

    public QUpgradeversionhistory(String variable) {
        super(QUpgradeversionhistory.class, forVariable(variable), "PUBLIC", "UPGRADEVERSIONHISTORY");
        addMetadata();
    }

    public QUpgradeversionhistory(String variable, String schema, String table) {
        super(QUpgradeversionhistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUpgradeversionhistory(Path<? extends QUpgradeversionhistory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "UPGRADEVERSIONHISTORY");
        addMetadata();
    }

    public QUpgradeversionhistory(PathMetadata<?> metadata) {
        super(QUpgradeversionhistory.class, metadata, "PUBLIC", "UPGRADEVERSIONHISTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(targetbuild, ColumnMetadata.named("TARGETBUILD").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(targetversion, ColumnMetadata.named("TARGETVERSION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timeperformed, ColumnMetadata.named("TIMEPERFORMED").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
    }

}

