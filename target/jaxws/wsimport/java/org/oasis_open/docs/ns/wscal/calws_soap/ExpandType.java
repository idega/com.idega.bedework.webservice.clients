
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The expand XML element specifies that for a
 *         given calendaring REPORT request, the server MUST expand the
 *         recurrence set into calendar components that define exactly one
 *         recurrence instance, and MUST return only those whose scheduled
 *         time intersect a specified time range.
 *   
 *         The "start" attribute specifies the inclusive start of the time
 *         range, and the "end" attribute specifies the non-inclusive end of
 *         the time range.  Both attributes are specified as date with UTC
 *         time value.  The value of the "end" attribute MUST be greater than
 *         the value of the "start" attribute.
 *   
 *         The server MUST use the same logic as defined for timeRange 
 *         to determine if a recurrence instance intersects the
 *         specified time range.
 *   
 *         Recurring components, other than the initial instance, MUST
 *         include a RECURRENCE-ID property indicating which instance they
 *         refer to.
 *   
 *         The returned calendar components MUST NOT use recurrence
 *         properties (i.e., EXDATE, EXRULE, RDATE, and RRULE) and MUST NOT
 *         have reference to or include VTIMEZONE components.  Date and local
 *         time with reference to time zone information MUST be converted
 *         into date with UTC time.
 *       
 * 
 * <p>Java class for ExpandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpandType">
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
@XmlType(name = "ExpandType")
public class ExpandType
    extends UTCTimeRangeType
{


}
