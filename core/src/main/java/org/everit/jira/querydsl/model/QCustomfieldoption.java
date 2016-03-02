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
 * QCustomfieldoption is a Querydsl query type for QCustomfieldoption
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCustomfieldoption extends com.mysema.query.sql.RelationalPathBase<QCustomfieldoption> {

    private static final long serialVersionUID = 1549115678;

    public static final QCustomfieldoption customfieldoption = new QCustomfieldoption("CUSTOMFIELDOPTION");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final NumberPath<Long> customfieldconfig = createNumber("customfieldconfig", Long.class);

    public final StringPath customvalue = createString("customvalue");

    public final StringPath disabled = createString("disabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath optiontype = createString("optiontype");

    public final NumberPath<Long> parentoptionid = createNumber("parentoptionid", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QCustomfieldoption> customfieldoptionPk = createPrimaryKey(id);

    public QCustomfieldoption(String variable) {
        super(QCustomfieldoption.class, forVariable(variable), "PUBLIC", "CUSTOMFIELDOPTION");
        addMetadata();
    }

    public QCustomfieldoption(String variable, String schema, String table) {
        super(QCustomfieldoption.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfieldoption(Path<? extends QCustomfieldoption> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CUSTOMFIELDOPTION");
        addMetadata();
    }

    public QCustomfieldoption(PathMetadata<?> metadata) {
        super(QCustomfieldoption.class, metadata, "PUBLIC", "CUSTOMFIELDOPTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(customfieldconfig, ColumnMetadata.named("CUSTOMFIELDCONFIG").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(customvalue, ColumnMetadata.named("CUSTOMVALUE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(disabled, ColumnMetadata.named("DISABLED").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(optiontype, ColumnMetadata.named("OPTIONTYPE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(parentoptionid, ColumnMetadata.named("PARENTOPTIONID").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT).withSize(19));
    }

}

