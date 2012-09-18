
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
 *         From RFC 5545 Section 3.6.3
 *        journalc   = "BEGIN" ":" "VJOURNAL" CRLF
 *                     jourprop
 *                     "END" ":" "VJOURNAL" CRLF
 * 
 *        jourprop   = *(
 *                   ;
 *                   ; The following are REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   dtstamp / uid /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   class / created / dtstart /
 *                   last-mod / organizer / recurid / seq /
 *                   status / summary / url /
 *                   ;
 *                   ; The following is OPTIONAL,
 *                   ; but SHOULD NOT occur more than once.
 *                   ;
 *                   rrule /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   attach / attendee / categories / comment /
 *                   contact / description / exdate / related / rdate /
 *                   rstatus / x-prop / iana-prop
 *                   ;
 *                   )
 *       
 * 
 * <p>Java class for ArrayOfJournalContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJournalContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstamp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uid"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}class"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}created"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}last-modified"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}organizer"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}recurrence-id"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}sequence"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}status"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}summary"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}url"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rrule"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}exrule"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attach"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attendee"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}categories"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}comment"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}contact"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}description"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}exdate"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rdate"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}related"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}request-status"/>
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
@XmlType(name = "ArrayOfJournalContainedProperties", propOrder = {
    "dtstampOrUidOrClazz"
})
public class ArrayOfJournalContainedProperties {

    @XmlElements({
        @XmlElement(name = "class", type = ClassPropType.class),
        @XmlElement(name = "summary", type = SummaryPropType.class),
        @XmlElement(name = "url", type = UrlPropType.class),
        @XmlElement(name = "attendee", type = AttendeePropType.class),
        @XmlElement(name = "description", type = DescriptionPropType.class),
        @XmlElement(name = "related", type = RelatedParamType.class),
        @XmlElement(name = "comment", type = CommentPropType.class),
        @XmlElement(name = "dtstart", type = DtstartPropType.class),
        @XmlElement(name = "sequence", type = SequencePropType.class),
        @XmlElement(name = "organizer", type = OrganizerPropType.class),
        @XmlElement(name = "uid", type = UidPropType.class),
        @XmlElement(name = "status", type = StatusPropType.class),
        @XmlElement(name = "last-modified", type = LastModifiedPropType.class),
        @XmlElement(name = "exdate", type = ExdatePropType.class),
        @XmlElement(name = "recurrence-id", type = RecurrenceIdPropType.class),
        @XmlElement(name = "attach", type = AttachPropType.class),
        @XmlElement(name = "exrule", type = ExrulePropType.class),
        @XmlElement(name = "request-status", type = RequestStatusPropType.class),
        @XmlElement(name = "contact", type = ContactPropType.class),
        @XmlElement(name = "dtstamp", type = DtstampPropType.class),
        @XmlElement(name = "rrule", type = RrulePropType.class),
        @XmlElement(name = "rdate", type = RdatePropType.class),
        @XmlElement(name = "categories", type = CategoriesPropType.class),
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
     * {@link ClassPropType }
     * {@link SummaryPropType }
     * {@link UrlPropType }
     * {@link AttendeePropType }
     * {@link DescriptionPropType }
     * {@link RelatedParamType }
     * {@link CommentPropType }
     * {@link DtstartPropType }
     * {@link SequencePropType }
     * {@link OrganizerPropType }
     * {@link UidPropType }
     * {@link StatusPropType }
     * {@link LastModifiedPropType }
     * {@link ExdatePropType }
     * {@link RecurrenceIdPropType }
     * {@link AttachPropType }
     * {@link ExrulePropType }
     * {@link RequestStatusPropType }
     * {@link ContactPropType }
     * {@link DtstampPropType }
     * {@link RrulePropType }
     * {@link RdatePropType }
     * {@link CategoriesPropType }
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
