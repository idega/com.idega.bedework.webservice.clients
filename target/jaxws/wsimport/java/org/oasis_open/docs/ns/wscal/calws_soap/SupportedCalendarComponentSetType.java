
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.BaseComponentType;


/**
 * 
 *            Type returned in an XRD object to define the allowable component types 
 *            within a collection or supported by the system.
 *       
 * 
 * <p>Java class for SupportedCalendarComponentSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedCalendarComponentSetType">
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
@XmlType(name = "SupportedCalendarComponentSetType", propOrder = {
    "baseComponent"
})
public class SupportedCalendarComponentSetType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected List<BaseComponentType> baseComponent;

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
     * {@link BaseComponentType }
     * 
     * 
     */
    public List<BaseComponentType> getBaseComponent() {
        if (baseComponent == null) {
            baseComponent = new ArrayList<BaseComponentType>();
        }
        return this.baseComponent;
    }

}
