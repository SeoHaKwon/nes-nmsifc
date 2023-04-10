/**
 * StatusEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kt.bcn.adaptor.equip.server.entity;

public class StatusEvent  implements java.io.Serializable {
    private java.lang.String additionalText;

    private java.lang.String location;

    private java.lang.String probableCause;

    private java.lang.String serverId;

    private java.lang.String serviceIp;

    private java.lang.String stsCode;

    private java.lang.String stsTime;

    private java.lang.String systemId;

    public StatusEvent() {
    }

    public StatusEvent(
           java.lang.String additionalText,
           java.lang.String location,
           java.lang.String probableCause,
           java.lang.String serverId,
           java.lang.String serviceIp,
           java.lang.String stsCode,
           java.lang.String stsTime,
           java.lang.String systemId) {
           this.additionalText = additionalText;
           this.location = location;
           this.probableCause = probableCause;
           this.serverId = serverId;
           this.serviceIp = serviceIp;
           this.stsCode = stsCode;
           this.stsTime = stsTime;
           this.systemId = systemId;
    }


    /**
     * Gets the additionalText value for this StatusEvent.
     * 
     * @return additionalText
     */
    public java.lang.String getAdditionalText() {
        return additionalText;
    }


    /**
     * Sets the additionalText value for this StatusEvent.
     * 
     * @param additionalText
     */
    public void setAdditionalText(java.lang.String additionalText) {
        this.additionalText = additionalText;
    }


    /**
     * Gets the location value for this StatusEvent.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this StatusEvent.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the probableCause value for this StatusEvent.
     * 
     * @return probableCause
     */
    public java.lang.String getProbableCause() {
        return probableCause;
    }


    /**
     * Sets the probableCause value for this StatusEvent.
     * 
     * @param probableCause
     */
    public void setProbableCause(java.lang.String probableCause) {
        this.probableCause = probableCause;
    }


    /**
     * Gets the serverId value for this StatusEvent.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this StatusEvent.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the serviceIp value for this StatusEvent.
     * 
     * @return serviceIp
     */
    public java.lang.String getServiceIp() {
        return serviceIp;
    }


    /**
     * Sets the serviceIp value for this StatusEvent.
     * 
     * @param serviceIp
     */
    public void setServiceIp(java.lang.String serviceIp) {
        this.serviceIp = serviceIp;
    }


    /**
     * Gets the stsCode value for this StatusEvent.
     * 
     * @return stsCode
     */
    public java.lang.String getStsCode() {
        return stsCode;
    }


    /**
     * Sets the stsCode value for this StatusEvent.
     * 
     * @param stsCode
     */
    public void setStsCode(java.lang.String stsCode) {
        this.stsCode = stsCode;
    }


    /**
     * Gets the stsTime value for this StatusEvent.
     * 
     * @return stsTime
     */
    public java.lang.String getStsTime() {
        return stsTime;
    }


    /**
     * Sets the stsTime value for this StatusEvent.
     * 
     * @param stsTime
     */
    public void setStsTime(java.lang.String stsTime) {
        this.stsTime = stsTime;
    }


    /**
     * Gets the systemId value for this StatusEvent.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this StatusEvent.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusEvent)) return false;
        StatusEvent other = (StatusEvent) obj;
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
            ((this.stsCode==null && other.getStsCode()==null) || 
             (this.stsCode!=null &&
              this.stsCode.equals(other.getStsCode()))) &&
            ((this.stsTime==null && other.getStsTime()==null) || 
             (this.stsTime!=null &&
              this.stsTime.equals(other.getStsTime()))) &&
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
        if (getStsCode() != null) {
            _hashCode += getStsCode().hashCode();
        }
        if (getStsTime() != null) {
            _hashCode += getStsTime().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.server.equip.adaptor.bcn.kt.com", "StatusEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("stsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stsTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stsTime"));
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
