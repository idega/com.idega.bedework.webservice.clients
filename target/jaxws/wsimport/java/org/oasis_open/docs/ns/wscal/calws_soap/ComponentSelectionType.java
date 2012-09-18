
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.BaseComponentType;


/**
 * 
 *          Used to contain a selection of a single component. There are no changes
 *          that can be applied directly to components. They are containers for 
 *          properties or other components.
 *       
 * 
 * <p>Java class for ComponentSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseComponent"/>
 *         &lt;element name="properties" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}PropertiesSelectionType" minOccurs="0"/>
 *         &lt;element name="components" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ComponentsSelectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentSelectionType", propOrder = {
    "baseComponent",
    "properties",
    "components"
})
public class ComponentSelectionType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected BaseComponentType baseComponent;
    protected PropertiesSelectionType properties;
    protected ComponentsSelectionType components;

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

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesSelectionType }
     *     
     */
    public PropertiesSelectionType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesSelectionType }
     *     
     */
    public void setProperties(PropertiesSelectionType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsSelectionType }
     *     
     */
    public ComponentsSelectionType getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsSelectionType }
     *     
     */
    public void setComponents(ComponentsSelectionType value) {
        this.components = value;
    }

}
