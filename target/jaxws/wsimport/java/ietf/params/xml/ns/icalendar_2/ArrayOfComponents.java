
package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComponents", propOrder = {
    "baseComponent"
})
public class ArrayOfComponents {

    @XmlElementRef(name = "baseComponent", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    protected List<JAXBElement<? extends BaseComponentType>> baseComponent;

    /**
     * Gets the value of the baseComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VtodoType }{@code >}
     * {@link JAXBElement }{@code <}{@link VtimezoneType }{@code >}
     * {@link JAXBElement }{@code <}{@link WsCalendarIntervalType }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailableType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link WsCalendarGluonType }{@code >}
     * {@link JAXBElement }{@code <}{@link VfreebusyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DaylightType }{@code >}
     * {@link JAXBElement }{@code <}{@link VjournalType }{@code >}
     * {@link JAXBElement }{@code <}{@link VeventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValarmType }{@code >}
     * {@link JAXBElement }{@code <}{@link VavailabilityType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseComponentType>> getBaseComponent() {
        if (baseComponent == null) {
            baseComponent = new ArrayList<JAXBElement<? extends BaseComponentType>>();
        }
        return this.baseComponent;
    }

}
