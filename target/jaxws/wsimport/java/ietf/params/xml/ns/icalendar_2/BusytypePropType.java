
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *        encodingparam      = "ENCODING" "="
 *                           ( "8BIT"
 *           ; "8bit" text encoding is defined in [RFC2045]
 *                           / "BASE64"
 *           ; "BASE64" binary encoding format is defined in [RFC4648]
 *                           )
 *       busytypevalue = "BUSY" 
 *                     / "BUSY-UNAVAILABLE" 
 *                     / "BUSY-TENTATIVE" 
 *                     / iana-token 
 *                     / x-name
 *                     
 *                     ; Default is "BUSY-UNAVAILABLE".
 *       
 * 
 * <p>Java class for BusytypePropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusytypePropType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}TextPropertyType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusytypePropType")
public class BusytypePropType
    extends TextPropertyType
{


}
