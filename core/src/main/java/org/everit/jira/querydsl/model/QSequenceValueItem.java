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
 * QSequenceValueItem is a Querydsl query type for QSequenceValueItem
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSequenceValueItem extends com.mysema.query.sql.RelationalPathBase<QSequenceValueItem> {

    private static final long serialVersionUID = 751646883;

    public static final QSequenceValueItem sequenceValueItem = new QSequenceValueItem("SEQUENCE_VALUE_ITEM");

    public final NumberPath<Long> seqId = createNumber("seqId", Long.class);

    public final StringPath seqName = createString("seqName");

    public final com.mysema.query.sql.PrimaryKey<QSequenceValueItem> sequenceValueItemPk = createPrimaryKey(seqName);

    public QSequenceValueItem(String variable) {
        super(QSequenceValueItem.class, forVariable(variable), "PUBLIC", "SEQUENCE_VALUE_ITEM");
        addMetadata();
    }

    public QSequenceValueItem(String variable, String schema, String table) {
        super(QSequenceValueItem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSequenceValueItem(Path<? extends QSequenceValueItem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SEQUENCE_VALUE_ITEM");
        addMetadata();
    }

    public QSequenceValueItem(PathMetadata<?> metadata) {
        super(QSequenceValueItem.class, metadata, "PUBLIC", "SEQUENCE_VALUE_ITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(seqId, ColumnMetadata.named("SEQ_ID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(seqName, ColumnMetadata.named("SEQ_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

