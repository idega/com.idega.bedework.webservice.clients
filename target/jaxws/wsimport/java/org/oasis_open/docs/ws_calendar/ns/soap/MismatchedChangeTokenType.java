
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An update operation was attempted with a change token value which does not 
 *         match that held by the service. The client must refetch the entity to
 *         refresh its cached value and token.
 *         
 *         Note that matching of tokens is a server responsibility. The token is
 *         opaque to the client but probably structured to the server. Certain 
 *         non-conflicting updates may be allowed even if the token has changed. 
 *       
 * 
 * <p>Java class for MismatchedChangeTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MismatchedChangeTokenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ws-calendar/ns/soap}ErrorCodeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MismatchedChangeTokenType")
public class MismatchedChangeTokenType
    extends ErrorCodeType
{


}
