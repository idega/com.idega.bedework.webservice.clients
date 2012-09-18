
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A structure containing all the responses from a MultiOpType operation 
 *       
 * 
 * <p>Java class for ArrayOfResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}baseResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponses", propOrder = {
    "baseResponse"
})
public class ArrayOfResponses {

    @XmlElementRef(name = "baseResponse", namespace = "http://docs.oasis-open.org/ns/wscal/calws-soap", type = JAXBElement.class)
    protected List<JAXBElement<? extends BaseResponseType>> baseResponse;

    /**
     * Gets the value of the baseResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AddItemResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link FetchItemResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateItemResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link FreebusyReportResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteItemResponseType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseResponseType>> getBaseResponse() {
        if (baseResponse == null) {
            baseResponse = new ArrayList<JAXBElement<? extends BaseResponseType>>();
        }
        return this.baseResponse;
    }

}
