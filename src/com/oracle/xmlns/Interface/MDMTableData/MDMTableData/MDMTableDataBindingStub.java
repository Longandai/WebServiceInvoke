/**
 * MDMTableDataBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.Interface.MDMTableData.MDMTableData;

public class MDMTableDataBindingStub extends org.apache.axis.client.Stub implements com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "IN_SYS_NAME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "IN_MASTER_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "IN_TABLE_NAME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "IN_STARTDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "IN_ENDDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "IN_PAGE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_PAGE"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_RESULT"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "RETCODE"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "ALL_COUNT"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "PAGE_CON"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_ALL_COUNT"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "RETMSG"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public MDMTableDataBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MDMTableDataBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MDMTableDataBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void process(java.lang.String IN_SYS_NAME, java.lang.String IN_MASTER_TYPE, java.lang.String IN_TABLE_NAME, java.lang.String IN_STARTDATE, java.lang.String IN_ENDDATE, java.lang.String IN_PAGE, javax.xml.rpc.holders.StringHolder OUT_PAGE, javax.xml.rpc.holders.StringHolder OUT_RESULT, javax.xml.rpc.holders.StringHolder RETCODE, javax.xml.rpc.holders.IntHolder ALL_COUNT, javax.xml.rpc.holders.IntHolder PAGE_CON, javax.xml.rpc.holders.StringHolder OUT_ALL_COUNT, javax.xml.rpc.holders.StringHolder RETMSG) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("process");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IN_SYS_NAME, IN_MASTER_TYPE, IN_TABLE_NAME, IN_STARTDATE, IN_ENDDATE, IN_PAGE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                OUT_PAGE.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_PAGE"));
            } catch (java.lang.Exception _exception) {
                OUT_PAGE.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_PAGE")), java.lang.String.class);
            }
            try {
                OUT_RESULT.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_RESULT"));
            } catch (java.lang.Exception _exception) {
                OUT_RESULT.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_RESULT")), java.lang.String.class);
            }
            try {
                RETCODE.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "RETCODE"));
            } catch (java.lang.Exception _exception) {
                RETCODE.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "RETCODE")), java.lang.String.class);
            }
            try {
                ALL_COUNT.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "ALL_COUNT"))).intValue();
            } catch (java.lang.Exception _exception) {
                ALL_COUNT.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "ALL_COUNT")), int.class)).intValue();
            }
            try {
                PAGE_CON.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "PAGE_CON"))).intValue();
            } catch (java.lang.Exception _exception) {
                PAGE_CON.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "PAGE_CON")), int.class)).intValue();
            }
            try {
                OUT_ALL_COUNT.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_ALL_COUNT"));
            } catch (java.lang.Exception _exception) {
                OUT_ALL_COUNT.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "OUT_ALL_COUNT")), java.lang.String.class);
            }
            try {
                RETMSG.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "RETMSG"));
            } catch (java.lang.Exception _exception) {
                RETMSG.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "RETMSG")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
