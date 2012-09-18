
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Contains prop elements with the same status
 *       
 * 
 * <p>Java class for PropstatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropstatType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="prop" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}MultistatusPropElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropstatType", propOrder = {
    "prop"
})
public class PropstatType
    extends BaseResponseType
{

    protected List<MultistatusPropElementType> prop;

    /**
     * Gets the value of the prop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultistatusPropElementType }
     * 
     * 
     */
    public List<MultistatusPropElementType> getProp() {
        if (prop == null) {
            prop = new ArrayList<MultistatusPropElementType>();
        }
        return this.prop;
    }

}
