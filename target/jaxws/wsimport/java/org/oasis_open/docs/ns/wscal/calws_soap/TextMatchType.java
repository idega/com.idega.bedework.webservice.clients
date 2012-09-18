
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         The textMatch XML element specifies text used
 *         for a substring match against the property or parameter value
 *         specified in a calendaring REPORT request.
 *   
 *         The "collation" attribute is used to select the collation that the
 *         server MUST use for character string matching.  In the absence of
 *         this attribute, the server MUST use the "i;ascii-casemap"
 *         collation.
 *   
 *         The "negate-condition" attribute is used to indicate that this
 *         test returns a match if the text matches when the attribute value
 *         is set to "no", or return a match if the text does not match, if
 *         the attribute value is set to "yes".  For example, this can be
 *         used to match components with a STATUS property not set to
 *         CANCELLED.
 *       
 * 
 * <p>Java class for TextMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextMatchType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="collation" type="{http://www.w3.org/2001/XMLSchema}string" default="i;ascii-casemap" />
 *       &lt;attribute name="negate-condition" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextMatchType", propOrder = {
    "value"
})
public class TextMatchType {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String collation;
    @XmlAttribute(name = "negate-condition")
    protected Boolean negateCondition;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the collation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollation() {
        if (collation == null) {
            return "i;ascii-casemap";
        } else {
            return collation;
        }
    }

    /**
     * Sets the value of the collation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollation(String value) {
        this.collation = value;
    }

    /**
     * Gets the value of the negateCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegateCondition() {
        if (negateCondition == null) {
            return false;
        } else {
            return negateCondition;
        }
    }

    /**
     * Sets the value of the negateCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegateCondition(Boolean value) {
        this.negateCondition = value;
    }

}
