/**
 * Mdmtabledata_client_epLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.Interface.MDMTableData.MDMTableData;

public class Mdmtabledata_client_epLocator extends org.apache.axis.client.Service implements com.oracle.xmlns.Interface.MDMTableData.MDMTableData.Mdmtabledata_client_ep {

    public Mdmtabledata_client_epLocator() {
    }


    public Mdmtabledata_client_epLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Mdmtabledata_client_epLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MDMTableData_pt
    private java.lang.String MDMTableData_pt_address = "http://10.135.16.46:10201/soa-infra/services/interface/MDMTableData/mdmtabledata_client_ep";

    public java.lang.String getMDMTableData_ptAddress() {
        return MDMTableData_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MDMTableData_ptWSDDServiceName = "MDMTableData_pt";

    public java.lang.String getMDMTableData_ptWSDDServiceName() {
        return MDMTableData_ptWSDDServiceName;
    }

    public void setMDMTableData_ptWSDDServiceName(java.lang.String name) {
        MDMTableData_ptWSDDServiceName = name;
    }

    public com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData getMDMTableData_pt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MDMTableData_pt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMDMTableData_pt(endpoint);
    }

    public com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData getMDMTableData_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableDataBindingStub _stub = new com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableDataBindingStub(portAddress, this);
            _stub.setPortName(getMDMTableData_ptWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMDMTableData_ptEndpointAddress(java.lang.String address) {
        MDMTableData_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableData.class.isAssignableFrom(serviceEndpointInterface)) {
                com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableDataBindingStub _stub = new com.oracle.xmlns.Interface.MDMTableData.MDMTableData.MDMTableDataBindingStub(new java.net.URL(MDMTableData_pt_address), this);
                _stub.setPortName(getMDMTableData_ptWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MDMTableData_pt".equals(inputPortName)) {
            return getMDMTableData_pt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "mdmtabledata_client_ep");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/Interface/MDMTableData/MDMTableData", "MDMTableData_pt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MDMTableData_pt".equals(portName)) {
            setMDMTableData_ptEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
