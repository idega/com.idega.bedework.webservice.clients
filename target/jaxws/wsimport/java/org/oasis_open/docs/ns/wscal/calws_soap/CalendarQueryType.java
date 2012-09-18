
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Message to query a calendar.
 *       
 * 
 * <p>Java class for CalendarQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}CalendarQueryOrMultigetBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}depth"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}filter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarQueryType", propOrder = {
    "depth",
    "filter"
})
public class CalendarQueryType
    extends CalendarQueryOrMultigetBaseType
{

    @XmlElement(required = true)
    protected String depth;
    @XmlElement(required = true)
    protected FilterType filter;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilter(FilterType value) {
        this.filter = value;
    }

}
