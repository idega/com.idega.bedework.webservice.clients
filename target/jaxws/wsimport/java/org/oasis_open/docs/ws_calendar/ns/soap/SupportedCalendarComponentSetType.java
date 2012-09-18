
package org.oasis_open.docs.ws_calendar.ns.soap;

import java.util.ArrayList;
import java.util.List;
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
 *            Type returned in GetPropertiesResponse to define the allowable 
 *            component types within a collection or supported by the system.
 *       
 * 
 * <p>Java class for SupportedCalendarComponentSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedCalendarComponentSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}GetPropertiesBasePropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedCalendarComponentSetType", propOrder = {
    "baseComponent"
})
public class SupportedCalendarComponentSetType
    extends GetPropertiesBasePropertyType
{

    @XmlElementRef(name = "baseComponent", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected List<JAXBElement<? extends BaseComponentType>> baseComponent;

    /**
     * Gets the value of the baseComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VtodoType }{@code >}
     * {@link JAXBElement }{@code <}{@link VtimezoneType }{@code >}
     * {@link JAXBElement }{@code <}{@link WsCalendarIntervalType }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailableType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link WsCalendarGluonType }{@code >}
     * {@link JAXBElement }{@code <}{@link VfreebusyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DaylightType }{@code >}
     * {@link JAXBElement }{@code <}{@link VjournalType }{@code >}
     * {@link JAXBElement }{@code <}{@link VeventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValarmType }{@code >}
     * {@link JAXBElement }{@code <}{@link VavailabilityType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseComponentType>> getBaseComponent() {
        if (baseComponent == null) {
            baseComponent = new ArrayList<JAXBElement<? extends BaseComponentType>>();
        }
        return this.baseComponent;
    }

}
