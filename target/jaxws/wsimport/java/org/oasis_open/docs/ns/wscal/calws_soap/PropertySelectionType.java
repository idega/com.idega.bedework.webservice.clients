
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
 *          Used to contain a selection of a single property. This selection 
 *          can be to apply a value change and/or to update the parameters.
 *       
 * 
 * <p>Java class for PropertySelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertySelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseProperty"/>
 *         &lt;element name="parameters" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ParametersSelectionType" minOccurs="0"/>
 *         &lt;element name="change" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}PropertyReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertySelectionType", propOrder = {
    "baseProperty",
    "parameters",
    "change"
})
public class PropertySelectionType {

    @XmlElementRef(name = "baseProperty", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BasePropertyType> baseProperty;
    protected ParametersSelectionType parameters;
    protected PropertyReferenceType change;

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

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersSelectionType }
     *     
     */
    public ParametersSelectionType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersSelectionType }
     *     
     */
    public void setParameters(ParametersSelectionType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyReferenceType }
     *     
     */
    public PropertyReferenceType getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyReferenceType }
     *     
     */
    public void setChange(PropertyReferenceType value) {
        this.change = value;
    }

}
