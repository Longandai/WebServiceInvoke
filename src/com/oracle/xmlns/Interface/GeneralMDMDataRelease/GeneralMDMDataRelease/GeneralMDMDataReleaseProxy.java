package com.oracle.xmlns.Interface.GeneralMDMDataRelease.GeneralMDMDataRelease;

public class GeneralMDMDataReleaseProxy implements com.oracle.xmlns.Interface.GeneralMDMDataRelease.GeneralMDMDataRelease.GeneralMDMDataRelease {
  private String _endpoint = null;
  private com.oracle.xmlns.Interface.GeneralMDMDataRelease.GeneralMDMDataRelease.GeneralMDMDataRelease generalMDMDataRelease = null;
  
  public GeneralMDMDataReleaseProxy() {
    _initGeneralMDMDataReleaseProxy();
  }
  
  public GeneralMDMDataReleaseProxy(String endpoint) {
    _endpoint = endpoint;
    _initGeneralMDMDataReleaseProxy();
  }
  
  private void _initGeneralMDMDataReleaseProxy() {
    try {
      generalMDMDataRelease = (new com.oracle.xmlns.Interface.GeneralMDMDataRelease.GeneralMDMDataRelease.Generalmdmdatarelease_client_epLocator()).getGeneralMDMDataRelease_pt();
      if (generalMDMDataRelease != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)generalMDMDataRelease)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)generalMDMDataRelease)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (generalMDMDataRelease != null)
      ((javax.xml.rpc.Stub)generalMDMDataRelease)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.Interface.GeneralMDMDataRelease.GeneralMDMDataRelease.GeneralMDMDataRelease getGeneralMDMDataRelease() {
    if (generalMDMDataRelease == null)
      _initGeneralMDMDataReleaseProxy();
    return generalMDMDataRelease;
  }
  
  public void process(java.lang.String IN_SYS_NAME, java.lang.String IN_MASTER_TYPE, java.lang.String IN_TABLE_NAME, java.lang.String IN_STARTDATE, java.lang.String IN_ENDDATE, java.lang.String IN_PAGE, java.lang.String IN_BATCH_ID, javax.xml.rpc.holders.StringHolder OUT_PAGE, javax.xml.rpc.holders.StringHolder OUT_RESULT, javax.xml.rpc.holders.StringHolder OUT_RETCODE, javax.xml.rpc.holders.IntHolder OUT_ALL_NUM, javax.xml.rpc.holders.IntHolder OUT_PAGE_CON, javax.xml.rpc.holders.StringHolder OUT_ALL_COUNT, javax.xml.rpc.holders.StringHolder OUT_RETMSG, javax.xml.rpc.holders.StringHolder OUT_BATCH_ID) throws java.rmi.RemoteException{
    if (generalMDMDataRelease == null)
      _initGeneralMDMDataReleaseProxy();
    generalMDMDataRelease.process(IN_SYS_NAME, IN_MASTER_TYPE, IN_TABLE_NAME, IN_STARTDATE, IN_ENDDATE, IN_PAGE, IN_BATCH_ID, OUT_PAGE, OUT_RESULT, OUT_RETCODE, OUT_ALL_NUM, OUT_PAGE_CON, OUT_ALL_COUNT, OUT_RETMSG, OUT_BATCH_ID);
  }
  
  
}