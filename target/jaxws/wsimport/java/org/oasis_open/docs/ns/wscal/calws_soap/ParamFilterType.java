
package org.oasis_open.docs.ns.wscal.calws_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The paramFilter XML element specifies a query
 *         targeted at a specific calendar property parameter (e.g.,
 *         PARTSTAT) in the scope of the calendar property on which it is
 *         defined.  A calendar property parameter is said to match a 
 *         paramFilter if:
 *   
 *         *  The paramFilter XML element is empty and a parameter of
 *            the type specified by the "name" attribute exists on the
 *            calendar property being examined;
 *   
 *         or:
 *   
 *         *  The paramFilter XML element contains a is-not-defined 
 *            XML element and no parameter of the type specified by
 *            the "name" attribute exists on the calendar property being
 *            examined;
 *       
 * 
 * <p>Java class for ParamFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}is-not-defined"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}textMatch"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamFilterType", propOrder = {
    "isNotDefined",
    "textMatch"
})
public class ParamFilterType {

    @XmlElement(name = "is-not-defined")
    protected IsNotDefinedType isNotDefined;
    protected TextMatchType textMatch;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the isNotDefined property.
     * 
     * @return
     *     possible object is
     *     {@link IsNotDefinedType }
     *     
     */
    public IsNotDefinedType getIsNotDefined() {
        return isNotDefined;
    }

    /**
     * Sets the value of the isNotDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsNotDefinedType }
     *     
     */
    public void setIsNotDefined(IsNotDefinedType value) {
        this.isNotDefined = value;
    }

    /**
     * Gets the value of the textMatch property.
     * 
     * @return
     *     possible object is
     *     {@link TextMatchType }
     *     
     */
    public TextMatchType getTextMatch() {
        return textMatch;
    }

    /**
     * Sets the value of the textMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextMatchType }
     *     
     */
    public void setTextMatch(TextMatchType value) {
        this.textMatch = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
