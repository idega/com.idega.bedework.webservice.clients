
package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         From RFC 5545 Section 3.6.2
 *        todoc      = "BEGIN" ":" "VTODO" CRLF
 *                     todoprop *alarmc
 *                     "END" ":" "VTODO" CRLF
 * 
 *        todoprop   = *(
 *                   ;
 *                   ; The following are REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   dtstamp / uid /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   class / completed / created / description /
 *                   dtstart / geo / last-mod / location / organizer /
 *                   percent / priority / recurid / seq / status /
 *                   summary / url /
 *                   ;
 *                   ; The following is OPTIONAL,
 *                   ; but SHOULD NOT occur more than once.
 *                   ;
 *                   rrule /
 *                   ;
 *                   ; Either 'due' or 'duration' MAY appear in
 *                   ; a 'todoprop', but 'due' and 'duration'
 *                   ; MUST NOT occur in the same 'todoprop'.
 *                   ; If 'duration' appear in a 'todoprop',
 *                   ; then 'dtstart' MUST also appear in
 *                   ; the same 'todoprop'.
 *                   ;
 *                   due / duration /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   attach / attendee / categories / comment / contact /
 *                   exdate / rstatus / related / resources /
 *                   rdate / x-prop / iana-prop
 *                   ;
 *                   )
 *       
 * 
 * <p>Java class for ArrayOfTodoContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTodoContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstamp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uid"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}class"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}completed"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}created"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}description"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}geo"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}last-modified"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}location"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}organizer"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}percent-complete"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}priority"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}recurrence-id"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}sequence"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}status"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}summary"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}url"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rrule"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}exrule"/>
 *           &lt;choice>
 *             &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}due"/>
 *             &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration"/>
 *           &lt;/choice>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attach"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attendee"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}categories"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}comment"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}contact"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}exdate"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}request-status"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}related"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}resources"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rdate"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTodoContainedProperties", propOrder = {
    "dtstampOrUidOrClazz"
})
public class ArrayOfTodoContainedProperties {

    @XmlElements({
        @XmlElement(name = "uid", type = UidPropType.class),
        @XmlElement(name = "completed", type = CompletedPropType.class),
        @XmlElement(name = "status", type = StatusPropType.class),
        @XmlElement(name = "request-status", type = RequestStatusPropType.class),
        @XmlElement(name = "percent-complete", type = PercentCompletePropType.class),
        @XmlElement(name = "contact", type = ContactPropType.class),
        @XmlElement(name = "comment", type = CommentPropType.class),
        @XmlElement(name = "dtstamp", type = DtstampPropType.class),
        @XmlElement(name = "resources", type = ResourcesPropType.class),
        @XmlElement(name = "due", type = DuePropType.class),
        @XmlElement(name = "location", type = LocationPropType.class),
        @XmlElement(name = "url", type = UrlPropType.class),
        @XmlElement(name = "description", type = DescriptionPropType.class),
        @XmlElement(name = "attendee", type = AttendeePropType.class),
        @XmlElement(name = "rdate", type = RdatePropType.class),
        @XmlElement(name = "dtstart", type = DtstartPropType.class),
        @XmlElement(name = "sequence", type = SequencePropType.class),
        @XmlElement(name = "priority", type = PriorityPropType.class),
        @XmlElement(name = "related", type = RelatedParamType.class),
        @XmlElement(name = "last-modified", type = LastModifiedPropType.class),
        @XmlElement(name = "duration", type = DurationPropType.class),
        @XmlElement(name = "summary", type = SummaryPropType.class),
        @XmlElement(name = "recurrence-id", type = RecurrenceIdPropType.class),
        @XmlElement(name = "class", type = ClassPropType.class),
        @XmlElement(name = "rrule", type = RrulePropType.class),
        @XmlElement(name = "attach", type = AttachPropType.class),
        @XmlElement(name = "categories", type = CategoriesPropType.class),
        @XmlElement(name = "exrule", type = ExrulePropType.class),
        @XmlElement(name = "organizer", type = OrganizerPropType.class),
        @XmlElement(name = "exdate", type = ExdatePropType.class),
        @XmlElement(name = "geo", type = GeoPropType.class),
        @XmlElement(name = "created", type = CreatedPropType.class)
    })
    protected List<Object> dtstampOrUidOrClazz;

    /**
     * Gets the value of the dtstampOrUidOrClazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtstampOrUidOrClazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtstampOrUidOrClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UidPropType }
     * {@link CompletedPropType }
     * {@link StatusPropType }
     * {@link RequestStatusPropType }
     * {@link PercentCompletePropType }
     * {@link ContactPropType }
     * {@link CommentPropType }
     * {@link DtstampPropType }
     * {@link ResourcesPropType }
     * {@link DuePropType }
     * {@link LocationPropType }
     * {@link UrlPropType }
     * {@link DescriptionPropType }
     * {@link AttendeePropType }
     * {@link RdatePropType }
     * {@link DtstartPropType }
     * {@link SequencePropType }
     * {@link PriorityPropType }
     * {@link RelatedParamType }
     * {@link LastModifiedPropType }
     * {@link DurationPropType }
     * {@link SummaryPropType }
     * {@link RecurrenceIdPropType }
     * {@link ClassPropType }
     * {@link RrulePropType }
     * {@link AttachPropType }
     * {@link CategoriesPropType }
     * {@link ExrulePropType }
     * {@link OrganizerPropType }
     * {@link ExdatePropType }
     * {@link GeoPropType }
     * {@link CreatedPropType }
     * 
     * 
     */
    public List<Object> getDtstampOrUidOrClazz() {
        if (dtstampOrUidOrClazz == null) {
            dtstampOrUidOrClazz = new ArrayList<Object>();
        }
        return this.dtstampOrUidOrClazz;
    }

}
