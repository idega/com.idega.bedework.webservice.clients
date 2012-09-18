
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BToA"/>
 *     &lt;enumeration value="AToB"/>
 *     &lt;enumeration value="bothWays"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SynchDirectionType")
@XmlEnum
public enum SynchDirectionType {

    @XmlEnumValue("BToA")
    B_TO_A("BToA"),
    @XmlEnumValue("AToB")
    A_TO_B("AToB"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays");
    private final String value;

    SynchDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchDirectionType fromValue(String v) {
        for (SynchDirectionType c: SynchDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
