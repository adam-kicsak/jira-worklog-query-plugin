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
 * QFileattachment is a Querydsl query type for QFileattachment
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFileattachment extends com.mysema.query.sql.RelationalPathBase<QFileattachment> {

    private static final long serialVersionUID = 315548767;

    public static final QFileattachment fileattachment = new QFileattachment("FILEATTACHMENT");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> filesize = createNumber("filesize", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final StringPath mimetype = createString("mimetype");

    public final NumberPath<Integer> thumbnailable = createNumber("thumbnailable", Integer.class);

    public final NumberPath<Integer> zip = createNumber("zip", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QFileattachment> fileattachmentPk = createPrimaryKey(id);

    public QFileattachment(String variable) {
        super(QFileattachment.class, forVariable(variable), "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public QFileattachment(String variable, String schema, String table) {
        super(QFileattachment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFileattachment(Path<? extends QFileattachment> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public QFileattachment(PathMetadata<?> metadata) {
        super(QFileattachment.class, metadata, "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filesize, ColumnMetadata.named("FILESIZE").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(mimetype, ColumnMetadata.named("MIMETYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(thumbnailable, ColumnMetadata.named("THUMBNAILABLE").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(zip, ColumnMetadata.named("ZIP").withIndex(8).ofType(Types.INTEGER).withSize(10));
    }

}

