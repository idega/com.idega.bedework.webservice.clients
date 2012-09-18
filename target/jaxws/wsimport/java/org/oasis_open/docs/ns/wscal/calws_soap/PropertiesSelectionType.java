
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Used to contain updates to properties. These updates are either a 
 *          selection of a property to apply a change and/or to update the 
 *          parameters or addition or removal of properties.
 *          
 *          Removals MUST be processed ahead of additions.
 *       
 * 
 * <p>Java class for PropertiesSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertiesSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}PropertySelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remove" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}PropertyReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="add" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}PropertyReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesSelectionType", propOrder = {
    "property",
    "remove",
    "add"
})
public class PropertiesSelectionType {

    protected List<PropertySelectionType> property;
    protected List<PropertyReferenceType> remove;
    protected List<PropertyReferenceType> add;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertySelectionType }
     * 
     * 
     */
    public List<PropertySelectionType> getProperty() {
        if (property == null) {
            property = new ArrayList<PropertySelectionType>();
        }
        return this.property;
    }

    /**
     * Gets the value of the remove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyReferenceType }
     * 
     * 
     */
    public List<PropertyReferenceType> getRemove() {
        if (remove == null) {
            remove = new ArrayList<PropertyReferenceType>();
        }
        return this.remove;
    }

    /**
     * Gets the value of the add property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the add property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyReferenceType }
     * 
     * 
     */
    public List<PropertyReferenceType> getAdd() {
        if (add == null) {
            add = new ArrayList<PropertyReferenceType>();
        }
        return this.add;
    }

}
