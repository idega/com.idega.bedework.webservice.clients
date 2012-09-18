
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type is the basis for all components and provides a base class for
 *         applications.
 *         
 *         Essentially it states that a component is a set of properties and components.
 *       
 * 
 * <p>Java class for BaseComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}properties" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}components" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseComponentType", propOrder = {
    "properties",
    "components"
})
@XmlSeeAlso({
    VeventType.class,
    AvailableType.class,
    VfreebusyType.class,
    VtodoType.class,
    WsCalendarIntervalType.class,
    ValarmType.class,
    WsCalendarGluonType.class,
    VavailabilityType.class,
    VjournalType.class,
    VtimezoneType.class,
    StandardType.class,
    VcalendarType.class,
    DaylightType.class
})
public abstract class BaseComponentType {

    protected ArrayOfProperties properties;
    protected ArrayOfComponents components;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProperties }
     *     
     */
    public ArrayOfProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProperties }
     *     
     */
    public void setProperties(ArrayOfProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComponents }
     *     
     */
    public ArrayOfComponents getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComponents }
     *     
     */
    public void setComponents(ArrayOfComponents value) {
        this.components = value;
    }

}
