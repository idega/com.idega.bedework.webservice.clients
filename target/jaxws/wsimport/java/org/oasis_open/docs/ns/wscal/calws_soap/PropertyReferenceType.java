
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.BasePropertyType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import ietf.params.xml.ns.icalendar_2.LinkPropType;
import ietf.params.xml.ns.icalendar_2.OrganizerPropType;
import ietf.params.xml.ns.icalendar_2.TolerancePropType;
import ietf.params.xml.ns.icalendar_2.WsCalendarAttachType;
import ietf.params.xml.ns.icalendar_2.WsCalendarTypeType;
import ietf.params.xml.ns.icalendar_2.XBedeworkCostPropType;
import ietf.params.xml.ns.icalendar_2.XBedeworkExsynchEndtzidPropType;
import ietf.params.xml.ns.icalendar_2.XBedeworkExsynchLastmodPropType;
import ietf.params.xml.ns.icalendar_2.XBedeworkExsynchStarttzidPropType;
import ietf.params.xml.ns.icalendar_2.XMicrosoftCdoBusystatusPropType;
import ietf.params.xml.ns.icalendar_2.XMicrosoftCdoIntendedstatusPropType;


/**
 * 
 *          Used to contain a new value for change, a new property for add or 
 *          identify the property for remove.
 *       
 * 
 * <p>Java class for PropertyReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseProperty"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyReferenceType", propOrder = {
    "baseProperty"
})
public class PropertyReferenceType {

    @XmlElementRef(name = "baseProperty", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BasePropertyType> baseProperty;

    /**
     * Gets the value of the baseProperty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarAttachType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoBusystatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchEndtzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkCostPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchLastmodPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoIntendedstatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchStarttzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TolerancePropType }{@code >}
     *     
     */
    public JAXBElement<? extends BasePropertyType> getBaseProperty() {
        return baseProperty;
    }

    /**
     * Sets the value of the baseProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarAttachType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoBusystatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchEndtzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkCostPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchLastmodPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoIntendedstatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchStarttzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TolerancePropType }{@code >}
     *     
     */
    public void setBaseProperty(JAXBElement<? extends BasePropertyType> value) {
        this.baseProperty = ((JAXBElement<? extends BasePropertyType> ) value);
    }

}
