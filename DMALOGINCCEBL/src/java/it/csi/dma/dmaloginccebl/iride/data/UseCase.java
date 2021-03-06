/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
*
* SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.dma.dmaloginccebl.iride.data;

public class UseCase implements java.io.Serializable {
	private Application appId;

	private String id;

	public UseCase() {
	}

	public UseCase(Application appId, String id) {
		this.appId = appId;
		this.id = id;
	}

	/**
	 * Gets the appId value for this UseCase.
	 *
	 * @return appId
	 */
	public Application getAppId() {
		return appId;
	}

	/**
	 * Sets the appId value for this UseCase.
	 *
	 * @param appId
	 */
	public void setAppId(Application appId) {
		this.appId = appId;
	}

	/**
	 * Gets the id value for this UseCase.
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id value for this UseCase.
	 *
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof UseCase))
			return false;
		UseCase other = (UseCase) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.appId == null && other.getAppId() == null) || (this.appId != null && this.appId.equals(other.getAppId()))) && ((this.id == null && other
				.getId() == null) || (this.id != null && this.id.equals(other.getId())));
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
		if (getAppId() != null) {
			_hashCode += getAppId().hashCode();
		}
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(UseCase.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PolicyEnforcerBase", "UseCase"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("appId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "appId"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:PolicyEnforcerBase", "Application"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType,
                                                                    Class _javaType,
                                                                    javax.xml.namespace.QName _xmlType)
	{
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType,
                                                                        Class _javaType,
                                                                        javax.xml.namespace.QName _xmlType)
	{
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
