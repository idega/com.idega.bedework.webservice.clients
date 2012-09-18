
package org.oasis_open.docs.ws_calendar.ns.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Base type for integer properties returned in GetPropertiesResponse. 
 *       
 * 
 * <p>Java class for IntegerPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegerPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}GetPropertiesBasePropertyType">
 *       &lt;sequence>
 *         &lt;element name="integer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerPropertyType", propOrder = {
    "integer"
})
@XmlSeeAlso({
    MaxInstancesType.class,
    MaxAttendeesPerInstanceType.class,
    MaxResourceSizeType.class
})
public class IntegerPropertyType
    extends GetPropertiesBasePropertyType
{

    @XmlElement(required = true)
    protected BigInteger integer;

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInteger(BigInteger value) {
        this.integer = value;
    }

}
