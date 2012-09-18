
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalProcessingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalProcessingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOW"/>
 *     &lt;enumeration value="SYNCH"/>
 *     &lt;enumeration value="REMOVE"/>
 *     &lt;enumeration value="SPECIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalProcessingType")
@XmlEnum
public enum CalProcessingType {

    ALLOW,
    SYNCH,
    REMOVE,
    SPECIAL;

    public String value() {
        return name();
    }

    public static CalProcessingType fromValue(String v) {
        return valueOf(v);
    }

}
