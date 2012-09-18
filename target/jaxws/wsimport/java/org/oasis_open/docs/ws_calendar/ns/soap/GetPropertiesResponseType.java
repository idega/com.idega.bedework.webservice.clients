
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
 *          Respond to the getProperties request. The response contains the href 
 *          of the targeted resource and a set of properties for that resource.
 *       
 * 
 * <p>Java class for GetPropertiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPropertiesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}childCollection"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}creationDateTime"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}displayName"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}lastModifiedDateTime"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}maxAttendeesPerInstance"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}maxDateTime"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}maxInstances"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}maxResourceSize"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}minDateTime"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}principalHome"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}resourceDescription"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}resourceOwner"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}resourceType"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}resourceTimezoneId"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}supportedCalendarComponentSet"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}supportedFeatures"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ws-calendar/ns/soap}timezoneServer"/>
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
@XmlType(name = "GetPropertiesResponseType", propOrder = {
    "href",
    "childCollectionOrCreationDateTimeOrDisplayName"
})
public class GetPropertiesResponseType
    extends BaseResponseType
{

    @XmlElement(required = true)
    protected String href;
    @XmlElements({
        @XmlElement(name = "creationDateTime", type = CreationDateTimeType.class),
        @XmlElement(name = "supportedFeatures", type = SupportedFeaturesType.class),
        @XmlElement(name = "resourceTimezoneId", type = ResourceTimezoneIdType.class),
        @XmlElement(name = "maxResourceSize", type = MaxResourceSizeType.class),
        @XmlElement(name = "lastModifiedDateTime", type = LastModifiedDateTimeType.class),
        @XmlElement(name = "principalHome", type = PrincipalHomeType.class),
        @XmlElement(name = "resourceOwner", type = ResourceOwnerType.class),
        @XmlElement(name = "childCollection", type = ChildCollectionType.class),
        @XmlElement(name = "maxAttendeesPerInstance", type = MaxAttendeesPerInstanceType.class),
        @XmlElement(name = "supportedCalendarComponentSet", type = SupportedCalendarComponentSetType.class),
        @XmlElement(name = "resourceType", type = ResourceTypeType.class),
        @XmlElement(name = "maxDateTime", type = MaxDateTimeType.class),
        @XmlElement(name = "displayName", type = DisplayNameType.class),
        @XmlElement(name = "minDateTime", type = MinDateTimeType.class),
        @XmlElement(name = "maxInstances", type = MaxInstancesType.class),
        @XmlElement(name = "timezoneServer", type = TimezoneServerType.class),
        @XmlElement(name = "resourceDescription", type = ResourceDescriptionType.class)
    })
    protected List<GetPropertiesBasePropertyType> childCollectionOrCreationDateTimeOrDisplayName;

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
     * Gets the value of the childCollectionOrCreationDateTimeOrDisplayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childCollectionOrCreationDateTimeOrDisplayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildCollectionOrCreationDateTimeOrDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationDateTimeType }
     * {@link SupportedFeaturesType }
     * {@link ResourceTimezoneIdType }
     * {@link MaxResourceSizeType }
     * {@link LastModifiedDateTimeType }
     * {@link PrincipalHomeType }
     * {@link ResourceOwnerType }
     * {@link ChildCollectionType }
     * {@link MaxAttendeesPerInstanceType }
     * {@link SupportedCalendarComponentSetType }
     * {@link ResourceTypeType }
     * {@link MaxDateTimeType }
     * {@link DisplayNameType }
     * {@link MinDateTimeType }
     * {@link MaxInstancesType }
     * {@link TimezoneServerType }
     * {@link ResourceDescriptionType }
     * 
     * 
     */
    public List<GetPropertiesBasePropertyType> getChildCollectionOrCreationDateTimeOrDisplayName() {
        if (childCollectionOrCreationDateTimeOrDisplayName == null) {
            childCollectionOrCreationDateTimeOrDisplayName = new ArrayList<GetPropertiesBasePropertyType>();
        }
        return this.childCollectionOrCreationDateTimeOrDisplayName;
    }

}
