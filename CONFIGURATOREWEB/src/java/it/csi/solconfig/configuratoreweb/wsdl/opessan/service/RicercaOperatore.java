/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.solconfig.configuratoreweb.wsdl.opessan.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-03-30T09:59:25.094+02:00
 * Generated source version: 3.4.3
 *
 */
@WebServiceClient(name = "RicercaOperatore",
                  wsdlLocation = "https://tst-applogic.reteunitaria.piemonte.it:1449/opessanwsj/services/ricercaOperatoreUserTkn?wsdl",
                  targetNamespace = "http://opessan.opessanws.services.csi.it/")
public class RicercaOperatore extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://opessan.opessanws.services.csi.it/", "RicercaOperatore");
    public final static QName RicercaOperatore = new QName("http://opessan.opessanws.services.csi.it/", "RicercaOperatore");
    static {
        URL url = null;
        try {
            url = new URL("https://tst-applogic.reteunitaria.piemonte.it:1449/opessanwsj/services/ricercaOperatoreUserTkn?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RicercaOperatore.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://tst-applogic.reteunitaria.piemonte.it:1449/opessanwsj/services/ricercaOperatoreUserTkn?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RicercaOperatore(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RicercaOperatore(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RicercaOperatore() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RicercaOperatore(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RicercaOperatore(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RicercaOperatore(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RicercaOperatore
     */
    @WebEndpoint(name = "RicercaOperatore")
    public it.csi.solconfig.configuratoreweb.wsdl.opessan.RicercaOperatore getRicercaOperatore() {
        return super.getPort(RicercaOperatore, it.csi.solconfig.configuratoreweb.wsdl.opessan.RicercaOperatore.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RicercaOperatore
     */
    @WebEndpoint(name = "RicercaOperatore")
    public it.csi.solconfig.configuratoreweb.wsdl.opessan.RicercaOperatore getRicercaOperatore(WebServiceFeature... features) {
        return super.getPort(RicercaOperatore, it.csi.solconfig.configuratoreweb.wsdl.opessan.RicercaOperatore.class, features);
    }

}
