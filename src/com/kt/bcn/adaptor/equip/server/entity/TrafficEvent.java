/**
 * TrafficEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kt.bcn.adaptor.equip.server.entity;

public class TrafficEvent  implements java.io.Serializable {
    private java.lang.String fileLocation;

    private int fileSize;

    private java.lang.String serviceIp;

    private java.lang.String systemId;

    public TrafficEvent() {
    }

    public TrafficEvent(
           java.lang.String fileLocation,
           int fileSize,
           java.lang.String serviceIp,
           java.lang.String systemId) {
           this.fileLocation = fileLocation;
           this.fileSize = fileSize;
           this.serviceIp = serviceIp;
           this.systemId = systemId;
    }


    /**
     * Gets the fileLocation value for this TrafficEvent.
     * 
     * @return fileLocation
     */
    public java.lang.String getFileLocation() {
        return fileLocation;
    }


    /**
     * Sets the fileLocation value for this TrafficEvent.
     * 
     * @param fileLocation
     */
    public void setFileLocation(java.lang.String fileLocation) {
        this.fileLocation = fileLocation;
    }


    /**
     * Gets the fileSize value for this TrafficEvent.
     * 
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this TrafficEvent.
     * 
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the serviceIp value for this TrafficEvent.
     * 
     * @return serviceIp
     */
    public java.lang.String getServiceIp() {
        return serviceIp;
    }


    /**
     * Sets the serviceIp value for this TrafficEvent.
     * 
     * @param serviceIp
     */
    public void setServiceIp(java.lang.String serviceIp) {
        this.serviceIp = serviceIp;
    }


    /**
     * Gets the systemId value for this TrafficEvent.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this TrafficEvent.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficEvent)) return false;
        TrafficEvent other = (TrafficEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileLocation==null && other.getFileLocation()==null) || 
             (this.fileLocation!=null &&
              this.fileLocation.equals(other.getFileLocation()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.serviceIp==null && other.getServiceIp()==null) || 
             (this.serviceIp!=null &&
              this.serviceIp.equals(other.getServiceIp()))) &&
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
        if (getFileLocation() != null) {
            _hashCode += getFileLocation().hashCode();
        }
        _hashCode += getFileSize();
        if (getServiceIp() != null) {
            _hashCode += getServiceIp().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.server.equip.adaptor.bcn.kt.com", "TrafficEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
