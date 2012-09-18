
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BaseParameterType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{urn:ietf:params:xml:ns:icalendar-2.0}RangeValueType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeParamType", propOrder = {
    "text"
})
public class RangeParamType
    extends BaseParameterType
{

    @XmlElement(required = true)
    protected RangeValueType text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link RangeValueType }
     *     
     */
    public RangeValueType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeValueType }
     *     
     */
    public void setText(RangeValueType value) {
        this.text = value;
    }

}