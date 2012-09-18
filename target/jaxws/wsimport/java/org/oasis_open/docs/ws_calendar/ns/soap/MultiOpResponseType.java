
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Response to a multi-op message. This is a sequence of responses to 
 *            each operation. The multi-op operation itself has a status which is 
 *            almost always success. Each embedded response needs to be examined to
 *            determine if it succeeded or failed.
 *       
 * 
 * <p>Java class for MultiOpResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiOpResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://docs.oasis-open.org/ws-calendar/ns/soap}ArrayOfResponses"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiOpResponseType", propOrder = {
    "responses"
})
public class MultiOpResponseType
    extends BaseResponseType
{

    @XmlElement(required = true)
    protected ArrayOfResponses responses;

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponses }
     *     
     */
    public ArrayOfResponses getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponses }
     *     
     */
    public void setResponses(ArrayOfResponses value) {
        this.responses = value;
    }

}
