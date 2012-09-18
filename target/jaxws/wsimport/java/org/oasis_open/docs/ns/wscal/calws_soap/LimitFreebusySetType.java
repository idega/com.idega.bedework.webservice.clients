
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The limit-freebusy-set XML element specifies
 *         that for a given calendaring REPORT request, the server MUST only
 *         return the FREEBUSY property values of a VFREEBUSY component that
 *         intersects a specified time range.
 *   
 *         The "start" attribute specifies the inclusive start of the time
 *         range, and the "end" attribute specifies the non-inclusive end of
 *         the time range.  Both attributes are specified as "date with UTC
 *         time" value.  The value of the "end" attribute MUST be greater
 *         than the value of the "start" attribute.
 *   
 *         The server MUST use the same logic as defined for timeRange 
 *         to determine if a FREEBUSY property value intersects the
 *         specified time range.
 *       
 * 
 * <p>Java class for LimitFreebusySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitFreebusySetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}UTCTimeRangeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitFreebusySetType")
public class LimitFreebusySetType
    extends UTCTimeRangeType
{


}
