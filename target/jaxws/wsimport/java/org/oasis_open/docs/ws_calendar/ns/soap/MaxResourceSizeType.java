
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Type which may be returned in GetPropertiesResponse when targeted at
 *          the system root or any collection resource. It provides the maximum 
 *          size of a resource in octets that the server is willing to accept when 
 *          stored in a collection
 *       
 * 
 * <p>Java class for MaxResourceSizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxResourceSizeType">
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
@XmlType(name = "MaxResourceSizeType")
public class MaxResourceSizeType
    extends IntegerPropertyType
{


}
