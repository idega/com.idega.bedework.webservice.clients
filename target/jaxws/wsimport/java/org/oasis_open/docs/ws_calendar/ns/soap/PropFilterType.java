
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
 *         The propFilter XML element specifies a query
 *         targeted at a specific calendar property (e.g., CATEGORIES) in the
 *         scope of the enclosing calendar component.  A calendar property is
 *         said to match a propFilter if:
 *   
 *         *  The propFilter XML element is empty and a property of
 *            the type specified by the "name" attribute exists in the
 *            enclosing calendar component;
 *   
 *         or:
 *   
 *         *  The propFilter XML element contains a is-not-defined 
 *            XML element and no property of the type specified by
 *            the "name" attribute exists in the enclosing calendar
 *            component;
 *   
 *         or:
 *   
 *         *  The propFilter XML element contains a timeRange
 *            XML element and the property value overlaps the specified time
 *            range, and all specified paramFilter child XML elements
 *            also match the targeted property;
 *   
 *         or:
 *   
 *         *  The propFilter XML element contains a textMatch
 *            XML element and the property value matches it, and all
 *            specified paramFilter child XML elements also match the
 *            targeted property;
 *       
 * 
 * <p>Java class for PropFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseProperty"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}is-not-defined"/>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}timeRange"/>
 *               &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}textMatch"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}paramFilter" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PropFilterType", propOrder = {
    "baseProperty",
    "isNotDefined",
    "timeRange",
    "textMatch",
    "paramFilter"
})
public class PropFilterType {

    @XmlElementRef(name = "baseProperty", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BasePropertyType> baseProperty;
    @XmlElement(name = "is-not-defined")
    protected IsNotDefinedType isNotDefined;
    protected UTCTimeRangeType timeRange;
    protected TextMatchType textMatch;
    protected List<ParamFilterType> paramFilter;
    @XmlAttribute
    protected String test;

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
     * Gets the value of the textMatch property.
     * 
     * @return
     *     possible object is
     *     {@link TextMatchType }
     *     
     */
    public TextMatchType getTextMatch() {
        return textMatch;
    }

    /**
     * Sets the value of the textMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextMatchType }
     *     
     */
    public void setTextMatch(TextMatchType value) {
        this.textMatch = value;
    }

    /**
     * Gets the value of the paramFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamFilterType }
     * 
     * 
     */
    public List<ParamFilterType> getParamFilter() {
        if (paramFilter == null) {
            paramFilter = new ArrayList<ParamFilterType>();
        }
        return this.paramFilter;
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
