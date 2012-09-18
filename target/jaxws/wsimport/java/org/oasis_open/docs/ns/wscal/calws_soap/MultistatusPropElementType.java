
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            prop element type in propstat
 *       
 * 
 * <p>Java class for MultistatusPropElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultistatusPropElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="calendar-data" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}CalendarDataResponseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultistatusPropElementType", propOrder = {
    "calendarData"
})
public class MultistatusPropElementType {

    @XmlElement(name = "calendar-data")
    protected CalendarDataResponseType calendarData;

    /**
     * Gets the value of the calendarData property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDataResponseType }
     *     
     */
    public CalendarDataResponseType getCalendarData() {
        return calendarData;
    }

    /**
     * Sets the value of the calendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDataResponseType }
     *     
     */
    public void setCalendarData(CalendarDataResponseType value) {
        this.calendarData = value;
    }

}
