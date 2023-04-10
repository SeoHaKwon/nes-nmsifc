/**
 * FailCallEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kt.bcn.adaptor.equip.server.entity;

public class FailCallEvent  implements java.io.Serializable {
    private java.lang.String asId;

    private java.lang.String fileLocation;

    private int fileSize;

    private java.lang.String password;

    private java.lang.String serviceIp;

    private java.lang.String systemId;

    private java.lang.String time;

    private java.lang.String userId;

    public FailCallEvent() {
    }

    public FailCallEvent(
           java.lang.String asId,
           java.lang.String fileLocation,
           int fileSize,
           java.lang.String password,
           java.lang.String serviceIp,
           java.lang.String systemId,
           java.lang.String time,
           java.lang.String userId) {
           this.asId = asId;
           this.fileLocation = fileLocation;
           this.fileSize = fileSize;
           this.password = password;
           this.serviceIp = serviceIp;
           this.systemId = systemId;
           this.time = time;
           this.userId = userId;
    }


    /**
     * Gets the asId value for this FailCallEvent.
     * 
     * @return asId
     */
    public java.lang.String getAsId() {
        return asId;
    }


    /**
     * Sets the asId value for this FailCallEvent.
     * 
     * @param asId
     */
    public void setAsId(java.lang.String asId) {
        this.asId = asId;
    }


    /**
     * Gets the fileLocation value for this FailCallEvent.
     * 
     * @return fileLocation
     */
    public java.lang.String getFileLocation() {
        return fileLocation;
    }


    /**
     * Sets the fileLocation value for this FailCallEvent.
     * 
     * @param fileLocation
     */
    public void setFileLocation(java.lang.String fileLocation) {
        this.fileLocation = fileLocation;
    }


    /**
     * Gets the fileSize value for this FailCallEvent.
     * 
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this FailCallEvent.
     * 
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the password value for this FailCallEvent.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this FailCallEvent.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the serviceIp value for this FailCallEvent.
     * 
     * @return serviceIp
     */
    public java.lang.String getServiceIp() {
        return serviceIp;
    }


    /**
     * Sets the serviceIp value for this FailCallEvent.
     * 
     * @param serviceIp
     */
    public void setServiceIp(java.lang.String serviceIp) {
        this.serviceIp = serviceIp;
    }


    /**
     * Gets the systemId value for this FailCallEvent.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this FailCallEvent.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }


    /**
     * Gets the time value for this FailCallEvent.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this FailCallEvent.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the userId value for this FailCallEvent.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this FailCallEvent.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailCallEvent)) return false;
        FailCallEvent other = (FailCallEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asId==null && other.getAsId()==null) || 
             (this.asId!=null &&
              this.asId.equals(other.getAsId()))) &&
            ((this.fileLocation==null && other.getFileLocation()==null) || 
             (this.fileLocation!=null &&
              this.fileLocation.equals(other.getFileLocation()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.serviceIp==null && other.getServiceIp()==null) || 
             (this.serviceIp!=null &&
              this.serviceIp.equals(other.getServiceIp()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getAsId() != null) {
            _hashCode += getAsId().hashCode();
        }
        if (getFileLocation() != null) {
            _hashCode += getFileLocation().hashCode();
        }
        _hashCode += getFileSize();
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getServiceIp() != null) {
            _hashCode += getServiceIp().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailCallEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.server.equip.adaptor.bcn.kt.com", "FailCallEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
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
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
