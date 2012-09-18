
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.AvailableType;
import ietf.params.xml.ns.icalendar_2.BaseComponentType;
import ietf.params.xml.ns.icalendar_2.DaylightType;
import ietf.params.xml.ns.icalendar_2.StandardType;
import ietf.params.xml.ns.icalendar_2.ValarmType;
import ietf.params.xml.ns.icalendar_2.VavailabilityType;
import ietf.params.xml.ns.icalendar_2.VeventType;
import ietf.params.xml.ns.icalendar_2.VfreebusyType;
import ietf.params.xml.ns.icalendar_2.VjournalType;
import ietf.params.xml.ns.icalendar_2.VtimezoneType;
import ietf.params.xml.ns.icalendar_2.VtodoType;
import ietf.params.xml.ns.icalendar_2.WsCalendarGluonType;
import ietf.params.xml.ns.icalendar_2.WsCalendarIntervalType;


/**
 * 
 *          Used to contain a new value.
 *       
 * 
 * <p>Java class for ComponentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentReferenceType", propOrder = {
    "baseComponent"
})
public class ComponentReferenceType {

    @XmlElementRef(name = "baseComponent", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BaseComponentType> baseComponent;

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

}
