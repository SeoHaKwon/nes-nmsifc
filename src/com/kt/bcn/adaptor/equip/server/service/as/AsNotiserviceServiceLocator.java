/**
 * AsNotiserviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kt.bcn.adaptor.equip.server.service.as;

public class AsNotiserviceServiceLocator extends org.apache.axis.client.Service implements com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceService {

    public AsNotiserviceServiceLocator() {
    }


    public AsNotiserviceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AsNotiserviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for asNotiservice
    private java.lang.String asNotiservice_address = "http://192.168.144.119:9090/axis/services/asNotiservice";

    public java.lang.String getasNotiserviceAddress() {
        return asNotiservice_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String asNotiserviceWSDDServiceName = "asNotiservice";

    public java.lang.String getasNotiserviceWSDDServiceName() {
        return asNotiserviceWSDDServiceName;
    }

    public void setasNotiserviceWSDDServiceName(java.lang.String name) {
        asNotiserviceWSDDServiceName = name;
    }

    public com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice getasNotiservice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(asNotiservice_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getasNotiservice(endpoint);
    }

    public com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice getasNotiservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceSoapBindingStub _stub = new com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getasNotiserviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setasNotiserviceEndpointAddress(java.lang.String address) {
        asNotiservice_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice.class.isAssignableFrom(serviceEndpointInterface)) {
                com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceSoapBindingStub _stub = new com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceSoapBindingStub(new java.net.URL(asNotiservice_address), this);
                _stub.setPortName(getasNotiserviceWSDDServiceName());
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
        if ("asNotiservice".equals(inputPortName)) {
            return getasNotiservice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:as.service.server.equip.adaptor.bcn.kt.com", "AsNotiserviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:as.service.server.equip.adaptor.bcn.kt.com", "asNotiservice"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("asNotiservice".equals(portName)) {
            setasNotiserviceEndpointAddress(address);
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
