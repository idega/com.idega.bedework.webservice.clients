
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The limit-recurrence-set XML element specifies
 *         that for a given calendaring REPORT request, the server MUST
 *         return, in addition to the "master component", only the
 *         "overridden components" that impact a specified time range.  An
 *         overridden component impacts a time range if its current start and
 *         end times overlap the time range, or if the original start and end
 *         times - the ones that would have been used if the instance were
 *         not overridden - overlap the time range.
 *   
 *         The "start" attribute specifies the inclusive start of the time
 *         range, and the "end" attribute specifies the non-inclusive end of
 *         the time range.  Both attributes are specified as date with UTC
 *         time value.  The value of the "end" attribute MUST be greater than
 *         the value of the "start" attribute.
 *   
 *         The server MUST use the same logic as defined for timeRange 
 *         to determine if the current or original scheduled time of an
 *         "overridden" recurrence instance intersects the specified time
 *         range.
 *   
 *         Overridden components that have a RANGE parameter on their
 *         RECURRENCE-ID property may specify one or more instances in the
 *         recurrence set, and some of those instances may fall within the
 *         specified time range or may have originally fallen within the
 *         specified time range prior to being overridden.  If that is the
 *         case, the overridden component MUST be included in the results, as
 *         it has a direct impact on the interpretation of instances within
 *         the specified time range.
 *       
 * 
 * <p>Java class for LimitRecurrenceSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitRecurrenceSetType">
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
@XmlType(name = "LimitRecurrenceSetType")
public class LimitRecurrenceSetType
    extends UTCTimeRangeType
{


}
