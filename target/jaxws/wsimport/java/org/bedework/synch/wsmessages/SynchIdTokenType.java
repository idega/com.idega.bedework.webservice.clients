
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Id and token for a synch operation.
 *       
 * 
 * <p>Java class for SynchIdTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchIdTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalHref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscribeUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synchToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchIdTokenType", propOrder = {
    "principalHref",
    "subscribeUrl",
    "synchToken"
})
public class SynchIdTokenType {

    @XmlElement(required = true)
    protected String principalHref;
    @XmlElement(required = true)
    protected String subscribeUrl;
    @XmlElement(required = true)
    protected String synchToken;

    /**
     * Gets the value of the principalHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalHref() {
        return principalHref;
    }

    /**
     * Sets the value of the principalHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalHref(String value) {
        this.principalHref = value;
    }

    /**
     * Gets the value of the subscribeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeUrl() {
        return subscribeUrl;
    }

    /**
     * Sets the value of the subscribeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeUrl(String value) {
        this.subscribeUrl = value;
    }

    /**
     * Gets the value of the synchToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchToken() {
        return synchToken;
    }

    /**
     * Sets the value of the synchToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchToken(String value) {
        this.synchToken = value;
    }

}
