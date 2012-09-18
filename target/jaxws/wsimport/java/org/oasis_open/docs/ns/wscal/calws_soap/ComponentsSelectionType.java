
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Used to contain updates to components. These updates are:
 *          
 *          zero or more of selections of sub-components to update
 *          zero or more additions or removals of components 
 *          
 *          Removals MUST be processed ahead of additions.
 *       
 * 
 * <p>Java class for ComponentsSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentsSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="component" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ComponentSelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remove" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ComponentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="add" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ComponentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentsSelectionType", propOrder = {
    "component",
    "remove",
    "add"
})
public class ComponentsSelectionType {

    protected List<ComponentSelectionType> component;
    protected List<ComponentReferenceType> remove;
    protected List<ComponentReferenceType> add;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentSelectionType }
     * 
     * 
     */
    public List<ComponentSelectionType> getComponent() {
        if (component == null) {
            component = new ArrayList<ComponentSelectionType>();
        }
        return this.component;
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
     * {@link ComponentReferenceType }
     * 
     * 
     */
    public List<ComponentReferenceType> getRemove() {
        if (remove == null) {
            remove = new ArrayList<ComponentReferenceType>();
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
     * {@link ComponentReferenceType }
     * 
     * 
     */
    public List<ComponentReferenceType> getAdd() {
        if (add == null) {
            add = new ArrayList<ComponentReferenceType>();
        }
        return this.add;
    }

}
