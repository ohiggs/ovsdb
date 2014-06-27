/*
 * Copyright (C) 2013 Red Hat, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Authors : Madhu Venugopal
 */
package org.opendaylight.ovsdb.schema.openvswitch;


import java.util.Map;
import java.util.Set;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;


/*
 * Reusing the existing Table definitions and many of columns are not defined here
 * TODO : Fill up the missing Columns and include Supported DB Version
 */

@TypedTable(name="Queue", database="Open_vSwitch")
public interface Queue extends TypedBaseTable<GenericTableSchema> {
    @TypedColumn(name="dscp", method=MethodType.GETCOLUMN)
    public Column<GenericTableSchema, Set<Integer>> getDscpColumn() ;
    @TypedColumn(name="dscp", method=MethodType.SETDATA)
    public void setDscp(Set<Integer> dscp) ;

    @TypedColumn(name="other_config", method=MethodType.GETCOLUMN)
    public Column<GenericTableSchema, Map<String, String>> getOtherConfigColumn() ;
    @TypedColumn(name="other_config", method=MethodType.SETDATA)
    public void setOtherConfig(Map<String, String> otherConfig) ;

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN)
    public Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn() ;
    @TypedColumn(name="external_ids", method=MethodType.SETDATA)
    public void setExternalIds(Map<String, String> externalIds) ;
}