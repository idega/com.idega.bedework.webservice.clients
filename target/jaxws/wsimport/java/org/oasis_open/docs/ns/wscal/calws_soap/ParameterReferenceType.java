
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.AltrepParamType;
import ietf.params.xml.ns.icalendar_2.BaseParameterType;
import ietf.params.xml.ns.icalendar_2.CnParamType;
import ietf.params.xml.ns.icalendar_2.CutypeParamType;
import ietf.params.xml.ns.icalendar_2.DelegatedFromParamType;
import ietf.params.xml.ns.icalendar_2.DelegatedToParamType;
import ietf.params.xml.ns.icalendar_2.DirParamType;
import ietf.params.xml.ns.icalendar_2.DurationParameterType;
import ietf.params.xml.ns.icalendar_2.EncodingParamType;
import ietf.params.xml.ns.icalendar_2.FbtypeParamType;
import ietf.params.xml.ns.icalendar_2.FmttypeParamType;
import ietf.params.xml.ns.icalendar_2.LanguageParamType;
import ietf.params.xml.ns.icalendar_2.MemberParamType;
import ietf.params.xml.ns.icalendar_2.PartstatParamType;
import ietf.params.xml.ns.icalendar_2.RangeParamType;
import ietf.params.xml.ns.icalendar_2.RelatedParamType;
import ietf.params.xml.ns.icalendar_2.ReltypeParamType;
import ietf.params.xml.ns.icalendar_2.RoleParamType;
import ietf.params.xml.ns.icalendar_2.RsvpParamType;
import ietf.params.xml.ns.icalendar_2.ScheduleAgentParamType;
import ietf.params.xml.ns.icalendar_2.ScheduleForceSendParamType;
import ietf.params.xml.ns.icalendar_2.ScheduleStatusParamType;
import ietf.params.xml.ns.icalendar_2.SentByParamType;
import ietf.params.xml.ns.icalendar_2.TextParameterType;
import ietf.params.xml.ns.icalendar_2.TzidParamType;
import ietf.params.xml.ns.icalendar_2.XBedeworkUidParamType;


/**
 * 
 *          Used to contain a new value.
 *       
 * 
 * <p>Java class for ParameterReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseParameter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterReferenceType", propOrder = {
    "baseParameter"
})
public class ParameterReferenceType {

    @XmlElementRef(name = "baseParameter", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected JAXBElement<? extends BaseParameterType> baseParameter;

    /**
     * Gets the value of the baseParameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LanguageParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TextParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoleParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RsvpParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CnParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FmttypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MemberParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SentByParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartstatParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelegatedFromParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleForceSendParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CutypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkUidParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EncodingParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelegatedToParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RelatedParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltrepParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzidParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleStatusParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReltypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FbtypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RangeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleAgentParamType }{@code >}
     *     
     */
    public JAXBElement<? extends BaseParameterType> getBaseParameter() {
        return baseParameter;
    }

    /**
     * Sets the value of the baseParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LanguageParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TextParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoleParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RsvpParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CnParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FmttypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MemberParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SentByParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartstatParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DurationParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelegatedFromParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleForceSendParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CutypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XBedeworkUidParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EncodingParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelegatedToParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RelatedParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltrepParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TzidParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleStatusParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReltypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FbtypeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RangeParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleAgentParamType }{@code >}
     *     
     */
    public void setBaseParameter(JAXBElement<? extends BaseParameterType> value) {
        this.baseParameter = ((JAXBElement<? extends BaseParameterType> ) value);
    }

}
