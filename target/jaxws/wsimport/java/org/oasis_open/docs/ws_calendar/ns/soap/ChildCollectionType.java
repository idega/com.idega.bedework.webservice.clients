
package org.oasis_open.docs.ws_calendar.ns.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Type returned in GetPropertiesResponse to provide references to child
 *            collections. 
 *       
 * 
 * <p>Java class for ChildCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}GetPropertiesBasePropertyType">
 *       &lt;sequence>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}calendarCollection"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}collection"/>
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
@XmlType(name = "ChildCollectionType", propOrder = {
    "href",
    "calendarCollectionOrCollection"
})
public class ChildCollectionType
    extends GetPropertiesBasePropertyType
{

    @XmlElement(required = true)
    protected String href;
    @XmlElements({
        @XmlElement(name = "collection", type = CollectionType.class),
        @XmlElement(name = "calendarCollection", type = CalendarCollectionType.class)
    })
    protected List<Object> calendarCollectionOrCollection;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the calendarCollectionOrCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarCollectionOrCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarCollectionOrCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionType }
     * {@link CalendarCollectionType }
     * 
     * 
     */
    public List<Object> getCalendarCollectionOrCollection() {
        if (calendarCollectionOrCollection == null) {
            calendarCollectionOrCollection = new ArrayList<Object>();
        }
        return this.calendarCollectionOrCollection;
    }

}
