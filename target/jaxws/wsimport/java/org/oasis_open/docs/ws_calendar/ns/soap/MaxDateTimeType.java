
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Type which may be returned in GetPropertiesResponse when targeted at
 *          the system root or any collection resource. It provides the maximum 
 *          date and time for an event.
 *       
 * 
 * <p>Java class for MaxDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxDateTimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}DateTimePropertyType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxDateTimeType")
public class MaxDateTimeType
    extends DateTimePropertyType
{


}
