
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *          Used to contain a selection of a single component. There are no changes
 *          that can be applied directly to components. They are containers for 
 *          properties or other components.
 *       
 * 
 * <p>Java class for ComponentSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vcalendar"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent"/>
 *         &lt;/choice>
 *         &lt;element name="properties" type="{http://docs.oasis-open.org/ws-calendar/ns/soap}PropertiesSelectionType" minOccurs="0"/>
 *         &lt;element name="components" type="{http://docs.oasis-open.org/ws-calendar/ns/soap}ComponentsSelectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentSelectionType", propOrder = {
    "vcalendar",
    "baseComponent",
    "properties",
    "components"
})
public class ComponentSelectionType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected VcalendarType vcalendar;
    @XmlElementRef(name = "baseComponent", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BaseComponentType> baseComponent;
    protected PropertiesSelectionType properties;
    protected ComponentsSelectionType components;

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
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesSelectionType }
     *     
     */
    public PropertiesSelectionType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesSelectionType }
     *     
     */
    public void setProperties(PropertiesSelectionType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsSelectionType }
     *     
     */
    public ComponentsSelectionType getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsSelectionType }
     *     
     */
    public void setComponents(ComponentsSelectionType value) {
        this.components = value;
    }

}
