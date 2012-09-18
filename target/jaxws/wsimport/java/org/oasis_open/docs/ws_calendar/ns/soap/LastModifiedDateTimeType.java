
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Type returned in GetPropertiesResponse to supply the date and time
 *            the targeted resource was last modified. 
 *       
 * 
 * <p>Java class for LastModifiedDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastModifiedDateTimeType">
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
@XmlType(name = "LastModifiedDateTimeType")
public class LastModifiedDateTimeType
    extends DateTimePropertyType
{


}
