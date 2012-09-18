
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
 *            Type returned in GetPropertiesResponse to define the type of the
 *            targeted resource. 
 *       
 * 
 * <p>Java class for ResourceTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceTypeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}GetPropertiesBasePropertyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}calendarCollection"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}collection"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}inbox"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}outbox"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}xresource"/>
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
@XmlType(name = "ResourceTypeType", propOrder = {
    "calendarCollectionOrCollectionOrInbox"
})
public class ResourceTypeType
    extends GetPropertiesBasePropertyType
{

    @XmlElements({
        @XmlElement(name = "outbox", type = OutboxType.class),
        @XmlElement(name = "calendarCollection", type = CalendarCollectionType.class),
        @XmlElement(name = "collection", type = CollectionType.class),
        @XmlElement(name = "xresource", type = XresourceType.class),
        @XmlElement(name = "inbox", type = InboxType.class)
    })
    protected List<Object> calendarCollectionOrCollectionOrInbox;

    /**
     * Gets the value of the calendarCollectionOrCollectionOrInbox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarCollectionOrCollectionOrInbox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarCollectionOrCollectionOrInbox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutboxType }
     * {@link CalendarCollectionType }
     * {@link CollectionType }
     * {@link XresourceType }
     * {@link InboxType }
     * 
     * 
     */
    public List<Object> getCalendarCollectionOrCollectionOrInbox() {
        if (calendarCollectionOrCollectionOrInbox == null) {
            calendarCollectionOrCollectionOrInbox = new ArrayList<Object>();
        }
        return this.calendarCollectionOrCollectionOrInbox;
    }

}
