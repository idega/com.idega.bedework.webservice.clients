
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Base type for string properties returned in GetPropertiesResponse. 
 *       
 * 
 * <p>Java class for StringPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}GetPropertiesBasePropertyType">
 *       &lt;sequence>
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringPropertyType", propOrder = {
    "string"
})
@XmlSeeAlso({
    ResourceTimezoneIdType.class,
    ResourceOwnerType.class,
    XresourceType.class,
    TimezoneServerType.class,
    PrincipalHomeType.class,
    DisplayNameType.class,
    ResourceDescriptionType.class
})
public class StringPropertyType
    extends GetPropertiesBasePropertyType
{

    @XmlElement(required = true)
    protected String string;

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

}
