
/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.solconfig.configuratoreweb.wsdl.aura.getprofilosanitario;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Sat Nov 19 12:21:05 CET 2011
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "AnagrafeSanitaria", 
                  wsdlLocation = "file:/tmp/tempdir6454863589419029155.tmp/AURA.WS.AnagrafeSanitaria_1.wsdl",
                  targetNamespace = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it") 
public class AnagrafeSanitaria extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://AnagrafeSanitaria.central.services.auraws.aura.csi.it", "AnagrafeSanitaria");
    public final static QName AnagrafeSanitariaSoap = new QName("http://AnagrafeSanitaria.central.services.auraws.aura.csi.it", "AnagrafeSanitariaSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/tmp/tempdir6454863589419029155.tmp/AURA.WS.AnagrafeSanitaria_1.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/tmp/tempdir6454863589419029155.tmp/AURA.WS.AnagrafeSanitaria_1.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AnagrafeSanitaria(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AnagrafeSanitaria(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AnagrafeSanitaria() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns AnagrafeSanitariaSoap
     */
    @WebEndpoint(name = "AnagrafeSanitariaSoap")
    public AnagrafeSanitariaSoap getAnagrafeSanitariaSoap() {
        return super.getPort(AnagrafeSanitariaSoap, AnagrafeSanitariaSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AnagrafeSanitariaSoap
     */
    @WebEndpoint(name = "AnagrafeSanitariaSoap")
    public AnagrafeSanitariaSoap getAnagrafeSanitariaSoap(WebServiceFeature... features) {
        return super.getPort(AnagrafeSanitariaSoap, AnagrafeSanitariaSoap.class, features);
    }

}
