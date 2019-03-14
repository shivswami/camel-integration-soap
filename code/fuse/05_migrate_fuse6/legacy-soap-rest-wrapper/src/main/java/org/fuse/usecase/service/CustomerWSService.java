package org.fuse.usecase.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-000281-redhat-3
 * 2018-12-20T16:24:17.911Z
 * Generated source version: 3.1.11.fuse-000281-redhat-3
 * 
 */
@WebServiceClient(name = "CustomerWSService", 
                  wsdlLocation = "http://soap-service-ai-advanced.apps.d764.openshift.opentlc.com/ws/customerService?wsdl",
                  targetNamespace = "http://service.usecase.fuse.org/") 
public class CustomerWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.usecase.fuse.org/", "CustomerWSService");
    public final static QName CustomerWSPort = new QName("http://service.usecase.fuse.org/", "CustomerWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://soap-service-ai-advanced.apps.d764.openshift.opentlc.com/ws/customerService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://soap-service-ai-advanced.apps.d764.openshift.opentlc.com/ws/customerService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CustomerWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CustomerWS
     */
    @WebEndpoint(name = "CustomerWSPort")
    public CustomerWS getCustomerWSPort() {
        return super.getPort(CustomerWSPort, CustomerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerWS
     */
    @WebEndpoint(name = "CustomerWSPort")
    public CustomerWS getCustomerWSPort(WebServiceFeature... features) {
        return super.getPort(CustomerWSPort, CustomerWS.class, features);
    }

}
