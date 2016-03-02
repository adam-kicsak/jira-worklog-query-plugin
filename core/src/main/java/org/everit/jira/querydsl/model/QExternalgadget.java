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
 * QExternalgadget is a Querydsl query type for QExternalgadget
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QExternalgadget extends com.mysema.query.sql.RelationalPathBase<QExternalgadget> {

    private static final long serialVersionUID = -1106479977;

    public static final QExternalgadget externalgadget = new QExternalgadget("EXTERNALGADGET");

    public final StringPath gadgetXml = createString("gadgetXml");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QExternalgadget> externalgadgetPk = createPrimaryKey(id);

    public QExternalgadget(String variable) {
        super(QExternalgadget.class, forVariable(variable), "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public QExternalgadget(String variable, String schema, String table) {
        super(QExternalgadget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalgadget(Path<? extends QExternalgadget> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public QExternalgadget(PathMetadata<?> metadata) {
        super(QExternalgadget.class, metadata, "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gadgetXml, ColumnMetadata.named("GADGET_XML").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

