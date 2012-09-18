
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            The name of the connector and properties required to make a connection
 *       
 * 
 * <p>Java class for ConnectorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="properties" type="{http://www.bedework.org/synch/wsmessages}ArrayOfSynchProperties"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorInfoType", propOrder = {
    "connectorId",
    "properties"
})
public class ConnectorInfoType {

    @XmlElement(required = true)
    protected String connectorId;
    @XmlElement(required = true)
    protected ArrayOfSynchProperties properties;

    /**
     * Gets the value of the connectorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorId() {
        return connectorId;
    }

    /**
     * Sets the value of the connectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorId(String value) {
        this.connectorId = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSynchProperties }
     *     
     */
    public ArrayOfSynchProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSynchProperties }
     *     
     */
    public void setProperties(ArrayOfSynchProperties value) {
        this.properties = value;
    }

}
