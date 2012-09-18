
package org.oasis_open.docs.ns.wscal.calws_soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The propFilter XML element specifies a query
 *         targeted at a specific calendar property (e.g., CATEGORIES) in the
 *         scope of the enclosing calendar component.  A calendar property is
 *         said to match a propFilter if:
 *   
 *         *  The propFilter XML element is empty and a property of
 *            the type specified by the "name" attribute exists in the
 *            enclosing calendar component;
 *   
 *         or:
 *   
 *         *  The propFilter XML element contains a is-not-defined 
 *            XML element and no property of the type specified by
 *            the "name" attribute exists in the enclosing calendar
 *            component;
 *   
 *         or:
 *   
 *         *  The propFilter XML element contains a timeRange
 *            XML element and the property value overlaps the specified time
 *            range, and all specified paramFilter child XML elements
 *            also match the targeted property;
 *   
 *         or:
 *   
 *         *  The propFilter XML element contains a textMatch
 *            XML element and the property value matches it, and all
 *            specified paramFilter child XML elements also match the
 *            targeted property;
 *       
 * 
 * <p>Java class for PropFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}is-not-defined"/>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}timeRange"/>
 *               &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}textMatch"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://docs.oasis-open.org/ns/wscal/calws-soap}paramFilter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="test" type="{http://docs.oasis-open.org/ns/wscal/calws-soap}AnyofAllofType" default="anyof" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropFilterType", propOrder = {
    "isNotDefined",
    "timeRange",
    "textMatch",
    "paramFilter"
})
public class PropFilterType {

    @XmlElement(name = "is-not-defined")
    protected IsNotDefinedType isNotDefined;
    protected UTCTimeRangeType timeRange;
    protected TextMatchType textMatch;
    protected List<ParamFilterType> paramFilter;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String test;

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
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link UTCTimeRangeType }
     *     
     */
    public UTCTimeRangeType getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTCTimeRangeType }
     *     
     */
    public void setTimeRange(UTCTimeRangeType value) {
        this.timeRange = value;
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
     * Gets the value of the paramFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamFilterType }
     * 
     * 
     */
    public List<ParamFilterType> getParamFilter() {
        if (paramFilter == null) {
            paramFilter = new ArrayList<ParamFilterType>();
        }
        return this.paramFilter;
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

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        if (test == null) {
            return "anyof";
        } else {
            return test;
        }
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

}
