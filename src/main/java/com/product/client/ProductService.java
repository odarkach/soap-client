
package com.product.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ProductService", targetNamespace = "http://jaxb.soap.com/", wsdlLocation = "http://localhost:9999/ws/product?wsdl")
public class ProductService
    extends Service
{

    private final static URL PRODUCTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ProductService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ProductService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:9999/ws/product?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9999/ws/product?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PRODUCTSERVICE_WSDL_LOCATION = url;
    }

    public ProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductService() {
        super(PRODUCTSERVICE_WSDL_LOCATION, new QName("http://jaxb.soap.com/", "ProductService"));
    }

    /**
     * 
     * @return
     *     returns ProductInterface
     */
    @WebEndpoint(name = "ProductPort")
    public ProductInterface getProductPort() {
        return super.getPort(new QName("http://jaxb.soap.com/", "ProductPort"), ProductInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductInterface
     */
    @WebEndpoint(name = "ProductPort")
    public ProductInterface getProductPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxb.soap.com/", "ProductPort"), ProductInterface.class, features);
    }

}
