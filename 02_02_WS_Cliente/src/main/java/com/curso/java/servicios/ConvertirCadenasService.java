
package com.curso.java.servicios;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConvertirCadenasService", targetNamespace = "http://servicios.java.curso.com/", wsdlLocation = "http://localhost:8080/02_01_WS_Server/services/ConvertirCadenas?wsdl")
public class ConvertirCadenasService
    extends Service
{

    private final static URL CONVERTIRCADENASSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERTIRCADENASSERVICE_EXCEPTION;
    private final static QName CONVERTIRCADENASSERVICE_QNAME = new QName("http://servicios.java.curso.com/", "ConvertirCadenasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/02_01_WS_Server/services/ConvertirCadenas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTIRCADENASSERVICE_WSDL_LOCATION = url;
        CONVERTIRCADENASSERVICE_EXCEPTION = e;
    }

    public ConvertirCadenasService() {
        super(__getWsdlLocation(), CONVERTIRCADENASSERVICE_QNAME);
    }

    public ConvertirCadenasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTIRCADENASSERVICE_QNAME, features);
    }

    public ConvertirCadenasService(URL wsdlLocation) {
        super(wsdlLocation, CONVERTIRCADENASSERVICE_QNAME);
    }

    public ConvertirCadenasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTIRCADENASSERVICE_QNAME, features);
    }

    public ConvertirCadenasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvertirCadenasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TratadoDeCadenas
     */
    @WebEndpoint(name = "ConvertirCadenasPort")
    public TratadoDeCadenas getConvertirCadenasPort() {
        return super.getPort(new QName("http://servicios.java.curso.com/", "ConvertirCadenasPort"), TratadoDeCadenas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TratadoDeCadenas
     */
    @WebEndpoint(name = "ConvertirCadenasPort")
    public TratadoDeCadenas getConvertirCadenasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios.java.curso.com/", "ConvertirCadenasPort"), TratadoDeCadenas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTIRCADENASSERVICE_EXCEPTION!= null) {
            throw CONVERTIRCADENASSERVICE_EXCEPTION;
        }
        return CONVERTIRCADENASSERVICE_WSDL_LOCATION;
    }

}