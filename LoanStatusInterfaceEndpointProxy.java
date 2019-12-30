package com.flagstar.mortrac.webservice.LoanStatusInterface;

public class LoanStatusInterfaceEndpointProxy implements com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpoint {
  private String _endpoint = null;
  private com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpoint loanStatusInterfaceEndpoint = null;
  
  public LoanStatusInterfaceEndpointProxy() {
    _initLoanStatusInterfaceEndpointProxy();
  }
  
  public LoanStatusInterfaceEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoanStatusInterfaceEndpointProxy();
  }
  
  private void _initLoanStatusInterfaceEndpointProxy() {
    try {
      loanStatusInterfaceEndpoint = (new com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceLocator()).getLoanStatusInterfaceEndpointPort();
      if (loanStatusInterfaceEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loanStatusInterfaceEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loanStatusInterfaceEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loanStatusInterfaceEndpoint != null)
      ((javax.xml.rpc.Stub)loanStatusInterfaceEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.flagstar.mortrac.webservice.LoanStatusInterface.LoanStatusInterfaceEndpoint getLoanStatusInterfaceEndpoint() {
    if (loanStatusInterfaceEndpoint == null)
      _initLoanStatusInterfaceEndpointProxy();
    return loanStatusInterfaceEndpoint;
  }
  
  public java.lang.String updateDelUWStatus(java.lang.String string_1) throws java.rmi.RemoteException{
    if (loanStatusInterfaceEndpoint == null)
      _initLoanStatusInterfaceEndpointProxy();
    return loanStatusInterfaceEndpoint.updateDelUWStatus(string_1);
  }
  
  public java.lang.String updateHudReviewStatus(java.lang.String string_1) throws java.rmi.RemoteException{
    if (loanStatusInterfaceEndpoint == null)
      _initLoanStatusInterfaceEndpointProxy();
    return loanStatusInterfaceEndpoint.updateHudReviewStatus(string_1);
  }
  
  public java.lang.String updatePostClosingStatus(java.lang.String string_1) throws java.rmi.RemoteException{
    if (loanStatusInterfaceEndpoint == null)
      _initLoanStatusInterfaceEndpointProxy();
    return loanStatusInterfaceEndpoint.updatePostClosingStatus(string_1);
  }
  
  public java.lang.String updateStatus(java.lang.String string_1) throws java.rmi.RemoteException{
    if (loanStatusInterfaceEndpoint == null)
      _initLoanStatusInterfaceEndpointProxy();
    return loanStatusInterfaceEndpoint.updateStatus(string_1);
  }
  
  
}