
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Type which may be returned in GetPropertiesResponse when targeted at
 *          the system root or any collection resource. It provides the maximum 
 *          number of attendees for each instance of a scheduling event.
 *       
 * 
 * <p>Java class for MaxAttendeesPerInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxAttendeesPerInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}IntegerPropertyType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxAttendeesPerInstanceType")
public class MaxAttendeesPerInstanceType
    extends IntegerPropertyType
{


}
