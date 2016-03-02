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
 * QJquartzSimpropTriggers is a Querydsl query type for QJquartzSimpropTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QJquartzSimpropTriggers extends com.mysema.query.sql.RelationalPathBase<QJquartzSimpropTriggers> {

    private static final long serialVersionUID = -768708848;

    public static final QJquartzSimpropTriggers jquartzSimpropTriggers = new QJquartzSimpropTriggers("JQUARTZ_SIMPROP_TRIGGERS");

    public final BooleanPath boolProp1 = createBoolean("boolProp1");

    public final BooleanPath boolProp2 = createBoolean("boolProp2");

    public final NumberPath<Double> decProp1 = createNumber("decProp1", Double.class);

    public final NumberPath<Double> decProp2 = createNumber("decProp2", Double.class);

    public final NumberPath<Integer> intProp1 = createNumber("intProp1", Integer.class);

    public final NumberPath<Integer> intProp2 = createNumber("intProp2", Integer.class);

    public final NumberPath<Long> longProp1 = createNumber("longProp1", Long.class);

    public final NumberPath<Long> longProp2 = createNumber("longProp2", Long.class);

    public final StringPath schedName = createString("schedName");

    public final StringPath strProp1 = createString("strProp1");

    public final StringPath strProp2 = createString("strProp2");

    public final StringPath strProp3 = createString("strProp3");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.mysema.query.sql.PrimaryKey<QJquartzSimpropTriggers> jquartzSimpropTriggersPk = createPrimaryKey(triggerGroup, triggerName);

    public QJquartzSimpropTriggers(String variable) {
        super(QJquartzSimpropTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_SIMPROP_TRIGGERS");
        addMetadata();
    }

    public QJquartzSimpropTriggers(String variable, String schema, String table) {
        super(QJquartzSimpropTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzSimpropTriggers(Path<? extends QJquartzSimpropTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_SIMPROP_TRIGGERS");
        addMetadata();
    }

    public QJquartzSimpropTriggers(PathMetadata<?> metadata) {
        super(QJquartzSimpropTriggers.class, metadata, "PUBLIC", "JQUARTZ_SIMPROP_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boolProp1, ColumnMetadata.named("BOOL_PROP_1").withIndex(13).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(boolProp2, ColumnMetadata.named("BOOL_PROP_2").withIndex(14).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(decProp1, ColumnMetadata.named("DEC_PROP_1").withIndex(11).ofType(Types.DECIMAL).withSize(13).withDigits(4));
        addMetadata(decProp2, ColumnMetadata.named("DEC_PROP_2").withIndex(12).ofType(Types.DECIMAL).withSize(13).withDigits(4));
        addMetadata(intProp1, ColumnMetadata.named("INT_PROP_1").withIndex(7).ofType(Types.DECIMAL).withSize(9));
        addMetadata(intProp2, ColumnMetadata.named("INT_PROP_2").withIndex(8).ofType(Types.DECIMAL).withSize(9));
        addMetadata(longProp1, ColumnMetadata.named("LONG_PROP_1").withIndex(9).ofType(Types.DECIMAL).withSize(13));
        addMetadata(longProp2, ColumnMetadata.named("LONG_PROP_2").withIndex(10).ofType(Types.DECIMAL).withSize(13));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(strProp1, ColumnMetadata.named("STR_PROP_1").withIndex(4).ofType(Types.VARCHAR).withSize(512));
        addMetadata(strProp2, ColumnMetadata.named("STR_PROP_2").withIndex(5).ofType(Types.VARCHAR).withSize(512));
        addMetadata(strProp3, ColumnMetadata.named("STR_PROP_3").withIndex(6).ofType(Types.VARCHAR).withSize(512));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

