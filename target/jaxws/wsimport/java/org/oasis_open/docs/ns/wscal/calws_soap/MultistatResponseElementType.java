
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            One part of a Multistatus
 *       
 * 
 * <p>Java class for MultistatResponseElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultistatResponseElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etoken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}propstat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultistatResponseElementType", propOrder = {
    "href",
    "etoken",
    "propstat"
})
public class MultistatResponseElementType {

    @XmlElement(required = true)
    protected String href;
    @XmlElement(required = true)
    protected String etoken;
    protected List<PropstatType> propstat;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

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

    /**
     * Gets the value of the propstat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propstat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropstat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropstatType }
     * 
     * 
     */
    public List<PropstatType> getPropstat() {
        if (propstat == null) {
            propstat = new ArrayList<PropstatType>();
        }
        return this.propstat;
    }

}
