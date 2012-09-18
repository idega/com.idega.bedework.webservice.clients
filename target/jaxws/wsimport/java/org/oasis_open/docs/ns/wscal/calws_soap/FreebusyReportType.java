
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Request a freebusy report on the targeted principal. This is a
 *            scheduling freebusy request which incorporates information such as 
 *            availability etc. As such the response may depend on information not
 *            visible to the caller.
 *       
 * 
 * <p>Java class for FreebusyReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreebusyReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="time-range" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}UTCTimeRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreebusyReportType", propOrder = {
    "timeRange"
})
public class FreebusyReportType
    extends BaseRequestType
{

    @XmlElement(name = "time-range")
    protected UTCTimeRangeType timeRange;

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link UTCTimeRangeType }
     *     
     */
    public UTCTimeRangeType getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTCTimeRangeType }
     *     
     */
    public void setTimeRange(UTCTimeRangeType value) {
        this.timeRange = value;
    }

}
