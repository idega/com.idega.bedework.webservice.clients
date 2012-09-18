
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.BaseComponentType;


/**
 * 
 *          Used to contain a new value.
 *       
 * 
 * <p>Java class for ComponentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentReferenceType", propOrder = {
    "baseComponent"
})
public class ComponentReferenceType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected BaseComponentType baseComponent;

    /**
     * Gets the value of the baseComponent property.
     * 
     * @return
     *     possible object is
     *     {@link BaseComponentType }
     *     
     */
    public BaseComponentType getBaseComponent() {
        return baseComponent;
    }

    /**
     * Sets the value of the baseComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseComponentType }
     *     
     */
    public void setBaseComponent(BaseComponentType value) {
        this.baseComponent = value;
    }

}
