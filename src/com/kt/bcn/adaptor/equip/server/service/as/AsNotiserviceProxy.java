package com.kt.bcn.adaptor.equip.server.service.as;

public class AsNotiserviceProxy implements com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice {
  private String _endpoint = null;
  private com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice asNotiservice = null;
  
  public AsNotiserviceProxy() {
    _initAsNotiserviceProxy();
  }
  
  public AsNotiserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAsNotiserviceProxy();
  }
  
  private void _initAsNotiserviceProxy() {
    try {
      asNotiservice = (new com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceServiceLocator()).getasNotiservice();
      if (asNotiservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)asNotiservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)asNotiservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (asNotiservice != null)
      ((javax.xml.rpc.Stub)asNotiservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice getAsNotiservice() {
    if (asNotiservice == null)
      _initAsNotiserviceProxy();
    return asNotiservice;
  }
  
  public void alarmEvent(com.kt.bcn.adaptor.equip.server.entity.AlarmEvent in0) throws java.rmi.RemoteException{
    if (asNotiservice == null)
      _initAsNotiserviceProxy();
    asNotiservice.alarmEvent(in0);
  }
  
  public void statusEvent(com.kt.bcn.adaptor.equip.server.entity.StatusEvent in0) throws java.rmi.RemoteException{
    if (asNotiservice == null)
      _initAsNotiserviceProxy();
    asNotiservice.statusEvent(in0);
  }
  
  public void trafficEvent(com.kt.bcn.adaptor.equip.server.entity.TrafficEvent in0) throws java.rmi.RemoteException{
    if (asNotiservice == null)
      _initAsNotiserviceProxy();
    asNotiservice.trafficEvent(in0);
  }
  
  public void failCallEvent(com.kt.bcn.adaptor.equip.server.entity.FailCallEvent in0) throws java.rmi.RemoteException{
    if (asNotiservice == null)
      _initAsNotiserviceProxy();
    asNotiservice.failCallEvent(in0);
  }
  
  
}