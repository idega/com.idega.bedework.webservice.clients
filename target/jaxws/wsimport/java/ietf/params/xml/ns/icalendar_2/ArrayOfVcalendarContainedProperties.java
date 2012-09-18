
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
 *         From RFC 5545 Section 3.6
 *        icalbody   = calprops component
 * 
 *        calprops   = *(
 *                   ;
 *                   ; The following are REQUIRED,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   prodid / version /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; but MUST NOT occur more than once.
 *                   ;
 *                   calscale / method /
 *                   ;
 *                   ; The following are OPTIONAL,
 *                   ; and MAY occur more than once.
 *                   ;
 *                   x-prop / iana-prop
 *                   ;
 *                   )
 *       
 * 
 * <p>Java class for ArrayOfVcalendarContainedProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVcalendarContainedProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}prodid"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}version"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}calscale"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}method"/>
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
@XmlType(name = "ArrayOfVcalendarContainedProperties", propOrder = {
    "prodidOrVersionOrCalscale"
})
public class ArrayOfVcalendarContainedProperties {

    @XmlElements({
        @XmlElement(name = "version", type = VersionPropType.class),
        @XmlElement(name = "prodid", type = ProdidPropType.class),
        @XmlElement(name = "calscale", type = CalscalePropType.class),
        @XmlElement(name = "method", type = MethodPropType.class)
    })
    protected List<BasePropertyType> prodidOrVersionOrCalscale;

    /**
     * Gets the value of the prodidOrVersionOrCalscale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodidOrVersionOrCalscale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdidOrVersionOrCalscale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionPropType }
     * {@link ProdidPropType }
     * {@link CalscalePropType }
     * {@link MethodPropType }
     * 
     * 
     */
    public List<BasePropertyType> getProdidOrVersionOrCalscale() {
        if (prodidOrVersionOrCalscale == null) {
            prodidOrVersionOrCalscale = new ArrayList<BasePropertyType>();
        }
        return this.prodidOrVersionOrCalscale;
    }

}
