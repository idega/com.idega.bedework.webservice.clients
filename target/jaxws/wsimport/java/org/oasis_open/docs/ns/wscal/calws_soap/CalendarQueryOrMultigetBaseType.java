
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.IcalendarType;


/**
 * 
 *            Base type for query or multiget.
 *       
 * 
 * <p>Java class for CalendarQueryOrMultigetBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarQueryOrMultigetBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseRequestType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}allprop"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}icalendar"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="expand" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ExpandType"/>
 *           &lt;element name="limitRecurrenceSet" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}LimitRecurrenceSetType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarQueryOrMultigetBaseType", propOrder = {
    "allprop",
    "icalendar",
    "expand",
    "limitRecurrenceSet"
})
@XmlSeeAlso({
    CalendarQueryType.class,
    CalendarMultigetType.class
})
public class CalendarQueryOrMultigetBaseType
    extends BaseRequestType
{

    protected AllpropType allprop;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected IcalendarType icalendar;
    protected ExpandType expand;
    protected LimitRecurrenceSetType limitRecurrenceSet;

    /**
     * Gets the value of the allprop property.
     * 
     * @return
     *     possible object is
     *     {@link AllpropType }
     *     
     */
    public AllpropType getAllprop() {
        return allprop;
    }

    /**
     * Sets the value of the allprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllpropType }
     *     
     */
    public void setAllprop(AllpropType value) {
        this.allprop = value;
    }

    /**
     * Gets the value of the icalendar property.
     * 
     * @return
     *     possible object is
     *     {@link IcalendarType }
     *     
     */
    public IcalendarType getIcalendar() {
        return icalendar;
    }

    /**
     * Sets the value of the icalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcalendarType }
     *     
     */
    public void setIcalendar(IcalendarType value) {
        this.icalendar = value;
    }

    /**
     * Gets the value of the expand property.
     * 
     * @return
     *     possible object is
     *     {@link ExpandType }
     *     
     */
    public ExpandType getExpand() {
        return expand;
    }

    /**
     * Sets the value of the expand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpandType }
     *     
     */
    public void setExpand(ExpandType value) {
        this.expand = value;
    }

    /**
     * Gets the value of the limitRecurrenceSet property.
     * 
     * @return
     *     possible object is
     *     {@link LimitRecurrenceSetType }
     *     
     */
    public LimitRecurrenceSetType getLimitRecurrenceSet() {
        return limitRecurrenceSet;
    }

    /**
     * Sets the value of the limitRecurrenceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitRecurrenceSetType }
     *     
     */
    public void setLimitRecurrenceSet(LimitRecurrenceSetType value) {
        this.limitRecurrenceSet = value;
    }

}
