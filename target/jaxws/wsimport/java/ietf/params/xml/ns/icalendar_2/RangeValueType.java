
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="THISANDFUTURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RangeValueType")
@XmlEnum
public enum RangeValueType {

    THISANDFUTURE;

    public String value() {
        return name();
    }

    public static RangeValueType fromValue(String v) {
        return valueOf(v);
    }

}
