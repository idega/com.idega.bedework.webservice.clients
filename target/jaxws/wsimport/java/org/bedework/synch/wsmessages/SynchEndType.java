
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchEndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchEndType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SynchEndType")
@XmlEnum
public enum SynchEndType {

    @XmlEnumValue("none")
    NONE("none"),
    A("A"),
    B("B");
    private final String value;

    SynchEndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchEndType fromValue(String v) {
        for (SynchEndType c: SynchEndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
