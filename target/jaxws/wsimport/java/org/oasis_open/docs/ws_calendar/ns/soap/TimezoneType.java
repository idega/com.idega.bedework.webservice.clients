
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         The timezone XML element specifies that for a
 *         given calendaring REPORT request, the server MUST rely on the
 *         specified VTIMEZONE component instead of the calendar-timezone 
 *         property of the calendar collection, in which the
 *         calendar object resource is contained to resolve "date" values and
 *         "date with local time" values (i.e., floating time) to "date with
 *         UTC time" values.  The server will require this information to
 *         determine if a calendar component scheduled with "date" values or
 *         "date with local time" values intersects a timeRange
 *         specified in a calendar-query REPORT.
 *   
 *         Note:  The iCalendar data embedded within the timezone XML
 *         element MUST follow the standard XML character data encoding
 *         rules, including use of <, >, & etc. entity encoding or
 *         the use of a  ...  construct.  In the later case, the
 *         iCalendar data cannot contain the character sequence ']' + ']' + '>', 
 *         which is the end delimiter for the CDATA section.
 *       
 * 
 * <p>Java class for TimezoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimezoneType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimezoneType", propOrder = {
    "value"
})
public class TimezoneType {

    @XmlValue
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
