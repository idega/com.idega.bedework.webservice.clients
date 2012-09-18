
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.xri.xrd_1.XRDType;


/**
 * 
 *            Respond to the get-properties request
 *       
 * 
 * <p>Java class for GetPropertiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPropertiesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/xri/xrd-1.0}XRD"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPropertiesResponseType", propOrder = {
    "xrd"
})
public class GetPropertiesResponseType
    extends BaseResponseType
{

    @XmlElement(name = "XRD", namespace = "http://docs.oasis-open.org/ns/xri/xrd-1.0", required = true)
    protected XRDType xrd;

    /**
     * Gets the value of the xrd property.
     * 
     * @return
     *     possible object is
     *     {@link XRDType }
     *     
     */
    public XRDType getXRD() {
        return xrd;
    }

    /**
     * Sets the value of the xrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRDType }
     *     
     */
    public void setXRD(XRDType value) {
        this.xrd = value;
    }

}
