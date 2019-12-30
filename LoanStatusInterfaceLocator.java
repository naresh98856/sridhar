/**
 * LoanStatusInterfaceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flagstar.mortrac.webservice.LoanStatusInterface;

public class LoanStatusInterfaceLocator extends org.apache.axis.client.Service implements com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterface {

    public LoanStatusInterfaceLocator() {
    }


    public LoanStatusInterfaceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoanStatusInterfaceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoanStatusInterfaceEndpointPort
    private java.lang.String LoanStatusInterfaceEndpointPort_address = "https://wholesale.dev.flagstar.com/webservice/LoanStatusInterface";

    public java.lang.String getLoanStatusInterfaceEndpointPortAddress() {
        return LoanStatusInterfaceEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoanStatusInterfaceEndpointPortWSDDServiceName = "LoanStatusInterfaceEndpointPort";

    public java.lang.String getLoanStatusInterfaceEndpointPortWSDDServiceName() {
        return LoanStatusInterfaceEndpointPortWSDDServiceName;
    }

    public void setLoanStatusInterfaceEndpointPortWSDDServiceName(java.lang.String name) {
        LoanStatusInterfaceEndpointPortWSDDServiceName = name;
    }

    public com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpoint getLoanStatusInterfaceEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoanStatusInterfaceEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoanStatusInterfaceEndpointPort(endpoint);
    }

    public com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpoint getLoanStatusInterfaceEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpointBindingStub _stub = new com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpointBindingStub(portAddress, this);
            _stub.setPortName(getLoanStatusInterfaceEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoanStatusInterfaceEndpointPortEndpointAddress(java.lang.String address) {
        LoanStatusInterfaceEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpointBindingStub _stub = new com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpointBindingStub(new java.net.URL(LoanStatusInterfaceEndpointPort_address), this);
                _stub.setPortName(getLoanStatusInterfaceEndpointPortWSDDServiceName());
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
        if ("LoanStatusInterfaceEndpointPort".equals(inputPortName)) {
            return getLoanStatusInterfaceEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mortrac.flagstar.com/webservice/LoanStatusInterface", "LoanStatusInterface");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mortrac.flagstar.com/webservice/LoanStatusInterface", "LoanStatusInterfaceEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoanStatusInterfaceEndpointPort".equals(portName)) {
            setLoanStatusInterfaceEndpointPortEndpointAddress(address);
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
