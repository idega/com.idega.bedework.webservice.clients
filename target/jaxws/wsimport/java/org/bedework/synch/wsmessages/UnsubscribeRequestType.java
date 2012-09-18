
package org.bedework.synch.wsmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *            Message unsubscribing. This needs to provide all the information for
 *            a given end of the subscription which would usually be the end that
 *            made the subscription in the first place.
 *            
 *            It's up to the connector to determine if enough information has been
 *            supplied to allow the unsubscribe. 
 *       
 * 
 * <p>Java class for UnsubscribeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsubscribeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bedework.org/synch/wsmessages}ActiveSubscriptionRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsubscribeRequestType")
public class UnsubscribeRequestType
    extends ActiveSubscriptionRequestType
{


}
