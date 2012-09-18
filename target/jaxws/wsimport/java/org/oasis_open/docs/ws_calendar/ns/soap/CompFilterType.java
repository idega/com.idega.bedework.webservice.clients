
package org.oasis_open.docs.ws_calendar.ns.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.AvailableType;
import ietf.params.xml.ns.icalendar_2.BaseComponentType;
import ietf.params.xml.ns.icalendar_2.DaylightType;
import ietf.params.xml.ns.icalendar_2.StandardType;
import ietf.params.xml.ns.icalendar_2.ValarmType;
import ietf.params.xml.ns.icalendar_2.VavailabilityType;
import ietf.params.xml.ns.icalendar_2.VcalendarType;
import ietf.params.xml.ns.icalendar_2.VeventType;
import ietf.params.xml.ns.icalendar_2.VfreebusyType;
import ietf.params.xml.ns.icalendar_2.VjournalType;
import ietf.params.xml.ns.icalendar_2.VtimezoneType;
import ietf.params.xml.ns.icalendar_2.VtodoType;
import ietf.params.xml.ns.icalendar_2.WsCalendarGluonType;
import ietf.params.xml.ns.icalendar_2.WsCalendarIntervalType;


/**
 * 
 *         The compFilter XML element specifies a query
 *         targeted at the calendar object (i.e., VCALENDAR) or at a specific
 *         calendar component type (e.g., VEVENT).  The scope of the
 *         compFilter XML element is the calendar object when used as
 *         a child of the filter XML element.  The scope of the
 *         compFilter XML element is the enclosing calendar component
 *         when used as a child of another compFilter XML element.  A
 *         compFilter is said to match if:
 *   
 *         *  The compFilter XML element is empty and the calendar
 *            object or calendar component type specified by the "name"
 *            attribute exists in the current scope;
 *   
 *         or:
 *   
 *         *  The compFilter XML element contains a is-not-defined 
 *            XML element and the calendar object or calendar
 *            component type specified by the "name" attribute does not exist
 *            in the current scope;
 *   
 *         or:
 *   
 *         *  The compFilter XML element contains a timeRange
 *            XML element and at least one recurrence instance in the
 *            targeted calendar component is scheduled to overlap the
 *            specified time range, and all specified propFilter and
 *            compFilter child XML elements also match the targeted
 *            calendar component;
 *   
 *         or:
 *   
 *         *  The compFilter XML element only contains propFilter 
 *            and compFilter child XML elements that all match
 *            the targeted calendar component.
 *       
 * 
 * <p>Java class for CompFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}anyComp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vcalendar"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}is-not-defined"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}timeRange" minOccurs="0"/>
 *             &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}propFilter" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}compFilter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="test" type="{http://docs.oasis-open.org/ws-calendar/ns/soap}AnyofAllofType" default="anyof" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompFilterType", propOrder = {
    "anyComp",
    "vcalendar",
    "baseComponent",
    "isNotDefined",
    "timeRange",
    "propFilter",
    "compFilter"
})
public class CompFilterType {

    protected AnyCompType anyComp;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected VcalendarType vcalendar;
    @XmlElementRef(name = "baseComponent", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BaseComponentType> baseComponent;
    @XmlElement(name = "is-not-defined")
    protected IsNotDefinedType isNotDefined;
    protected UTCTimeRangeType timeRange;
    protected List<PropFilterType> propFilter;
    protected List<CompFilterType> compFilter;
    @XmlAttribute
    protected String test;

    /**
     * Gets the value of the anyComp property.
     * 
     * @return
     *     possible object is
     *     {@link AnyCompType }
     *     
     */
    public AnyCompType getAnyComp() {
        return anyComp;
    }

    /**
     * Sets the value of the anyComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyCompType }
     *     
     */
    public void setAnyComp(AnyCompType value) {
        this.anyComp = value;
    }

    /**
     * Gets the value of the vcalendar property.
     * 
     * @return
     *     possible object is
     *     {@link VcalendarType }
     *     
     */
    public VcalendarType getVcalendar() {
        return vcalendar;
    }

    /**
     * Sets the value of the vcalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcalendarType }
     *     
     */
    public void setVcalendar(VcalendarType value) {
        this.vcalendar = value;
    }

    /**
     * Gets the value of the baseComponent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VtodoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VtimezoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AvailableType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseComponentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarGluonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VfreebusyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DaylightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VjournalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VeventType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValarmType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VavailabilityType }{@code >}
     *     
     */
    public JAXBElement<? extends BaseComponentType> getBaseComponent() {
        return baseComponent;
    }

    /**
     * Sets the value of the baseComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VtodoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VtimezoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AvailableType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseComponentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarGluonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VfreebusyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DaylightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VjournalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VeventType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValarmType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VavailabilityType }{@code >}
     *     
     */
    public void setBaseComponent(JAXBElement<? extends BaseComponentType> value) {
        this.baseComponent = ((JAXBElement<? extends BaseComponentType> ) value);
    }

    /**
     * Gets the value of the isNotDefined property.
     * 
     * @return
     *     possible object is
     *     {@link IsNotDefinedType }
     *     
     */
    public IsNotDefinedType getIsNotDefined() {
        return isNotDefined;
    }

    /**
     * Sets the value of the isNotDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsNotDefinedType }
     *     
     */
    public void setIsNotDefined(IsNotDefinedType value) {
        this.isNotDefined = value;
    }

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link UTCTimeRangeType }
     *     
     */
    public UTCTimeRangeType getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTCTimeRangeType }
     *     
     */
    public void setTimeRange(UTCTimeRangeType value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the propFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropFilterType }
     * 
     * 
     */
    public List<PropFilterType> getPropFilter() {
        if (propFilter == null) {
            propFilter = new ArrayList<PropFilterType>();
        }
        return this.propFilter;
    }

    /**
     * Gets the value of the compFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompFilterType }
     * 
     * 
     */
    public List<CompFilterType> getCompFilter() {
        if (compFilter == null) {
            compFilter = new ArrayList<CompFilterType>();
        }
        return this.compFilter;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        if (test == null) {
            return "anyof";
        } else {
            return test;
        }
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

}
