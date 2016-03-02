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
 * QLabel is a Querydsl query type for QLabel
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QLabel extends com.mysema.query.sql.RelationalPathBase<QLabel> {

    private static final long serialVersionUID = -520067532;

    public static final QLabel label1 = new QLabel("LABEL");

    public final NumberPath<Long> fieldid = createNumber("fieldid", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final StringPath label = createString("label");

    public final com.mysema.query.sql.PrimaryKey<QLabel> labelPk = createPrimaryKey(id);

    public QLabel(String variable) {
        super(QLabel.class, forVariable(variable), "PUBLIC", "LABEL");
        addMetadata();
    }

    public QLabel(String variable, String schema, String table) {
        super(QLabel.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLabel(Path<? extends QLabel> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LABEL");
        addMetadata();
    }

    public QLabel(PathMetadata<?> metadata) {
        super(QLabel.class, metadata, "PUBLIC", "LABEL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldid, ColumnMetadata.named("FIELDID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issue, ColumnMetadata.named("ISSUE").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(label, ColumnMetadata.named("LABEL").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

