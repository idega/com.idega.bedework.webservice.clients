
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Message from service indicating an error.
 *       
 * 
 * <p>Java class for ErrorResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}error"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponseType", propOrder = {
    "error",
    "description"
})
public class ErrorResponseType {

    @XmlElementRef(name = "error", namespace = "http://docs.oasis-open.org/ns/wscal/calws-soap", type = JAXBElement.class)
    protected JAXBElement<? extends ErrorCodeType> error;
    protected String description;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UidConflictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InvalidFilterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     
     */
    public JAXBElement<? extends ErrorCodeType> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UidConflictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InvalidFilterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorCodeType }{@code >}
     *     
     */
    public void setError(JAXBElement<? extends ErrorCodeType> value) {
        this.error = ((JAXBElement<? extends ErrorCodeType> ) value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
