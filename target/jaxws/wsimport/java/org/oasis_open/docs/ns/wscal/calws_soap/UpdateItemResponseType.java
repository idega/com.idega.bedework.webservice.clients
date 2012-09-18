
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Response to message to update an item.
 *            
 *            The server will return an etoken value which should replace the
 *            value currently held by the client. 
 *       
 * 
 * <p>Java class for UpdateItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="etoken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateItemResponseType", propOrder = {
    "etoken"
})
public class UpdateItemResponseType
    extends BaseResponseType
{

    @XmlElement(required = true)
    protected String etoken;

    /**
     * Gets the value of the etoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtoken() {
        return etoken;
    }

    /**
     * Sets the value of the etoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtoken(String value) {
        this.etoken = value;
    }

}
