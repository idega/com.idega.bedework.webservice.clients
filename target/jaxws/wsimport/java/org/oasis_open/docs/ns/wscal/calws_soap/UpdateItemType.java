
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Message to update a calendar item.
 *            
 *            The supplied etoken MUST match the etoken held by the service.
 *       
 * 
 * <p>Java class for UpdateItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="etoken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="select" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ComponentSelectionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateItemType", propOrder = {
    "etoken",
    "select"
})
public class UpdateItemType
    extends BaseRequestType
{

    @XmlElement(required = true)
    protected String etoken;
    @XmlElement(required = true)
    protected List<ComponentSelectionType> select;

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
     * Gets the value of the select property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the select property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentSelectionType }
     * 
     * 
     */
    public List<ComponentSelectionType> getSelect() {
        if (select == null) {
            select = new ArrayList<ComponentSelectionType>();
        }
        return this.select;
    }

}
