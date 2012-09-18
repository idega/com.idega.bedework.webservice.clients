
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
 *         From RFC 5545 Section 3.6.1
 *        eventc     = "BEGIN" ":" "VEVENT" CRLF
 *                     eventprop *alarmc
 *                     "END" ":" "VEVENT" CRLF
 * 
 *        eventprop  = *(
 *                   ;
 *                   ; The following are REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   dtstamp / uid /
 *                   ;
 *                   ; The following is REQUIRED if the component
 *                   ; appears in an iCalendar object that doesn't
 *                   ; specify the "METHOD" property; otherwise, it
 *                   ; is OPTIONAL; in any case, it MUST NOT occur
 *                   ; more than once.
 *                   ;
 *                   dtstart /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   class / created / description / geo /
 *                   last-mod / location / organizer / priority /
 *                   seq / status / summary / transp /
 *                   url / recurid /
 *                   ;
 *                   ; The following is OPTIONAL,
 *                   ; but SHOULD NOT occur more than once.
 *                   ;
 *                   rrule /
 *                   ;
 *                   ; Either 'dtend' or 'duration' MAY appear in
 *                   ; a 'eventprop', but 'dtend' and 'duration'
 *                   ; MUST NOT occur in the same 'eventprop'.
 *                   ;
 *                   dtend / duration /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   attach / attendee / categories / comment /
 *                   contact / exdate / rstatus / related /
 *                   resources / rdate / x-prop / iana-prop
 *                   ;
 *                   )
 *       
 * 
 * <p>Java class for ArrayOfEventContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstamp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uid"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}class"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}created"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}description"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}geo"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}last-modified"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}location"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}organizer"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}priority"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}recurrence-id"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}sequence"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}status"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}summary"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}transp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}url"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rrule"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}exrule"/>
 *           &lt;choice>
 *             &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtend"/>
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
@XmlType(name = "ArrayOfEventContainedProperties", propOrder = {
    "dtstampOrUidOrDtstart"
})
public class ArrayOfEventContainedProperties {

    @XmlElements({
        @XmlElement(name = "dtend", type = DtendPropType.class),
        @XmlElement(name = "comment", type = CommentPropType.class),
        @XmlElement(name = "contact", type = ContactPropType.class),
        @XmlElement(name = "priority", type = PriorityPropType.class),
        @XmlElement(name = "description", type = DescriptionPropType.class),
        @XmlElement(name = "organizer", type = OrganizerPropType.class),
        @XmlElement(name = "exrule", type = ExrulePropType.class),
        @XmlElement(name = "duration", type = DurationPropType.class),
        @XmlElement(name = "dtstart", type = DtstartPropType.class),
        @XmlElement(name = "summary", type = SummaryPropType.class),
        @XmlElement(name = "attach", type = AttachPropType.class),
        @XmlElement(name = "class", type = ClassPropType.class),
        @XmlElement(name = "attendee", type = AttendeePropType.class),
        @XmlElement(name = "request-status", type = RequestStatusPropType.class),
        @XmlElement(name = "rdate", type = RdatePropType.class),
        @XmlElement(name = "exdate", type = ExdatePropType.class),
        @XmlElement(name = "created", type = CreatedPropType.class),
        @XmlElement(name = "related", type = RelatedParamType.class),
        @XmlElement(name = "rrule", type = RrulePropType.class),
        @XmlElement(name = "location", type = LocationPropType.class),
        @XmlElement(name = "status", type = StatusPropType.class),
        @XmlElement(name = "url", type = UrlPropType.class),
        @XmlElement(name = "geo", type = GeoPropType.class),
        @XmlElement(name = "transp", type = TranspPropType.class),
        @XmlElement(name = "last-modified", type = LastModifiedPropType.class),
        @XmlElement(name = "resources", type = ResourcesPropType.class),
        @XmlElement(name = "dtstamp", type = DtstampPropType.class),
        @XmlElement(name = "categories", type = CategoriesPropType.class),
        @XmlElement(name = "recurrence-id", type = RecurrenceIdPropType.class),
        @XmlElement(name = "sequence", type = SequencePropType.class),
        @XmlElement(name = "uid", type = UidPropType.class)
    })
    protected List<Object> dtstampOrUidOrDtstart;

    /**
     * Gets the value of the dtstampOrUidOrDtstart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtstampOrUidOrDtstart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtstampOrUidOrDtstart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtendPropType }
     * {@link CommentPropType }
     * {@link ContactPropType }
     * {@link PriorityPropType }
     * {@link DescriptionPropType }
     * {@link OrganizerPropType }
     * {@link ExrulePropType }
     * {@link DurationPropType }
     * {@link DtstartPropType }
     * {@link SummaryPropType }
     * {@link AttachPropType }
     * {@link ClassPropType }
     * {@link AttendeePropType }
     * {@link RequestStatusPropType }
     * {@link RdatePropType }
     * {@link ExdatePropType }
     * {@link CreatedPropType }
     * {@link RelatedParamType }
     * {@link RrulePropType }
     * {@link LocationPropType }
     * {@link StatusPropType }
     * {@link UrlPropType }
     * {@link GeoPropType }
     * {@link TranspPropType }
     * {@link LastModifiedPropType }
     * {@link ResourcesPropType }
     * {@link DtstampPropType }
     * {@link CategoriesPropType }
     * {@link RecurrenceIdPropType }
     * {@link SequencePropType }
     * {@link UidPropType }
     * 
     * 
     */
    public List<Object> getDtstampOrUidOrDtstart() {
        if (dtstampOrUidOrDtstart == null) {
            dtstampOrUidOrDtstart = new ArrayList<Object>();
        }
        return this.dtstampOrUidOrDtstart;
    }

}
