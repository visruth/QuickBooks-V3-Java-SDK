//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 04:44:35 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyPaymentMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyPaymentMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACH_CREDIT"/>
 *     &lt;enumeration value="ACH_DEBIT"/>
 *     &lt;enumeration value="CHECK"/>
 *     &lt;enumeration value="WIRE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgencyPaymentMethodEnum")
@XmlEnum
public enum AgencyPaymentMethodEnum {

    ACH_CREDIT,
    ACH_DEBIT,
    CHECK,
    WIRE,
    OTHER;

    public String value() {
        return name();
    }

    public static AgencyPaymentMethodEnum fromValue(String v) {
        return valueOf(v);
    }

}