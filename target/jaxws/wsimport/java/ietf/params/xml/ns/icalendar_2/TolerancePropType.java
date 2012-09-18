
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TolerancePropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TolerancePropType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;sequence>
 *         &lt;element name="tolerate" type="{urn:ietf:params:xml:ns:icalendar-2.0}ToleranceValueType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TolerancePropType", propOrder = {
    "tolerate"
})
public class TolerancePropType
    extends BasePropertyType
{

    @XmlElement(required = true)
    protected ToleranceValueType tolerate;

    /**
     * Gets the value of the tolerate property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceValueType }
     *     
     */
    public ToleranceValueType getTolerate() {
        return tolerate;
    }

    /**
     * Sets the value of the tolerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceValueType }
     *     
     */
    public void setTolerate(ToleranceValueType value) {
        this.tolerate = value;
    }

}
