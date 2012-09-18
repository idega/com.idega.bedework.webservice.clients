
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
 *         From RFC 5545 Section 3.6.4
 *        freebusyc  = "BEGIN" ":" "VFREEBUSY" CRLF
 *                     fbprop
 *                     "END" ":" "VFREEBUSY" CRLF
 * 
 *        fbprop     = *(
 *                   ;
 *                   ; The following are REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   dtstamp / uid /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   contact / dtstart / dtend /
 *                   organizer / url /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   attendee / comment / freebusy / rstatus / x-prop /
 *                   iana-prop
 *                   ;
 *                   )
 *       
 * 
 * <p>Java class for ArrayOfFreebusyContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFreebusyContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstamp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uid"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}contact"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtend"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}organizer"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}url"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}attendee"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}comment"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}freebusy"/>
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
@XmlType(name = "ArrayOfFreebusyContainedProperties", propOrder = {
    "dtstampOrUidOrContact"
})
public class ArrayOfFreebusyContainedProperties {

    @XmlElements({
        @XmlElement(name = "dtend", type = DtendPropType.class),
        @XmlElement(name = "comment", type = CommentPropType.class),
        @XmlElement(name = "request-status", type = RequestStatusPropType.class),
        @XmlElement(name = "organizer", type = OrganizerPropType.class),
        @XmlElement(name = "dtstart", type = DtstartPropType.class),
        @XmlElement(name = "url", type = UrlPropType.class),
        @XmlElement(name = "attendee", type = AttendeePropType.class),
        @XmlElement(name = "uid", type = UidPropType.class),
        @XmlElement(name = "freebusy", type = FreebusyPropType.class),
        @XmlElement(name = "dtstamp", type = DtstampPropType.class),
        @XmlElement(name = "contact", type = ContactPropType.class)
    })
    protected List<BasePropertyType> dtstampOrUidOrContact;

    /**
     * Gets the value of the dtstampOrUidOrContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtstampOrUidOrContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtstampOrUidOrContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtendPropType }
     * {@link CommentPropType }
     * {@link RequestStatusPropType }
     * {@link OrganizerPropType }
     * {@link DtstartPropType }
     * {@link UrlPropType }
     * {@link AttendeePropType }
     * {@link UidPropType }
     * {@link FreebusyPropType }
     * {@link DtstampPropType }
     * {@link ContactPropType }
     * 
     * 
     */
    public List<BasePropertyType> getDtstampOrUidOrContact() {
        if (dtstampOrUidOrContact == null) {
            dtstampOrUidOrContact = new ArrayList<BasePropertyType>();
        }
        return this.dtstampOrUidOrContact;
    }

}
