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
 * QUpgradehistory is a Querydsl query type for QUpgradehistory
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUpgradehistory extends com.mysema.query.sql.RelationalPathBase<QUpgradehistory> {

    private static final long serialVersionUID = 1614164920;

    public static final QUpgradehistory upgradehistory = new QUpgradehistory("UPGRADEHISTORY");

    public final StringPath downgradetaskrequired = createString("downgradetaskrequired");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath status = createString("status");

    public final StringPath targetbuild = createString("targetbuild");

    public final StringPath upgradeclass = createString("upgradeclass");

    public final com.mysema.query.sql.PrimaryKey<QUpgradehistory> upgradehistoryPk = createPrimaryKey(upgradeclass);

    public QUpgradehistory(String variable) {
        super(QUpgradehistory.class, forVariable(variable), "PUBLIC", "UPGRADEHISTORY");
        addMetadata();
    }

    public QUpgradehistory(String variable, String schema, String table) {
        super(QUpgradehistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUpgradehistory(Path<? extends QUpgradehistory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "UPGRADEHISTORY");
        addMetadata();
    }

    public QUpgradehistory(PathMetadata<?> metadata) {
        super(QUpgradehistory.class, metadata, "PUBLIC", "UPGRADEHISTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(downgradetaskrequired, ColumnMetadata.named("DOWNGRADETASKREQUIRED").withIndex(5).ofType(Types.CHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(targetbuild, ColumnMetadata.named("TARGETBUILD").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(upgradeclass, ColumnMetadata.named("UPGRADECLASS").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

