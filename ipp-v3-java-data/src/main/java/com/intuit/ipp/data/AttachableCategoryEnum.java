//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 04:44:35 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachableCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachableCategoryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Signature"/>
 *     &lt;enumeration value="Contact Photo"/>
 *     &lt;enumeration value="Receipt"/>
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachableCategoryEnum")
@XmlEnum
public enum AttachableCategoryEnum {

    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature"),
    @XmlEnumValue("Contact Photo")
    CONTACT_PHOTO("Contact Photo"),
    @XmlEnumValue("Receipt")
    RECEIPT("Receipt"),
    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Sound")
    SOUND("Sound"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AttachableCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachableCategoryEnum fromValue(String v) {
        for (AttachableCategoryEnum c: AttachableCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
