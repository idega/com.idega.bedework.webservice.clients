
package org.bedework.synch.wsmessages;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ws_calendar.ns.soap.BaseResponseType;


/**
 * 
 *            Response to message requesting unsubscription.
 *       
 * 
 * <p>Java class for SubscriptionStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="principalHref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direction" type="{http://www.bedework.org/synch/wsmessages}SynchDirectionType"/>
 *         &lt;element name="master" type="{http://www.bedework.org/synch/wsmessages}SynchMasterType"/>
 *         &lt;element name="endAConnector" type="{http://www.bedework.org/synch/wsmessages}ConnectorInfoType"/>
 *         &lt;element name="endBConnector" type="{http://www.bedework.org/synch/wsmessages}ConnectorInfoType"/>
 *         &lt;element name="lastRefresh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCt" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="missingTarget" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="info" type="{http://www.bedework.org/synch/wsmessages}ArrayOfSynchProperties"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionStatusResponseType", propOrder = {
    "subscriptionId",
    "principalHref",
    "direction",
    "master",
    "endAConnector",
    "endBConnector",
    "lastRefresh",
    "errorCt",
    "missingTarget",
    "info"
})
public class SubscriptionStatusResponseType
    extends BaseResponseType
{

    @XmlElement(required = true)
    protected String subscriptionId;
    @XmlElement(required = true)
    protected String principalHref;
    @XmlElement(required = true)
    protected SynchDirectionType direction;
    @XmlElement(required = true)
    protected SynchMasterType master;
    @XmlElement(required = true)
    protected ConnectorInfoType endAConnector;
    @XmlElement(required = true)
    protected ConnectorInfoType endBConnector;
    @XmlElement(required = true)
    protected String lastRefresh;
    @XmlElement(required = true)
    protected BigInteger errorCt;
    protected boolean missingTarget;
    @XmlElement(required = true)
    protected ArrayOfSynchProperties info;

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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link SynchDirectionType }
     *     
     */
    public SynchDirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchDirectionType }
     *     
     */
    public void setDirection(SynchDirectionType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link SynchMasterType }
     *     
     */
    public SynchMasterType getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchMasterType }
     *     
     */
    public void setMaster(SynchMasterType value) {
        this.master = value;
    }

    /**
     * Gets the value of the endAConnector property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectorInfoType }
     *     
     */
    public ConnectorInfoType getEndAConnector() {
        return endAConnector;
    }

    /**
     * Sets the value of the endAConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorInfoType }
     *     
     */
    public void setEndAConnector(ConnectorInfoType value) {
        this.endAConnector = value;
    }

    /**
     * Gets the value of the endBConnector property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectorInfoType }
     *     
     */
    public ConnectorInfoType getEndBConnector() {
        return endBConnector;
    }

    /**
     * Sets the value of the endBConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorInfoType }
     *     
     */
    public void setEndBConnector(ConnectorInfoType value) {
        this.endBConnector = value;
    }

    /**
     * Gets the value of the lastRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRefresh() {
        return lastRefresh;
    }

    /**
     * Sets the value of the lastRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRefresh(String value) {
        this.lastRefresh = value;
    }

    /**
     * Gets the value of the errorCt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrorCt() {
        return errorCt;
    }

    /**
     * Sets the value of the errorCt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrorCt(BigInteger value) {
        this.errorCt = value;
    }

    /**
     * Gets the value of the missingTarget property.
     * 
     */
    public boolean isMissingTarget() {
        return missingTarget;
    }

    /**
     * Sets the value of the missingTarget property.
     * 
     */
    public void setMissingTarget(boolean value) {
        this.missingTarget = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSynchProperties }
     *     
     */
    public ArrayOfSynchProperties getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSynchProperties }
     *     
     */
    public void setInfo(ArrayOfSynchProperties value) {
        this.info = value;
    }

}
