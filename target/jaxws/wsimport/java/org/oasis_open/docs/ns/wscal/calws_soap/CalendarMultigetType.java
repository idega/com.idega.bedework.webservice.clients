
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Message to fetch multiple calendar entities.
 *       
 * 
 * <p>Java class for CalendarMultigetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarMultigetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}CalendarQueryOrMultigetBaseType">
 *       &lt;sequence>
 *         &lt;element name="hrefs" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ArrayOfHrefs"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarMultigetType", propOrder = {
    "hrefs"
})
public class CalendarMultigetType
    extends CalendarQueryOrMultigetBaseType
{

    @XmlElement(required = true)
    protected ArrayOfHrefs hrefs;

    /**
     * Gets the value of the hrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHrefs }
     *     
     */
    public ArrayOfHrefs getHrefs() {
        return hrefs;
    }

    /**
     * Sets the value of the hrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHrefs }
     *     
     */
    public void setHrefs(ArrayOfHrefs value) {
        this.hrefs = value;
    }

}
