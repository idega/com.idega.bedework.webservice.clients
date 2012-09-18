
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Message from a service requesting new subscription
 *            calendar to 'remote'.
 *            token
 *                  Sent in initial startup request
 *            endAConnector
 *                  Set of properties for the A end
 *            endBConnector
 *                  Set of properties for the B end
 *            info
 *                  Set of properties for the entire subscription
 *       
 * 
 * <p>Java class for SubscribeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bedework.org/synch/wsmessages}BaseSynchRequestType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="principalHref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direction" type="{http://www.bedework.org/synch/wsmessages}SynchDirectionType"/>
 *         &lt;element name="master" type="{http://www.bedework.org/synch/wsmessages}SynchMasterType"/>
 *         &lt;element name="endAConnector" type="{http://www.bedework.org/synch/wsmessages}ConnectorInfoType"/>
 *         &lt;element name="endBConnector" type="{http://www.bedework.org/synch/wsmessages}ConnectorInfoType"/>
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
@XmlType(name = "SubscribeRequestType", propOrder = {
    "token",
    "principalHref",
    "direction",
    "master",
    "endAConnector",
    "endBConnector",
    "info"
})
public class SubscribeRequestType
    extends BaseSynchRequestType
{

    @XmlElement(required = true)
    protected String token;
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
    protected ArrayOfSynchProperties info;

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
