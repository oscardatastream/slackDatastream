package com.curo.java._01_WS_Server;

public class TratadoDeCadenasProxy implements com.curo.java._01_WS_Server.TratadoDeCadenas {
  private String _endpoint = null;
  private com.curo.java._01_WS_Server.TratadoDeCadenas tratadoDeCadenas = null;
  
  public TratadoDeCadenasProxy() {
    _initTratadoDeCadenasProxy();
  }
  
  public TratadoDeCadenasProxy(String endpoint) {
    _endpoint = endpoint;
    _initTratadoDeCadenasProxy();
  }
  
  private void _initTratadoDeCadenasProxy() {
    try {
      tratadoDeCadenas = (new com.curo.java._01_WS_Server.TratadoDeCadenasServiceLocator()).getTratadoDeCadenas();
      if (tratadoDeCadenas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tratadoDeCadenas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tratadoDeCadenas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tratadoDeCadenas != null)
      ((javax.xml.rpc.Stub)tratadoDeCadenas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.curo.java._01_WS_Server.TratadoDeCadenas getTratadoDeCadenas() {
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas;
  }
  
  public java.lang.String convertirCadenaMayuscula(java.lang.String cadena) throws java.rmi.RemoteException{
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas.convertirCadenaMayuscula(cadena);
  }
  
  public java.lang.String convertirCadenaMinuscula(java.lang.String cadena) throws java.rmi.RemoteException{
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas.convertirCadenaMinuscula(cadena);
  }
  
  public java.lang.String convertirPrimeraLetraCadenaMayuscula(java.lang.String cadena) throws java.rmi.RemoteException{
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas.convertirPrimeraLetraCadenaMayuscula(cadena);
  }
  
  public java.lang.String convertirPrimeraLetraCadenaMinuscula(java.lang.String cadena) throws java.rmi.RemoteException{
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas.convertirPrimeraLetraCadenaMinuscula(cadena);
  }
  
  public java.lang.String convertirCadaPalabraCadenaMinuscula(java.lang.String cadena) throws java.rmi.RemoteException{
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas.convertirCadaPalabraCadenaMinuscula(cadena);
  }
  
  public java.lang.String convertirCadaPalabraCadenaMayuscula(java.lang.String cadena) throws java.rmi.RemoteException{
    if (tratadoDeCadenas == null)
      _initTratadoDeCadenasProxy();
    return tratadoDeCadenas.convertirCadaPalabraCadenaMayuscula(cadena);
  }
  
  
}