/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.solconfig.configuratoreweb.business.dao.util;

public enum CatalogoLog {
	
	LOG_START("AUTH_LOG_000"),
	LOG_END("AUTH_LOG_001"),
	ERRORE_INTERNO("AUTH_ER_000"),
	ERRORE_AUTENTICAZIONE("AUTH_ER_501"),
	RUOLO_ERRATO("AUTH_ER_502"),
    CREDENZIALI_ERRATE("AUTH_ER_519"),	//Le credenziali inserite non sono corrette
	ABILITAZIONE_NON_VALIDA("AUTH_ER_506"),	//sistema non configurato per consentire al medico di accedere
	APPLICAZIONE_ERRATO("AUTH_ER_507"),
	USERNAME_OBBLIGATORIO("AUTH_ER_508"),
    PASSWORD_OBBLIGATORIO("AUTH_ER_509"),
    PIN_RICHIESTO("AUTH_ER_510"),
    RUOLO_OBBLIGATORIO("AUTH_ER_511"),
    IPCLIENT_OBBLIGATORIO("AUTH_ER_512"),
    APPLICAZIONE_OBBLIGATORIO("AUTH_ER_513"),
    COD_FISC_PAZIENTE("AUTH_ER_514"),
    PARAMETRI_AGGIUNTIVI_ERRATI("AUTH_ER_517"),	//i parametri ... non sono previsti per applicazione ...
    UTENTE_ERRATO("AUTH_ER_518"),
    RICHIEDENTE_OBBLIGATORIO("AUTH_ER_515"),	//Il Richiedente deve essere valorizzato
	CREDENZIALI_OBBLIGATORIO("AUTH_ER_516"),	//Le credenziali devono essere valorizzate
	TOKEN_ERRATO_SCADUTO("AUTH_ER_601"),
	TOKEN_OBBLIGATORIO("AUTH_ER_603"),
	APPLICAZIONE_OBBLIGATORIA("AUTH_ER_604"),
	IPBROWSER_OBBLIGATORIO("AUTH_ER_605"),
	IPADDRESS_ERRATO("AUTH_ER_602"),	//AUTH_ER_602 (Ip Address non congruente con quello fornito al momento della generazione del token)
	APPLICAZIONE_ERRATA("AUTH_ER_606"),
	APPLICAZIONE_NON_ABILITATA("AUTH_ER_609"),
	ERRORE_SERVIZIO_ESTERNO("AUTH_ER_EXT"),
	CAMPO_NON_VALORIZZATO("AUTH_ER_628"),
	CAMPO_NON_VALIDO("AUTH_ER_629"),
	NOTIFICA_IN_CARICO("AUTH_LOG_002");
	
	private final String value;

	CatalogoLog(String v) {
        value = v;
    }

    public String getValue() {
        return value;
    }

    public static CatalogoLog fromValue(String v) {
        for (CatalogoLog c: CatalogoLog.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }

}
