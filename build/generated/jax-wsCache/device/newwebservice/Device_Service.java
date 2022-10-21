
package newwebservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "device", targetNamespace = "http://NewWebService/", wsdlLocation = "http://localhost:8080/WebApplication1/device?WSDL")
public class Device_Service
    extends Service
{

    private final static URL DEVICE_WSDL_LOCATION;
    private final static WebServiceException DEVICE_EXCEPTION;
    private final static QName DEVICE_QNAME = new QName("http://NewWebService/", "device");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebApplication1/device?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEVICE_WSDL_LOCATION = url;
        DEVICE_EXCEPTION = e;
    }

    public Device_Service() {
        super(__getWsdlLocation(), DEVICE_QNAME);
    }

    public Device_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEVICE_QNAME, features);
    }

    public Device_Service(URL wsdlLocation) {
        super(wsdlLocation, DEVICE_QNAME);
    }

    public Device_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEVICE_QNAME, features);
    }

    public Device_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Device_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Device
     */
    @WebEndpoint(name = "devicePort")
    public Device getDevicePort() {
        return super.getPort(new QName("http://NewWebService/", "devicePort"), Device.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Device
     */
    @WebEndpoint(name = "devicePort")
    public Device getDevicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://NewWebService/", "devicePort"), Device.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEVICE_EXCEPTION!= null) {
            throw DEVICE_EXCEPTION;
        }
        return DEVICE_WSDL_LOCATION;
    }

}