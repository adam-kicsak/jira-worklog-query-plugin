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
 * QProjectversion is a Querydsl query type for QProjectversion
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QProjectversion extends com.mysema.query.sql.RelationalPathBase<QProjectversion> {

    private static final long serialVersionUID = -1692986273;

    public static final QProjectversion projectversion = new QProjectversion("PROJECTVERSION");

    public final StringPath archived = createString("archived");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath released = createString("released");

    public final DateTimePath<java.sql.Timestamp> releasedate = createDateTime("releasedate", java.sql.Timestamp.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final DateTimePath<java.sql.Timestamp> startdate = createDateTime("startdate", java.sql.Timestamp.class);

    public final StringPath url = createString("url");

    public final StringPath vname = createString("vname");

    public final com.mysema.query.sql.PrimaryKey<QProjectversion> projectversionPk = createPrimaryKey(id);

    public QProjectversion(String variable) {
        super(QProjectversion.class, forVariable(variable), "PUBLIC", "PROJECTVERSION");
        addMetadata();
    }

    public QProjectversion(String variable, String schema, String table) {
        super(QProjectversion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectversion(Path<? extends QProjectversion> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECTVERSION");
        addMetadata();
    }

    public QProjectversion(PathMetadata<?> metadata) {
        super(QProjectversion.class, metadata, "PUBLIC", "PROJECTVERSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(archived, ColumnMetadata.named("ARCHIVED").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(released, ColumnMetadata.named("RELEASED").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(releasedate, ColumnMetadata.named("RELEASEDATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(10));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(vname, ColumnMetadata.named("VNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

