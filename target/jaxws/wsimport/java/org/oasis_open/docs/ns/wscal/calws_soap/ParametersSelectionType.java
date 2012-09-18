
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Used to contain updates to parameters. These updates are either a 
 *          selection of a parameter to apply a change or addition or removal of
 *          parameters.
 *          
 *          Removals MUST be processed ahead of additions.
 *       
 * 
 * <p>Java class for ParametersSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametersSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ParameterSelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remove" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ParameterReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="add" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ParameterReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametersSelectionType", propOrder = {
    "parameter",
    "remove",
    "add"
})
public class ParametersSelectionType {

    protected List<ParameterSelectionType> parameter;
    protected List<ParameterReferenceType> remove;
    protected List<ParameterReferenceType> add;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterSelectionType }
     * 
     * 
     */
    public List<ParameterSelectionType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterSelectionType>();
        }
        return this.parameter;
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
     * {@link ParameterReferenceType }
     * 
     * 
     */
    public List<ParameterReferenceType> getRemove() {
        if (remove == null) {
            remove = new ArrayList<ParameterReferenceType>();
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
     * {@link ParameterReferenceType }
     * 
     * 
     */
    public List<ParameterReferenceType> getAdd() {
        if (add == null) {
            add = new ArrayList<ParameterReferenceType>();
        }
        return this.add;
    }

}
