
package com.convertspeed.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ConvertSpeedsSoap", targetNamespace = "http://www.webserviceX.NET/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConvertSpeedsSoap {


    /**
     * 
     * @param toUnit
     * @param speed
     * @param fromUnit
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConvertSpeed", action = "http://www.webserviceX.NET/ConvertSpeed")
    @WebResult(name = "ConvertSpeedResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "ConvertSpeed", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ConvertSpeed")
    @ResponseWrapper(localName = "ConvertSpeedResponse", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ConvertSpeedResponse")
    public double convertSpeed(
            @WebParam(name = "speed", targetNamespace = "http://www.webserviceX.NET/")
                    double speed,
            @WebParam(name = "FromUnit", targetNamespace = "http://www.webserviceX.NET/")
                    SpeedUnit fromUnit,
            @WebParam(name = "ToUnit", targetNamespace = "http://www.webserviceX.NET/")
                    SpeedUnit toUnit);

}
