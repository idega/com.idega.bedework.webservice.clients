
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Error indicating at least one of two conditions:
 *           1) the server does not allow the creation of calendar collections
 *              at the given location in its namespace, or 
 *           2) the parent collection of the Request-URI exists but cannot accept members;
 *       
 * 
 * <p>Java class for InvalidCalendarCollectionLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidCalendarCollectionLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}ErrorCodeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidCalendarCollectionLocationType")
public class InvalidCalendarCollectionLocationType
    extends ErrorCodeType
{


}
