
package org.oasis_open.docs.ws_calendar.ns.soap;

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
 *            The supplied changeToken MUST match the etoken held by the service.
 *       
 * 
 * <p>Java class for UpdateItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="changeToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="select" type="{http://docs.oasis-open.org/ws-calendar/ns/soap}ComponentSelectionType" maxOccurs="unbounded"/>
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
    "changeToken",
    "select"
})
public class UpdateItemType
    extends BaseRequestType
{

    @XmlElement(required = true)
    protected String changeToken;
    @XmlElement(required = true)
    protected List<ComponentSelectionType> select;

    /**
     * Gets the value of the changeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * Sets the value of the changeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeToken(String value) {
        this.changeToken = value;
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
