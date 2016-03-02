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
 * QFeature is a Querydsl query type for QFeature
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFeature extends com.mysema.query.sql.RelationalPathBase<QFeature> {

    private static final long serialVersionUID = 1810272822;

    public static final QFeature feature = new QFeature("FEATURE");

    public final StringPath featureName = createString("featureName");

    public final StringPath featureType = createString("featureType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath userKey = createString("userKey");

    public final com.mysema.query.sql.PrimaryKey<QFeature> featurePk = createPrimaryKey(id);

    public QFeature(String variable) {
        super(QFeature.class, forVariable(variable), "PUBLIC", "FEATURE");
        addMetadata();
    }

    public QFeature(String variable, String schema, String table) {
        super(QFeature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFeature(Path<? extends QFeature> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FEATURE");
        addMetadata();
    }

    public QFeature(PathMetadata<?> metadata) {
        super(QFeature.class, metadata, "PUBLIC", "FEATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(featureName, ColumnMetadata.named("FEATURE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(featureType, ColumnMetadata.named("FEATURE_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userKey, ColumnMetadata.named("USER_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

