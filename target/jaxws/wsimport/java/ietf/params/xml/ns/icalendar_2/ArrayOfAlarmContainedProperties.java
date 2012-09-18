
package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         From RFC 5545 Section 3.6.6
 *        alarmc     = "BEGIN" ":" "VALARM" CRLF
 *                     (audioprop / dispprop / emailprop)
 *                     "END" ":" "VALARM" CRLF
 * 
 *        audioprop  = *(
 *                   ;
 *                   ; 'action' and 'trigger' are both REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   action / trigger /
 *                   ;
 *                   ; 'duration' and 'repeat' are both OPTIONAL,
 *                   ; and MUST NOT occur more than once each;
 *                   ; but if one occurs, so MUST the other.
 *                   ;
 *                   duration / repeat /
 *                   ;
 *                   ; The following is OPTIONAL,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   attach /
 *                   ;
 *                   ; The following is OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   x-prop / iana-prop
 *                   ;
 *                   )
 * 
 *        dispprop   = *(
 *                   ;
 *                   ; The following are REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   action / description / trigger /
 *                   ;
 *                   ; 'duration' and 'repeat' are both OPTIONAL,
 *                   ; and MUST NOT occur more than once each;
 *                   ; but if one occurs, so MUST the other.
 *                   ;
 *                   duration / repeat /
 *                   ;
 *                   ; The following is OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   x-prop / iana-prop
 *                   ;
 *                   )
 * 
 *        emailprop  = *(
 *                   ;
 *                   ; The following are all REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   action / description / trigger / summary /
 *                   ;
 *                   ; The following is REQUIRED,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   attendee /
 *                   ;
 *                   ; 'duration' and 'repeat' are both OPTIONAL,
 *                   ; and MUST NOT occur more than once each;
 *                   ; but if one occurs, so MUST the other.
 *                   ;
 *                   duration / repeat /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   attach / x-prop / iana-prop
 *                   ;
 *                   )
 *       
 * 
 * <p>Java class for ArrayOfAlarmContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAlarmContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}action"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}trigger"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}description" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}summary" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}repeat" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attendee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attach" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlarmContainedProperties", propOrder = {
    "action",
    "trigger",
    "description",
    "summary",
    "duration",
    "repeat",
    "attendee",
    "attach"
})
public class ArrayOfAlarmContainedProperties {

    @XmlElement(required = true)
    protected ActionPropType action;
    @XmlElement(required = true)
    protected TriggerPropType trigger;
    protected DescriptionPropType description;
    protected SummaryPropType summary;
    protected DurationPropType duration;
    protected RepeatPropType repeat;
    protected List<AttendeePropType> attendee;
    protected List<AttachPropType> attach;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionPropType }
     *     
     */
    public ActionPropType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionPropType }
     *     
     */
    public void setAction(ActionPropType value) {
        this.action = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerPropType }
     *     
     */
    public TriggerPropType getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerPropType }
     *     
     */
    public void setTrigger(TriggerPropType value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionPropType }
     *     
     */
    public DescriptionPropType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionPropType }
     *     
     */
    public void setDescription(DescriptionPropType value) {
        this.description = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryPropType }
     *     
     */
    public SummaryPropType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryPropType }
     *     
     */
    public void setSummary(SummaryPropType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDuration(DurationPropType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatPropType }
     *     
     */
    public RepeatPropType getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatPropType }
     *     
     */
    public void setRepeat(RepeatPropType value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the attendee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attendee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttendee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttendeePropType }
     * 
     * 
     */
    public List<AttendeePropType> getAttendee() {
        if (attendee == null) {
            attendee = new ArrayList<AttendeePropType>();
        }
        return this.attendee;
    }

    /**
     * Gets the value of the attach property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attach property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttach().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachPropType }
     * 
     * 
     */
    public List<AttachPropType> getAttach() {
        if (attach == null) {
            attach = new ArrayList<AttachPropType>();
        }
        return this.attach;
    }

}
