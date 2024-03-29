/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.solconfig.configuratoreweb.wsdl.aura.ScreeningEpatiteC;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.2.2
 * Fri May 06 17:30:45 CEST 2022
 * Generated source version: 2.2.2
 * 
 */

public final class ScreeningEpatiteCSoap_ScreeningEpatiteCSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://ScreeningEpatiteC.central.services.auraws.aura.csi.it", "ScreeningEpatiteC");

    private ScreeningEpatiteCSoap_ScreeningEpatiteCSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ScreeningEpatiteC_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ScreeningEpatiteC_Service ss = new ScreeningEpatiteC_Service(wsdlURL, SERVICE_NAME);
        ScreeningEpatiteCSoap port = ss.getScreeningEpatiteCSoap();  
        
        {
        System.out.println("Invoking screeningEpatiteC...");
        it.csi.solconfig.configuratoreweb.wsdl.aura.ScreeningEpatiteC.Request _screeningEpatiteC_assistito = null;
        it.csi.solconfig.configuratoreweb.wsdl.aura.ScreeningEpatiteC.Response _screeningEpatiteC__return = port.screeningEpatiteC(_screeningEpatiteC_assistito);
        System.out.println("screeningEpatiteC.result=" + _screeningEpatiteC__return);


        }

        System.exit(0);
    }

}
