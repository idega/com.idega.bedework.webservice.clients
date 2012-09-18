
package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * types the content of the xCal attach element
 * 
 * <p>Java class for WsCalendarAttachType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsCalendarAttachType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}artifact"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}artifactBase"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uri"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}text"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsCalendarAttachType", propOrder = {
    "artifactOrArtifactBaseOrUri"
})
public class WsCalendarAttachType
    extends BasePropertyType
{

    @XmlElementRefs({
        @XmlElementRef(name = "text", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class),
        @XmlElementRef(name = "artifact", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class),
        @XmlElementRef(name = "artifactBase", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class),
        @XmlElementRef(name = "uri", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> artifactOrArtifactBaseOrUri;

    /**
     * Gets the value of the artifactOrArtifactBaseOrUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifactOrArtifactBaseOrUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifactOrArtifactBaseOrUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ArtifactBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ArtifactType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getArtifactOrArtifactBaseOrUri() {
        if (artifactOrArtifactBaseOrUri == null) {
            artifactOrArtifactBaseOrUri = new ArrayList<JAXBElement<?>>();
        }
        return this.artifactOrArtifactBaseOrUri;
    }

}
