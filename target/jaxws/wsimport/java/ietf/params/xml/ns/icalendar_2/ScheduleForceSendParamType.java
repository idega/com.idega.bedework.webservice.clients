
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       scheduleforcesendparam = "SCHEDULE-FORCE-SEND" "="
 *                               ("REQUEST"    ; Force a "REQUEST"
 *                              / "REPLY"      ; Force a "REPLY"
 *                              / iana-token)  ; IANA registered method
 *       
 * 
 * <p>Java class for ScheduleForceSendParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleForceSendParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}TextParameterType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleForceSendParamType")
public class ScheduleForceSendParamType
    extends TextParameterType
{


}
