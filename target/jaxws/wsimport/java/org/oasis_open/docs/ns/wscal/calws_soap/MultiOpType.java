
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            This type is a wrapper around a number of sub-operations allowing 
 *            complex structures to be updated in a single, atomic operation.
 *            
 *            Each sub-operation is one of the other possible operations, e.g. 
 *            updateItem, deleteItem etc.
 *            
 *            Inclusion of a multiOp is disallowed.
 *            
 *            The response is a MultiOpResponseType which wraps one response per
 *            sub-operation. It will terminate on the first failure and all 
 *            updates to that point rolled back.
 *            
 *            Inclusion of an id attribute in the sub-operation request will aid
 *            in associating responses with requests.
 *       
 * 
 * <p>Java class for MultiOpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiOpType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/wscal/calws-soap}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="operations" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}ArrayOfOperations"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiOpType", propOrder = {
    "operations"
})
public class MultiOpType
    extends BaseRequestType
{

    @XmlElement(required = true)
    protected ArrayOfOperations operations;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperations }
     *     
     */
    public ArrayOfOperations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperations }
     *     
     */
    public void setOperations(ArrayOfOperations value) {
        this.operations = value;
    }

}
