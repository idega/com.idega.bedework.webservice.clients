
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ws_calendar.ns.soap.BaseResponseType;


/**
 * 
 *            Response to message from service requesting information.
 *       
 * 
 * <p>Java class for GetInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="info" type="{http://www.bedework.org/synch/wsmessages}SynchInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInfoResponseType", propOrder = {
    "info"
})
public class GetInfoResponseType
    extends BaseResponseType
{

    @XmlElement(required = true)
    protected SynchInfoType info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link SynchInfoType }
     *     
     */
    public SynchInfoType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchInfoType }
     *     
     */
    public void setInfo(SynchInfoType value) {
        this.info = value;
    }

}
