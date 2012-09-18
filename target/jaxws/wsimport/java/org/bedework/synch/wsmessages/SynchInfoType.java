
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Used to provide information about the synch system. Allows the caller
 *            to list end-points and their characteristics.
 *       
 * 
 * <p>Java class for SynchInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectors" type="{http://www.bedework.org/synch/wsmessages}ArrayOfSynchConnectorInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchInfoType", propOrder = {
    "connectors"
})
public class SynchInfoType {

    @XmlElement(required = true)
    protected ArrayOfSynchConnectorInfo connectors;

    /**
     * Gets the value of the connectors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSynchConnectorInfo }
     *     
     */
    public ArrayOfSynchConnectorInfo getConnectors() {
        return connectors;
    }

    /**
     * Sets the value of the connectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSynchConnectorInfo }
     *     
     */
    public void setConnectors(ArrayOfSynchConnectorInfo value) {
        this.connectors = value;
    }

}
