package com.geoipservice.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class GeoIpClient {

    public com.geoipservice.client.GeoIpClient client;

    public GeoIpClient () {
        try {

            URL url = new URL("http://www.webservicex.net/geoipservice.asmx?wsdl");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://www.webservicex.net/", "GeoIPService");

            Service service = Service.create(url, qname);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
