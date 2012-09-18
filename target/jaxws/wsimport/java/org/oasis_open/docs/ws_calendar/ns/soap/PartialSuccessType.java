
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Indicates that a MultiOpType operation was partially successful. Returned
 *          when the operation is marked as non-atomic and one or more sub-operations
 *          failed. The entire response needs to be examined to determine which 
 *          operations failed.
 *       
 * 
 * <p>Java class for PartialSuccessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialSuccessType">
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
@XmlType(name = "PartialSuccessType")
public class PartialSuccessType
    extends ErrorCodeType
{


}
