
package org.oasis_open.docs.ws_calendar.ns.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.bedework.synch.wsmessages.AlreadySubscribedType;
import org.bedework.synch.wsmessages.InvalidTokenType;
import org.bedework.synch.wsmessages.ServiceStoppedType;
import org.bedework.synch.wsmessages.UnknownSubscriptionType;
import org.bedework.synch.wsmessages.UnreachableTargetType;


/**
 * <p>Java class for ErrorCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeType")
@XmlSeeAlso({
    InvalidTokenType.class,
    ServiceStoppedType.class,
    AlreadySubscribedType.class,
    UnreachableTargetType.class,
    UnknownSubscriptionType.class,
    InvalidCalendarCollectionLocationType.class,
    InvalidFilterType.class,
    AfterMaxDateTimeType.class,
    MissingChangeTokenType.class,
    InvalidCalendarObjectResourceType.class,
    UnsupportedCalendarComponentType.class,
    ExceedsMaxResourceSizeType.class,
    NotCalendarDataType.class,
    PartialSuccessType.class,
    TooManyAttendeesPerInstanceType.class,
    UidConflictType.class,
    TargetExistsType.class,
    TooManyInstancesType.class,
    MismatchedChangeTokenType.class,
    TargetDoesNotExistType.class,
    BeforeMinDateTimeType.class,
    InvalidCalendarDataType.class,
    TargetNotEntityType.class,
    ForbiddenType.class
})
public class ErrorCodeType {


}
