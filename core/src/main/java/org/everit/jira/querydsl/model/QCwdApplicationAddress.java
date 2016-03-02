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
 * QCwdApplicationAddress is a Querydsl query type for QCwdApplicationAddress
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCwdApplicationAddress extends com.mysema.query.sql.RelationalPathBase<QCwdApplicationAddress> {

    private static final long serialVersionUID = -1169654188;

    public static final QCwdApplicationAddress cwdApplicationAddress = new QCwdApplicationAddress("CWD_APPLICATION_ADDRESS");

    public final NumberPath<Long> applicationId = createNumber("applicationId", Long.class);

    public final StringPath encodedAddressBinary = createString("encodedAddressBinary");

    public final StringPath remoteAddress = createString("remoteAddress");

    public final NumberPath<Integer> remoteAddressMask = createNumber("remoteAddressMask", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QCwdApplicationAddress> cwdApplicationAddressPk = createPrimaryKey(applicationId, remoteAddress);

    public QCwdApplicationAddress(String variable) {
        super(QCwdApplicationAddress.class, forVariable(variable), "PUBLIC", "CWD_APPLICATION_ADDRESS");
        addMetadata();
    }

    public QCwdApplicationAddress(String variable, String schema, String table) {
        super(QCwdApplicationAddress.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdApplicationAddress(Path<? extends QCwdApplicationAddress> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_APPLICATION_ADDRESS");
        addMetadata();
    }

    public QCwdApplicationAddress(PathMetadata<?> metadata) {
        super(QCwdApplicationAddress.class, metadata, "PUBLIC", "CWD_APPLICATION_ADDRESS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(applicationId, ColumnMetadata.named("APPLICATION_ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(encodedAddressBinary, ColumnMetadata.named("ENCODED_ADDRESS_BINARY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(remoteAddress, ColumnMetadata.named("REMOTE_ADDRESS").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(remoteAddressMask, ColumnMetadata.named("REMOTE_ADDRESS_MASK").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

