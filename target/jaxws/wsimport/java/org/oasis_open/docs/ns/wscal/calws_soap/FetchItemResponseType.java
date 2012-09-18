
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.IcalendarType;


/**
 * 
 *            Response to message to fetch an item.
 *       
 * 
 * <p>Java class for FetchItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FetchItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="etoken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}icalendar" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchItemResponseType", propOrder = {
    "etoken",
    "href",
    "icalendar"
})
public class FetchItemResponseType
    extends BaseResponseType
{

    protected String etoken;
    @XmlElement(required = true)
    protected String href;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected IcalendarType icalendar;

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
     * Gets the value of the icalendar property.
     * 
     * @return
     *     possible object is
     *     {@link IcalendarType }
     *     
     */
    public IcalendarType getIcalendar() {
        return icalendar;
    }

    /**
     * Sets the value of the icalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcalendarType }
     *     
     */
    public void setIcalendar(IcalendarType value) {
        this.icalendar = value;
    }

}
