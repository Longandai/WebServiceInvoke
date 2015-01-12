package com.oracle.xmlns.Interface.MDMTableData.MDMTableData;

public class MDMTableDataProxy implements com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData {
  private String _endpoint = null;
  private com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData mDMTableData = null;
  
  public MDMTableDataProxy() {
    _initMDMTableDataProxy();
  }
  
  public MDMTableDataProxy(String endpoint) {
    _endpoint = endpoint;
    _initMDMTableDataProxy();
  }
  
  private void _initMDMTableDataProxy() {
    try {
      mDMTableData = (new com.oracle.xmlns.Interface.MDMTableData.MDMTableData.Mdmtabledata_client_epLocator()).getMDMTableData_pt();
      if (mDMTableData != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mDMTableData)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mDMTableData)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mDMTableData != null)
      ((javax.xml.rpc.Stub)mDMTableData)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData getMDMTableData() {
    if (mDMTableData == null)
      _initMDMTableDataProxy();
    return mDMTableData;
  }
  
  public void process(java.lang.String IN_SYS_NAME, java.lang.String IN_MASTER_TYPE, java.lang.String IN_TABLE_NAME, java.lang.String IN_STARTDATE, java.lang.String IN_ENDDATE, java.lang.String IN_PAGE, javax.xml.rpc.holders.StringHolder OUT_PAGE, javax.xml.rpc.holders.StringHolder OUT_RESULT, javax.xml.rpc.holders.StringHolder RETCODE, javax.xml.rpc.holders.IntHolder ALL_COUNT, javax.xml.rpc.holders.IntHolder PAGE_CON, javax.xml.rpc.holders.StringHolder OUT_ALL_COUNT, javax.xml.rpc.holders.StringHolder RETMSG) throws java.rmi.RemoteException{
    if (mDMTableData == null)
      _initMDMTableDataProxy();
    mDMTableData.process(IN_SYS_NAME, IN_MASTER_TYPE, IN_TABLE_NAME, IN_STARTDATE, IN_ENDDATE, IN_PAGE, OUT_PAGE, OUT_RESULT, RETCODE, ALL_COUNT, PAGE_CON, OUT_ALL_COUNT, RETMSG);
  }
  
  
}