
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.ActionPropType;
import ietf.params.xml.ns.icalendar_2.AttachPropType;
import ietf.params.xml.ns.icalendar_2.AttendeePropType;
import ietf.params.xml.ns.icalendar_2.BasePropertyType;
import ietf.params.xml.ns.icalendar_2.CalscalePropType;
import ietf.params.xml.ns.icalendar_2.CategoriesPropType;
import ietf.params.xml.ns.icalendar_2.ClassPropType;
import ietf.params.xml.ns.icalendar_2.CommentPropType;
import ietf.params.xml.ns.icalendar_2.CompletedPropType;
import ietf.params.xml.ns.icalendar_2.ContactPropType;
import ietf.params.xml.ns.icalendar_2.CreatedPropType;
import ietf.params.xml.ns.icalendar_2.DescriptionPropType;
import ietf.params.xml.ns.icalendar_2.DtendPropType;
import ietf.params.xml.ns.icalendar_2.DtstampPropType;
import ietf.params.xml.ns.icalendar_2.DtstartPropType;
import ietf.params.xml.ns.icalendar_2.DuePropType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import ietf.params.xml.ns.icalendar_2.ExdatePropType;
import ietf.params.xml.ns.icalendar_2.ExrulePropType;
import ietf.params.xml.ns.icalendar_2.FreebusyPropType;
import ietf.params.xml.ns.icalendar_2.GeoPropType;
import ietf.params.xml.ns.icalendar_2.LastModifiedPropType;
import ietf.params.xml.ns.icalendar_2.LinkPropType;
import ietf.params.xml.ns.icalendar_2.LocationPropType;
import ietf.params.xml.ns.icalendar_2.MethodPropType;
import ietf.params.xml.ns.icalendar_2.OrganizerPropType;
import ietf.params.xml.ns.icalendar_2.PercentCompletePropType;
import ietf.params.xml.ns.icalendar_2.PriorityPropType;
import ietf.params.xml.ns.icalendar_2.ProdidPropType;
import ietf.params.xml.ns.icalendar_2.RdatePropType;
import ietf.params.xml.ns.icalendar_2.RecurrenceIdPropType;
import ietf.params.xml.ns.icalendar_2.RelatedToPropType;
import ietf.params.xml.ns.icalendar_2.RepeatPropType;
import ietf.params.xml.ns.icalendar_2.RequestStatusPropType;
import ietf.params.xml.ns.icalendar_2.ResourcesPropType;
import ietf.params.xml.ns.icalendar_2.RrulePropType;
import ietf.params.xml.ns.icalendar_2.SequencePropType;
import ietf.params.xml.ns.icalendar_2.StatusPropType;
import ietf.params.xml.ns.icalendar_2.SummaryPropType;
import ietf.params.xml.ns.icalendar_2.TolerancePropType;
import ietf.params.xml.ns.icalendar_2.TranspPropType;
import ietf.params.xml.ns.icalendar_2.TriggerPropType;
import ietf.params.xml.ns.icalendar_2.TznamePropType;
import ietf.params.xml.ns.icalendar_2.TzoffsetfromPropType;
import ietf.params.xml.ns.icalendar_2.TzoffsettoPropType;
import ietf.params.xml.ns.icalendar_2.TzurlPropType;
import ietf.params.xml.ns.icalendar_2.UidPropType;
import ietf.params.xml.ns.icalendar_2.UrlPropType;
import ietf.params.xml.ns.icalendar_2.VersionPropType;
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
     *     {@link JAXBElement }{@code <}{@link CreatedPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepeatPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RrulePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MethodPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchEndtzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExrulePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestStatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoIntendedstatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzoffsetfromPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecurrenceIdPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttachPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContactPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DuePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LastModifiedPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrlPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommentPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TolerancePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FreebusyPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DescriptionPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RdatePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DtstampPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzurlPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RelatedToPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarAttachType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResourcesPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompletedPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActionPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DtstartPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalscalePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchStarttzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExdatePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchLastmodPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzoffsettoPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TznamePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoBusystatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SummaryPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProdidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkCostPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DtendPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoriesPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TriggerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SequencePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttendeePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranspPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PercentCompletePropType }{@code >}
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
     *     {@link JAXBElement }{@code <}{@link CreatedPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepeatPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RrulePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MethodPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchEndtzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExrulePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestStatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoIntendedstatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzoffsetfromPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecurrenceIdPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttachPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContactPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DuePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LastModifiedPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrlPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommentPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TolerancePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FreebusyPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DescriptionPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RdatePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DtstampPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzurlPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RelatedToPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WsCalendarAttachType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResourcesPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompletedPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActionPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DtstartPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalscalePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchStarttzidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExdatePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkExsynchLastmodPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzoffsettoPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TznamePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XMicrosoftCdoBusystatusPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SummaryPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProdidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkCostPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DtendPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoriesPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TriggerPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SequencePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttendeePropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UidPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranspPropType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PercentCompletePropType }{@code >}
     *     
     */
    public void setBaseProperty(JAXBElement<? extends BasePropertyType> value) {
        this.baseProperty = ((JAXBElement<? extends BasePropertyType> ) value);
    }

}
