
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The filter XML element specifies the search
 *         filter used to limit the calendar components returned by a
 *         calendaring REPORT request.
 *       
 * 
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}compFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "compFilter"
})
public class FilterType {

    @XmlElement(required = true)
    protected CompFilterType compFilter;

    /**
     * Gets the value of the compFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CompFilterType }
     *     
     */
    public CompFilterType getCompFilter() {
        return compFilter;
    }

    /**
     * Sets the value of the compFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompFilterType }
     *     
     */
    public void setCompFilter(CompFilterType value) {
        this.compFilter = value;
    }

}
