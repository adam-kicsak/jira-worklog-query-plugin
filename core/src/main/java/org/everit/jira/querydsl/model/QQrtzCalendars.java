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
 * QQrtzCalendars is a Querydsl query type for QQrtzCalendars
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QQrtzCalendars extends com.mysema.query.sql.RelationalPathBase<QQrtzCalendars> {

    private static final long serialVersionUID = -1851089010;

    public static final QQrtzCalendars qrtzCalendars = new QQrtzCalendars("QRTZ_CALENDARS");

    public final StringPath calendar = createString("calendar");

    public final StringPath calendarName = createString("calendarName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QQrtzCalendars> qrtzCalendarsPk = createPrimaryKey(calendarName);

    public QQrtzCalendars(String variable) {
        super(QQrtzCalendars.class, forVariable(variable), "PUBLIC", "QRTZ_CALENDARS");
        addMetadata();
    }

    public QQrtzCalendars(String variable, String schema, String table) {
        super(QQrtzCalendars.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzCalendars(Path<? extends QQrtzCalendars> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_CALENDARS");
        addMetadata();
    }

    public QQrtzCalendars(PathMetadata<?> metadata) {
        super(QQrtzCalendars.class, metadata, "PUBLIC", "QRTZ_CALENDARS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendar, ColumnMetadata.named("CALENDAR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(calendarName, ColumnMetadata.named("CALENDAR_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19));
    }

}

