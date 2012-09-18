
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
 *         From RFC 5545 Section 3.6.5
 *        standardc  = "BEGIN" ":" "STANDARD" CRLF
 *                     tzprop
 *                     "END" ":" "STANDARD" CRLF
 * 
 *        daylightc  = "BEGIN" ":" "DAYLIGHT" CRLF
 *                     tzprop
 *                     "END" ":" "DAYLIGHT" CRLF
 * 
 *        tzprop     = *(
 *                     ;
 *                     ; The following are REQUIRED,
 *                     ; but MUST NOT occur more than once.
 *                     ;
 *                     dtstart / tzoffsetto / tzoffsetfrom /
 *                     ;
 *                     ; The following is OPTIONAL,
 *                     ; but SHOULD NOT occur more than once.
 *                     ;
 *                     rrule /
 *                     ;
 *                     ; The following are OPTIONAL,
 *                     ; and MAY occur more than once.
 *                     ;
 *                     comment / rdate / tzname / x-prop / iana-prop
 *                     ;
 *                     )
 *       
 * 
 * <p>Java class for ArrayOfStandardOrDaylightContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStandardOrDaylightContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}tzoffsetto"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}tzoffsetfrom"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rrule"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}comment"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}rdate"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}tzname"/>
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
@XmlType(name = "ArrayOfStandardOrDaylightContainedProperties", propOrder = {
    "dtstartOrTzoffsettoOrTzoffsetfrom"
})
public class ArrayOfStandardOrDaylightContainedProperties {

    @XmlElements({
        @XmlElement(name = "tzoffsetfrom", type = TzoffsetfromPropType.class),
        @XmlElement(name = "rdate", type = RdatePropType.class),
        @XmlElement(name = "rrule", type = RrulePropType.class),
        @XmlElement(name = "tzname", type = TznamePropType.class),
        @XmlElement(name = "comment", type = CommentPropType.class),
        @XmlElement(name = "tzoffsetto", type = TzoffsettoPropType.class),
        @XmlElement(name = "dtstart", type = DtstartPropType.class)
    })
    protected List<BasePropertyType> dtstartOrTzoffsettoOrTzoffsetfrom;

    /**
     * Gets the value of the dtstartOrTzoffsettoOrTzoffsetfrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtstartOrTzoffsettoOrTzoffsetfrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtstartOrTzoffsettoOrTzoffsetfrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TzoffsetfromPropType }
     * {@link RdatePropType }
     * {@link RrulePropType }
     * {@link TznamePropType }
     * {@link CommentPropType }
     * {@link TzoffsettoPropType }
     * {@link DtstartPropType }
     * 
     * 
     */
    public List<BasePropertyType> getDtstartOrTzoffsettoOrTzoffsetfrom() {
        if (dtstartOrTzoffsettoOrTzoffsetfrom == null) {
            dtstartOrTzoffsettoOrTzoffsetfrom = new ArrayList<BasePropertyType>();
        }
        return this.dtstartOrTzoffsettoOrTzoffsetfrom;
    }

}
