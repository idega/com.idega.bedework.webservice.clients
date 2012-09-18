
package org.bedework.synch.wsmessages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.bedework.synch.wsmessages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlreadySubscribed_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "alreadySubscribed");
    private final static QName _SubscriptionStatus_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "subscriptionStatus");
    private final static QName _SubscribeResponse_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "subscribeResponse");
    private final static QName _UnreachableTarget_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "unreachableTarget");
    private final static QName _SynchIdToken_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "synchIdToken");
    private final static QName _UnknownSubscription_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "unknownSubscription");
    private final static QName _Unsubscribe_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "unsubscribe");
    private final static QName _InvalidToken_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "invalidToken");
    private final static QName _StartServiceResponse_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "startServiceResponse");
    private final static QName _SubscriptionStatusResponse_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "subscriptionStatusResponse");
    private final static QName _StartServiceNotification_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "startServiceNotification");
    private final static QName _ServiceStopped_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "serviceStopped");
    private final static QName _KeepAliveResponse_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "keepAliveResponse");
    private final static QName _Subscribe_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "subscribe");
    private final static QName _KeepAliveNotification_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "keepAliveNotification");
    private final static QName _GetInfoResponse_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "getInfoResponse");
    private final static QName _GetInfo_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "getInfo");
    private final static QName _UnsubscribeResponse_QNAME = new QName("http://www.bedework.org/synch/wsmessages", "unsubscribeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.bedework.synch.wsmessages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubscriptionStatusRequestType }
     * 
     */
    public SubscriptionStatusRequestType createSubscriptionStatusRequestType() {
        return new SubscriptionStatusRequestType();
    }

    /**
     * Create an instance of {@link ArrayOfSynchConnectorInfo }
     * 
     */
    public ArrayOfSynchConnectorInfo createArrayOfSynchConnectorInfo() {
        return new ArrayOfSynchConnectorInfo();
    }

    /**
     * Create an instance of {@link ConnectorInfoType }
     * 
     */
    public ConnectorInfoType createConnectorInfoType() {
        return new ConnectorInfoType();
    }

    /**
     * Create an instance of {@link SynchPropertyInfoType }
     * 
     */
    public SynchPropertyInfoType createSynchPropertyInfoType() {
        return new SynchPropertyInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfSynchProperties }
     * 
     */
    public ArrayOfSynchProperties createArrayOfSynchProperties() {
        return new ArrayOfSynchProperties();
    }

    /**
     * Create an instance of {@link UnsubscribeResponseType }
     * 
     */
    public UnsubscribeResponseType createUnsubscribeResponseType() {
        return new UnsubscribeResponseType();
    }

    /**
     * Create an instance of {@link SubscribeResponseType }
     * 
     */
    public SubscribeResponseType createSubscribeResponseType() {
        return new SubscribeResponseType();
    }

    /**
     * Create an instance of {@link ServiceStoppedType }
     * 
     */
    public ServiceStoppedType createServiceStoppedType() {
        return new ServiceStoppedType();
    }

    /**
     * Create an instance of {@link SubscriptionStatusResponseType }
     * 
     */
    public SubscriptionStatusResponseType createSubscriptionStatusResponseType() {
        return new SubscriptionStatusResponseType();
    }

    /**
     * Create an instance of {@link UnreachableTargetType }
     * 
     */
    public UnreachableTargetType createUnreachableTargetType() {
        return new UnreachableTargetType();
    }

    /**
     * Create an instance of {@link SynchIdTokenType }
     * 
     */
    public SynchIdTokenType createSynchIdTokenType() {
        return new SynchIdTokenType();
    }

    /**
     * Create an instance of {@link UnsubscribeRequestType }
     * 
     */
    public UnsubscribeRequestType createUnsubscribeRequestType() {
        return new UnsubscribeRequestType();
    }

    /**
     * Create an instance of {@link AlreadySubscribedType }
     * 
     */
    public AlreadySubscribedType createAlreadySubscribedType() {
        return new AlreadySubscribedType();
    }

    /**
     * Create an instance of {@link SubscribeRequestType }
     * 
     */
    public SubscribeRequestType createSubscribeRequestType() {
        return new SubscribeRequestType();
    }

    /**
     * Create an instance of {@link InvalidTokenType }
     * 
     */
    public InvalidTokenType createInvalidTokenType() {
        return new InvalidTokenType();
    }

    /**
     * Create an instance of {@link ArrayOfSynchPropertyInfo }
     * 
     */
    public ArrayOfSynchPropertyInfo createArrayOfSynchPropertyInfo() {
        return new ArrayOfSynchPropertyInfo();
    }

    /**
     * Create an instance of {@link ActiveSubscriptionRequestType }
     * 
     */
    public ActiveSubscriptionRequestType createActiveSubscriptionRequestType() {
        return new ActiveSubscriptionRequestType();
    }

    /**
     * Create an instance of {@link StartServiceResponseType }
     * 
     */
    public StartServiceResponseType createStartServiceResponseType() {
        return new StartServiceResponseType();
    }

    /**
     * Create an instance of {@link BaseSynchRequestType }
     * 
     */
    public BaseSynchRequestType createBaseSynchRequestType() {
        return new BaseSynchRequestType();
    }

    /**
     * Create an instance of {@link GetInfoResponseType }
     * 
     */
    public GetInfoResponseType createGetInfoResponseType() {
        return new GetInfoResponseType();
    }

    /**
     * Create an instance of {@link SynchInfoType }
     * 
     */
    public SynchInfoType createSynchInfoType() {
        return new SynchInfoType();
    }

    /**
     * Create an instance of {@link KeepAliveNotificationType }
     * 
     */
    public KeepAliveNotificationType createKeepAliveNotificationType() {
        return new KeepAliveNotificationType();
    }

    /**
     * Create an instance of {@link KeepAliveResponseType }
     * 
     */
    public KeepAliveResponseType createKeepAliveResponseType() {
        return new KeepAliveResponseType();
    }

    /**
     * Create an instance of {@link StartServiceNotificationType }
     * 
     */
    public StartServiceNotificationType createStartServiceNotificationType() {
        return new StartServiceNotificationType();
    }

    /**
     * Create an instance of {@link GetInfoRequestType }
     * 
     */
    public GetInfoRequestType createGetInfoRequestType() {
        return new GetInfoRequestType();
    }

    /**
     * Create an instance of {@link UnknownSubscriptionType }
     * 
     */
    public UnknownSubscriptionType createUnknownSubscriptionType() {
        return new UnknownSubscriptionType();
    }

    /**
     * Create an instance of {@link SynchPropertyType }
     * 
     */
    public SynchPropertyType createSynchPropertyType() {
        return new SynchPropertyType();
    }

    /**
     * Create an instance of {@link SynchConnectorInfoType }
     * 
     */
    public SynchConnectorInfoType createSynchConnectorInfoType() {
        return new SynchConnectorInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlreadySubscribedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "alreadySubscribed", substitutionHeadNamespace = "http://docs.oasis-open.org/ws-calendar/ns/soap", substitutionHeadName = "error")
    public JAXBElement<AlreadySubscribedType> createAlreadySubscribed(AlreadySubscribedType value) {
        return new JAXBElement<AlreadySubscribedType>(_AlreadySubscribed_QNAME, AlreadySubscribedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "subscriptionStatus")
    public JAXBElement<SubscriptionStatusRequestType> createSubscriptionStatus(SubscriptionStatusRequestType value) {
        return new JAXBElement<SubscriptionStatusRequestType>(_SubscriptionStatus_QNAME, SubscriptionStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "subscribeResponse")
    public JAXBElement<SubscribeResponseType> createSubscribeResponse(SubscribeResponseType value) {
        return new JAXBElement<SubscribeResponseType>(_SubscribeResponse_QNAME, SubscribeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnreachableTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "unreachableTarget", substitutionHeadNamespace = "http://docs.oasis-open.org/ws-calendar/ns/soap", substitutionHeadName = "error")
    public JAXBElement<UnreachableTargetType> createUnreachableTarget(UnreachableTargetType value) {
        return new JAXBElement<UnreachableTargetType>(_UnreachableTarget_QNAME, UnreachableTargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchIdTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "synchIdToken")
    public JAXBElement<SynchIdTokenType> createSynchIdToken(SynchIdTokenType value) {
        return new JAXBElement<SynchIdTokenType>(_SynchIdToken_QNAME, SynchIdTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "unknownSubscription", substitutionHeadNamespace = "http://docs.oasis-open.org/ws-calendar/ns/soap", substitutionHeadName = "error")
    public JAXBElement<UnknownSubscriptionType> createUnknownSubscription(UnknownSubscriptionType value) {
        return new JAXBElement<UnknownSubscriptionType>(_UnknownSubscription_QNAME, UnknownSubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "unsubscribe")
    public JAXBElement<UnsubscribeRequestType> createUnsubscribe(UnsubscribeRequestType value) {
        return new JAXBElement<UnsubscribeRequestType>(_Unsubscribe_QNAME, UnsubscribeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "invalidToken", substitutionHeadNamespace = "http://docs.oasis-open.org/ws-calendar/ns/soap", substitutionHeadName = "error")
    public JAXBElement<InvalidTokenType> createInvalidToken(InvalidTokenType value) {
        return new JAXBElement<InvalidTokenType>(_InvalidToken_QNAME, InvalidTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "startServiceResponse")
    public JAXBElement<StartServiceResponseType> createStartServiceResponse(StartServiceResponseType value) {
        return new JAXBElement<StartServiceResponseType>(_StartServiceResponse_QNAME, StartServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "subscriptionStatusResponse")
    public JAXBElement<SubscriptionStatusResponseType> createSubscriptionStatusResponse(SubscriptionStatusResponseType value) {
        return new JAXBElement<SubscriptionStatusResponseType>(_SubscriptionStatusResponse_QNAME, SubscriptionStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartServiceNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "startServiceNotification")
    public JAXBElement<StartServiceNotificationType> createStartServiceNotification(StartServiceNotificationType value) {
        return new JAXBElement<StartServiceNotificationType>(_StartServiceNotification_QNAME, StartServiceNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStoppedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "serviceStopped", substitutionHeadNamespace = "http://docs.oasis-open.org/ws-calendar/ns/soap", substitutionHeadName = "error")
    public JAXBElement<ServiceStoppedType> createServiceStopped(ServiceStoppedType value) {
        return new JAXBElement<ServiceStoppedType>(_ServiceStopped_QNAME, ServiceStoppedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeepAliveResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "keepAliveResponse")
    public JAXBElement<KeepAliveResponseType> createKeepAliveResponse(KeepAliveResponseType value) {
        return new JAXBElement<KeepAliveResponseType>(_KeepAliveResponse_QNAME, KeepAliveResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "subscribe")
    public JAXBElement<SubscribeRequestType> createSubscribe(SubscribeRequestType value) {
        return new JAXBElement<SubscribeRequestType>(_Subscribe_QNAME, SubscribeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeepAliveNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "keepAliveNotification")
    public JAXBElement<KeepAliveNotificationType> createKeepAliveNotification(KeepAliveNotificationType value) {
        return new JAXBElement<KeepAliveNotificationType>(_KeepAliveNotification_QNAME, KeepAliveNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "getInfoResponse")
    public JAXBElement<GetInfoResponseType> createGetInfoResponse(GetInfoResponseType value) {
        return new JAXBElement<GetInfoResponseType>(_GetInfoResponse_QNAME, GetInfoResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "getInfo")
    public JAXBElement<GetInfoRequestType> createGetInfo(GetInfoRequestType value) {
        return new JAXBElement<GetInfoRequestType>(_GetInfo_QNAME, GetInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bedework.org/synch/wsmessages", name = "unsubscribeResponse")
    public JAXBElement<UnsubscribeResponseType> createUnsubscribeResponse(UnsubscribeResponseType value) {
        return new JAXBElement<UnsubscribeResponseType>(_UnsubscribeResponse_QNAME, UnsubscribeResponseType.class, null, value);
    }

}
