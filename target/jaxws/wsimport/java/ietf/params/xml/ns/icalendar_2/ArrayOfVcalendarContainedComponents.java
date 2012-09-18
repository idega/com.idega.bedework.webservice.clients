
package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVcalendarContainedComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVcalendarContainedComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vevent"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vtodo"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vjournal"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vfreebusy"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vtimezone"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vavailability"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}gluon"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}interval"/>
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
@XmlType(name = "ArrayOfVcalendarContainedComponents", propOrder = {
    "veventOrVtodoOrVjournal"
})
public class ArrayOfVcalendarContainedComponents {

    @XmlElements({
        @XmlElement(name = "vevent", type = VeventType.class),
        @XmlElement(name = "vfreebusy", type = VfreebusyType.class),
        @XmlElement(name = "vtimezone", type = VtimezoneType.class),
        @XmlElement(name = "vtodo", type = VtodoType.class),
        @XmlElement(name = "gluon", type = WsCalendarGluonType.class),
        @XmlElement(name = "vjournal", type = VjournalType.class),
        @XmlElement(name = "interval", type = WsCalendarIntervalType.class),
        @XmlElement(name = "vavailability", type = VavailabilityType.class)
    })
    protected List<BaseComponentType> veventOrVtodoOrVjournal;

    /**
     * Gets the value of the veventOrVtodoOrVjournal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the veventOrVtodoOrVjournal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVeventOrVtodoOrVjournal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VeventType }
     * {@link VfreebusyType }
     * {@link VtimezoneType }
     * {@link VtodoType }
     * {@link WsCalendarGluonType }
     * {@link VjournalType }
     * {@link WsCalendarIntervalType }
     * {@link VavailabilityType }
     * 
     * 
     */
    public List<BaseComponentType> getVeventOrVtodoOrVjournal() {
        if (veventOrVtodoOrVjournal == null) {
            veventOrVtodoOrVjournal = new ArrayList<BaseComponentType>();
        }
        return this.veventOrVtodoOrVjournal;
    }

}
