
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
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

    private final static QName _Update_QNAME = new QName("http://NewWebService/", "update");
    private final static QName _Hello_QNAME = new QName("http://NewWebService/", "hello");
    private final static QName _Delete_QNAME = new QName("http://NewWebService/", "delete");
    private final static QName _Insertdevice_QNAME = new QName("http://NewWebService/", "insertdevice");
    private final static QName _UpdateResponse_QNAME = new QName("http://NewWebService/", "updateResponse");
    private final static QName _RetriveResponse_QNAME = new QName("http://NewWebService/", "retriveResponse");
    private final static QName _InsertdeviceResponse_QNAME = new QName("http://NewWebService/", "insertdeviceResponse");
    private final static QName _Retrive_QNAME = new QName("http://NewWebService/", "retrive");
    private final static QName _DeleteResponse_QNAME = new QName("http://NewWebService/", "deleteResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://NewWebService/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertdeviceResponse }
     * 
     */
    public InsertdeviceResponse createInsertdeviceResponse() {
        return new InsertdeviceResponse();
    }

    /**
     * Create an instance of {@link Retrive }
     * 
     */
    public Retrive createRetrive() {
        return new Retrive();
    }

    /**
     * Create an instance of {@link RetriveResponse }
     * 
     */
    public RetriveResponse createRetriveResponse() {
        return new RetriveResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Insertdevice }
     * 
     */
    public Insertdevice createInsertdevice() {
        return new Insertdevice();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertdevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "insertdevice")
    public JAXBElement<Insertdevice> createInsertdevice(Insertdevice value) {
        return new JAXBElement<Insertdevice>(_Insertdevice_QNAME, Insertdevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetriveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "retriveResponse")
    public JAXBElement<RetriveResponse> createRetriveResponse(RetriveResponse value) {
        return new JAXBElement<RetriveResponse>(_RetriveResponse_QNAME, RetriveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertdeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "insertdeviceResponse")
    public JAXBElement<InsertdeviceResponse> createInsertdeviceResponse(InsertdeviceResponse value) {
        return new JAXBElement<InsertdeviceResponse>(_InsertdeviceResponse_QNAME, InsertdeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retrive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "retrive")
    public JAXBElement<Retrive> createRetrive(Retrive value) {
        return new JAXBElement<Retrive>(_Retrive_QNAME, Retrive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://NewWebService/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
