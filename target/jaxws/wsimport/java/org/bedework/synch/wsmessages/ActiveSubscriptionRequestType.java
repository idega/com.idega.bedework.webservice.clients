
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Messages involving active subscriptions. These need to provide 
 *            all the information for a given end of the subscription which would 
 *            usually be the end that made the subscription in the first place.
 *            
 *            It's up to the connector to determine if enough information has been
 *            supplied to allow the requests to proceed. 
 *       
 * 
 * <p>Java class for ActiveSubscriptionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveSubscriptionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bedework.org/synch/wsmessages}BaseSynchRequestType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="principalHref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscription-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="end" type="{http://www.bedework.org/synch/wsmessages}SynchEndType"/>
 *         &lt;element name="connectorInfo" type="{http://www.bedework.org/synch/wsmessages}ConnectorInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveSubscriptionRequestType", propOrder = {
    "token",
    "principalHref",
    "subscriptionId",
    "end",
    "connectorInfo"
})
@XmlSeeAlso({
    UnsubscribeRequestType.class,
    SubscriptionStatusRequestType.class
})
public class ActiveSubscriptionRequestType
    extends BaseSynchRequestType
{

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String principalHref;
    @XmlElement(name = "subscription-id", required = true)
    protected String subscriptionId;
    @XmlElement(required = true)
    protected SynchEndType end;
    @XmlElement(required = true)
    protected ConnectorInfoType connectorInfo;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

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
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link SynchEndType }
     *     
     */
    public SynchEndType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchEndType }
     *     
     */
    public void setEnd(SynchEndType value) {
        this.end = value;
    }

    /**
     * Gets the value of the connectorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectorInfoType }
     *     
     */
    public ConnectorInfoType getConnectorInfo() {
        return connectorInfo;
    }

    /**
     * Sets the value of the connectorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorInfoType }
     *     
     */
    public void setConnectorInfo(ConnectorInfoType value) {
        this.connectorInfo = value;
    }

}
