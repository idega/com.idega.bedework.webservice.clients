
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Used to provide information about a connector to systems. None of this
 *            is intended to be displayable. 
 *            
 *            name: should be unique and can be used to key into localizable information.
 *            manager: this is the special manager connector.
 *            readOnly: cannot update this end
 *            properties: those we need to present to the user
 *       
 * 
 * <p>Java class for SynchConnectorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchConnectorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="properties" type="{http://www.bedework.org/synch/wsmessages}ArrayOfSynchPropertyInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchConnectorInfoType", propOrder = {
    "name",
    "manager",
    "readOnly",
    "properties"
})
public class SynchConnectorInfoType {

    @XmlElement(required = true)
    protected String name;
    protected boolean manager;
    protected boolean readOnly;
    @XmlElement(required = true)
    protected ArrayOfSynchPropertyInfo properties;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     */
    public boolean isManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     */
    public void setManager(boolean value) {
        this.manager = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSynchPropertyInfo }
     *     
     */
    public ArrayOfSynchPropertyInfo getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSynchPropertyInfo }
     *     
     */
    public void setProperties(ArrayOfSynchPropertyInfo value) {
        this.properties = value;
    }

}
