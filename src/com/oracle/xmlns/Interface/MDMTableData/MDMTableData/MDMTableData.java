/**
 * MDMTableData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.Interface.MDMTableData.MDMTableData;

public interface MDMTableData extends java.rmi.Remote {
    public void process(java.lang.String IN_SYS_NAME, java.lang.String IN_MASTER_TYPE, java.lang.String IN_TABLE_NAME, java.lang.String IN_STARTDATE, java.lang.String IN_ENDDATE, java.lang.String IN_PAGE, javax.xml.rpc.holders.StringHolder OUT_PAGE, javax.xml.rpc.holders.StringHolder OUT_RESULT, javax.xml.rpc.holders.StringHolder RETCODE, javax.xml.rpc.holders.IntHolder ALL_COUNT, javax.xml.rpc.holders.IntHolder PAGE_CON, javax.xml.rpc.holders.StringHolder OUT_ALL_COUNT, javax.xml.rpc.holders.StringHolder RETMSG) throws java.rmi.RemoteException;
}
