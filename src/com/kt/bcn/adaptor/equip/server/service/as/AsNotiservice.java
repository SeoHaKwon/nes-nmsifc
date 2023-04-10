/**
 * AsNotiservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kt.bcn.adaptor.equip.server.service.as;

public interface AsNotiservice extends java.rmi.Remote {
    public void alarmEvent(com.kt.bcn.adaptor.equip.server.entity.AlarmEvent in0) throws java.rmi.RemoteException;
    public void statusEvent(com.kt.bcn.adaptor.equip.server.entity.StatusEvent in0) throws java.rmi.RemoteException;
    public void trafficEvent(com.kt.bcn.adaptor.equip.server.entity.TrafficEvent in0) throws java.rmi.RemoteException;
    public void failCallEvent(com.kt.bcn.adaptor.equip.server.entity.FailCallEvent in0) throws java.rmi.RemoteException;
}
