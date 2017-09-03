package com.convertspeed.client;

import com.product.client.ProductInterface;
import com.product.utils.JaxWsHandlerResolver;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ConvertSpeedClient {

    public ConvertSpeedsSoap client;

    public ConvertSpeedClient () {
        try {

            URL url = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
            QName qname = new QName("http://www.webserviceX.NET/", "ConvertSpeeds");

            Service service = Service.create(url, qname);

            service.setHandlerResolver(new JaxWsHandlerResolver());

            client = service.getPort(ConvertSpeedsSoap.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
