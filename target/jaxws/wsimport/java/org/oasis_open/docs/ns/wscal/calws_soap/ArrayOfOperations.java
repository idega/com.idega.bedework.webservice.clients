
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A structure containing all the operations allowed within a MultiOpType 
 *       
 * 
 * <p>Java class for ArrayOfOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}getProperties"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}freebusyReport"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}calendarQuery"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}calendarMultiget"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}addItem"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}fetchItem"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}deleteItem"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}updateItem"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOperations", propOrder = {
    "getPropertiesOrFreebusyReportOrCalendarQuery"
})
public class ArrayOfOperations {

    @XmlElements({
        @XmlElement(name = "addItem", type = AddItemType.class),
        @XmlElement(name = "calendarMultiget", type = CalendarMultigetType.class),
        @XmlElement(name = "deleteItem", type = DeleteItemType.class),
        @XmlElement(name = "calendarQuery", type = CalendarQueryType.class),
        @XmlElement(name = "getProperties", type = GetPropertiesType.class),
        @XmlElement(name = "freebusyReport", type = FreebusyReportType.class),
        @XmlElement(name = "updateItem", type = UpdateItemType.class),
        @XmlElement(name = "fetchItem", type = FetchItemType.class)
    })
    protected List<BaseRequestType> getPropertiesOrFreebusyReportOrCalendarQuery;

    /**
     * Gets the value of the getPropertiesOrFreebusyReportOrCalendarQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getPropertiesOrFreebusyReportOrCalendarQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetPropertiesOrFreebusyReportOrCalendarQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddItemType }
     * {@link CalendarMultigetType }
     * {@link DeleteItemType }
     * {@link CalendarQueryType }
     * {@link GetPropertiesType }
     * {@link FreebusyReportType }
     * {@link UpdateItemType }
     * {@link FetchItemType }
     * 
     * 
     */
    public List<BaseRequestType> getGetPropertiesOrFreebusyReportOrCalendarQuery() {
        if (getPropertiesOrFreebusyReportOrCalendarQuery == null) {
            getPropertiesOrFreebusyReportOrCalendarQuery = new ArrayList<BaseRequestType>();
        }
        return this.getPropertiesOrFreebusyReportOrCalendarQuery;
    }

}
