
package org.oasis_open.docs.ws_calendar.ns.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Type returned in GetPropertiesResponse when targeted at any resource
 *            to identify the CalWS features supported by the service. 
 *       
 * 
 * <p>Java class for SupportedFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedFeaturesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}GetPropertiesBasePropertyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}calendarAccessFeature"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedFeaturesType", propOrder = {
    "calendarAccessFeature"
})
public class SupportedFeaturesType
    extends GetPropertiesBasePropertyType
{

    protected List<CalendarAccessFeatureType> calendarAccessFeature;

    /**
     * Gets the value of the calendarAccessFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarAccessFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarAccessFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarAccessFeatureType }
     * 
     * 
     */
    public List<CalendarAccessFeatureType> getCalendarAccessFeature() {
        if (calendarAccessFeature == null) {
            calendarAccessFeature = new ArrayList<CalendarAccessFeatureType>();
        }
        return this.calendarAccessFeature;
    }

}
