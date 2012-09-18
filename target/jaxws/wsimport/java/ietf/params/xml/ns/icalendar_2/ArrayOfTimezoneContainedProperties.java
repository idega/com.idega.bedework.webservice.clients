
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
 *        timezonec  = "BEGIN" ":" "VTIMEZONE" CRLF
 *                     *(
 *                     ;
 *                     ; 'tzid' is REQUIRED, but MUST NOT occur more
 *                     ; than once.
 *                     ;
 *                     tzid /
 *                     ;
 *                     ; 'last-mod' and 'tzurl' are OPTIONAL,
 *                     ; but MUST NOT occur more than once.
 *                     ;
 *                     last-mod / tzurl /
 *                     ;
 *                     ; One of 'standardc' or 'daylightc' MUST occur
 *                     ; and each MAY occur more than once.
 *                     ;
 *                     standardc / daylightc /
 *                     ;
 *                     ; The following are OPTIONAL,
 *                     ; and MAY occur more than once.
 *                     ;
 *                     x-prop / iana-prop
 *                     ;
 *                     )
 *                     "END" ":" "VTIMEZONE" CRLF
 *       
 * 
 * <p>Java class for ArrayOfTimezoneContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimezoneContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="tzid" type="{urn:ietf:params:xml:ns:icalendar-2.0}TextPropertyType"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}last-modified"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}url"/>
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
@XmlType(name = "ArrayOfTimezoneContainedProperties", propOrder = {
    "tzidOrLastModifiedOrUrl"
})
public class ArrayOfTimezoneContainedProperties {

    @XmlElements({
        @XmlElement(name = "url", type = UrlPropType.class),
        @XmlElement(name = "last-modified", type = LastModifiedPropType.class),
        @XmlElement(name = "tzid", type = TextPropertyType.class)
    })
    protected List<BasePropertyType> tzidOrLastModifiedOrUrl;

    /**
     * Gets the value of the tzidOrLastModifiedOrUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tzidOrLastModifiedOrUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTzidOrLastModifiedOrUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlPropType }
     * {@link LastModifiedPropType }
     * {@link TextPropertyType }
     * 
     * 
     */
    public List<BasePropertyType> getTzidOrLastModifiedOrUrl() {
        if (tzidOrLastModifiedOrUrl == null) {
            tzidOrLastModifiedOrUrl = new ArrayList<BasePropertyType>();
        }
        return this.tzidOrLastModifiedOrUrl;
    }

}
