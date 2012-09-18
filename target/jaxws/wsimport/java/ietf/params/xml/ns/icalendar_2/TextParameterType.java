
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BaseParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}text"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextParameterType", propOrder = {
    "text"
})
@XmlSeeAlso({
    RoleParamType.class,
    XBedeworkUidParamType.class,
    ScheduleAgentParamType.class,
    PartstatParamType.class,
    ReltypeParamType.class,
    LanguageParamType.class,
    FbtypeParamType.class,
    ScheduleForceSendParamType.class,
    EncodingParamType.class,
    TzidParamType.class,
    FmttypeParamType.class,
    RelatedParamType.class,
    CnParamType.class,
    ScheduleStatusParamType.class,
    CutypeParamType.class
})
public class TextParameterType
    extends BaseParameterType
{

    @XmlElement(required = true)
    protected String text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
