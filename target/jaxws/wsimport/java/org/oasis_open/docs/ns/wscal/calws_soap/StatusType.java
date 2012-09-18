
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Not Found"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="No Access"/>
 *     &lt;enumeration value="Service Stopped"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    OK("OK"),
    @XmlEnumValue("Not Found")
    NOT_FOUND("Not Found"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("No Access")
    NO_ACCESS("No Access"),
    @XmlEnumValue("Service Stopped")
    SERVICE_STOPPED("Service Stopped"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
