/**
 * AlarmEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kt.bcn.adaptor.equip.server.entity;

public class AlarmEvent  implements java.io.Serializable {
    private java.lang.String additionalText;

    private int alarmCode;

    private java.lang.String alarmTime;

    private int alarmType;

    private java.lang.String location;

    private java.lang.String probableCause;

    private java.lang.String serverId;

    private java.lang.String serviceIp;

    private java.lang.String severity;

    private java.lang.String systemId;

    public AlarmEvent() {
    }

    public AlarmEvent(
           java.lang.String additionalText,
           int alarmCode,
           java.lang.String alarmTime,
           int alarmType,
           java.lang.String location,
           java.lang.String probableCause,
           java.lang.String serverId,
           java.lang.String serviceIp,
           java.lang.String severity,
           java.lang.String systemId) {
           this.additionalText = additionalText;
           this.alarmCode = alarmCode;
           this.alarmTime = alarmTime;
           this.alarmType = alarmType;
           this.location = location;
           this.probableCause = probableCause;
           this.serverId = serverId;
           this.serviceIp = serviceIp;
           this.severity = severity;
           this.systemId = systemId;
    }


    /**
     * Gets the additionalText value for this AlarmEvent.
     * 
     * @return additionalText
     */
    public java.lang.String getAdditionalText() {
        return additionalText;
    }


    /**
     * Sets the additionalText value for this AlarmEvent.
     * 
     * @param additionalText
     */
    public void setAdditionalText(java.lang.String additionalText) {
        this.additionalText = additionalText;
    }


    /**
     * Gets the alarmCode value for this AlarmEvent.
     * 
     * @return alarmCode
     */
    public int getAlarmCode() {
        return alarmCode;
    }


    /**
     * Sets the alarmCode value for this AlarmEvent.
     * 
     * @param alarmCode
     */
    public void setAlarmCode(int alarmCode) {
        this.alarmCode = alarmCode;
    }


    /**
     * Gets the alarmTime value for this AlarmEvent.
     * 
     * @return alarmTime
     */
    public java.lang.String getAlarmTime() {
        return alarmTime;
    }


    /**
     * Sets the alarmTime value for this AlarmEvent.
     * 
     * @param alarmTime
     */
    public void setAlarmTime(java.lang.String alarmTime) {
        this.alarmTime = alarmTime;
    }


    /**
     * Gets the alarmType value for this AlarmEvent.
     * 
     * @return alarmType
     */
    public int getAlarmType() {
        return alarmType;
    }


    /**
     * Sets the alarmType value for this AlarmEvent.
     * 
     * @param alarmType
     */
    public void setAlarmType(int alarmType) {
        this.alarmType = alarmType;
    }


    /**
     * Gets the location value for this AlarmEvent.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this AlarmEvent.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the probableCause value for this AlarmEvent.
     * 
     * @return probableCause
     */
    public java.lang.String getProbableCause() {
        return probableCause;
    }


    /**
     * Sets the probableCause value for this AlarmEvent.
     * 
     * @param probableCause
     */
    public void setProbableCause(java.lang.String probableCause) {
        this.probableCause = probableCause;
    }


    /**
     * Gets the serverId value for this AlarmEvent.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this AlarmEvent.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the serviceIp value for this AlarmEvent.
     * 
     * @return serviceIp
     */
    public java.lang.String getServiceIp() {
        return serviceIp;
    }


    /**
     * Sets the serviceIp value for this AlarmEvent.
     * 
     * @param serviceIp
     */
    public void setServiceIp(java.lang.String serviceIp) {
        this.serviceIp = serviceIp;
    }


    /**
     * Gets the severity value for this AlarmEvent.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this AlarmEvent.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the systemId value for this AlarmEvent.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this AlarmEvent.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmEvent)) return false;
        AlarmEvent other = (AlarmEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalText==null && other.getAdditionalText()==null) || 
             (this.additionalText!=null &&
              this.additionalText.equals(other.getAdditionalText()))) &&
            this.alarmCode == other.getAlarmCode() &&
            ((this.alarmTime==null && other.getAlarmTime()==null) || 
             (this.alarmTime!=null &&
              this.alarmTime.equals(other.getAlarmTime()))) &&
            this.alarmType == other.getAlarmType() &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.probableCause==null && other.getProbableCause()==null) || 
             (this.probableCause!=null &&
              this.probableCause.equals(other.getProbableCause()))) &&
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            ((this.serviceIp==null && other.getServiceIp()==null) || 
             (this.serviceIp!=null &&
              this.serviceIp.equals(other.getServiceIp()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdditionalText() != null) {
            _hashCode += getAdditionalText().hashCode();
        }
        _hashCode += getAlarmCode();
        if (getAlarmTime() != null) {
            _hashCode += getAlarmTime().hashCode();
        }
        _hashCode += getAlarmType();
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getProbableCause() != null) {
            _hashCode += getProbableCause().hashCode();
        }
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        if (getServiceIp() != null) {
            _hashCode += getServiceIp().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.server.equip.adaptor.bcn.kt.com", "AlarmEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probableCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "probableCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
