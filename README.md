
# Prodotto
Il prodotto ***Configuratore Operatori***   realizza un sistema software per l'accesso ai servizi online della Sanità della Regione Piemonte che comprende:
- un punto unico di accesso (PUA) per consentire agli utenti di enti pubblici e privati di accedere ad uno dei servizi online a cui sono abilitati dopo essersi autenticati e aver selezionato il *ruolo* con cui vogliono operare e la *collocazione* presso cui operano 
- un database che memorizza tutte le informazioni relative a utenti, ruoli, collocazioni e abilitazioni attive
- un meccanismo di accesso per consentire l'integrazione sicura fra il PUA e i servizi online a cui l'utente è abilitato.
- un meccanismo di accesso per consentire l'integrazione sicura fra le Cartelle Cliniche Elettroniche dei Medici e i servizi online della Sanità (questo meccanismo si basa sull'autenticazione dell'utente sul sistema esterno Iride).

# Descrizione del prodotto 
Il prodotto è composto attualmente dalle seguenti componenti 
| Componente |Descrizione  |Versione |
|--|--|--|
| PUAWA | Web Application che realizza il PUA |-1.1.0-|
| PUARW | Risorse statiche utili alla componente software PUAWA |-1.0.0-|
| DMALOGINCCEDB | Script per creazione database che memorizza tutte le informazioni relative a utenti, ruoli, collocazioni e abilitazioni attive |-1.0.25-|
| DMALOGINCCEBL | Web Service utili a realizzare un meccanismo di accesso per consentire l'integrazione sicura fra il PUA e i vari servizi online a cui l'utente è abilitato |-1.1.0-|
| CONFIGURATOREWEB |  web application che consente di configurare gli utenti del sistema |-1.1.0-|
| CONFIGURATOREAPI |  api rest che consentono di configurare gli utenti del sistema |-1.1.0-|
| BATCHABILITAZCONFIG |  batch che consente di configurare in maniera massiva gli utenti del sistema |-1.0.0-|


# Prerequisiti di sistema 

## Software
- [Apache 2.4](https://www.apache.org/)
- [RedHat JBoss EAP 6.4](https://developers.redhat.com/products/eap/download)
- [JDK Oracle 1.8](https://www.oracle.com/java/technologies/downloads/archive/) 
- [PostgreSQL 9.6](https://www.postgresql.org/download/)
- [CentOS 7.6](https://www.centos.org/)

## Dipendenze da sistemi esterni

### Sistema di autenticazione Iride
La componente DMALOGINCCEBL dipende dal sistema esterno di autenticazione Iride che è invocabile tramite Web Services il cui WSDL è DOCS\dmaloginccebl-wsdl\PolicyEnforcerBase_wsdl.xml

### Sistema di autenticazione
Il sistema di autenticazione su cui si basa il PUA è esterno al presente prodotto ed è basato sul framework SHIBBOLETH composto da Service Provider e Identity Provider. Gli operatori che accedono ai servizi online della Sanità regionale piemontese si basano su 
- credenziali della PA Piemontese
- certificati digitali

### Servizi per la visualizzazione di report esterni 
La componente PUAWA dipende da servizi  per la visualizzazione di report esterni il cui WSDL sono:

 - DOCS\puawa-wsdl\ReportOperazioniConsensiService_wsdl.xml
 - DOCS\puawa-wsdl\ReportRefertiScaricatiService_wsdl.xml


### Servizio di Notifiche al cittadino
La componente PUAWA dipende da un Servizio di Notifiche al cittadino il cui WSDL è DOCS\puawa-wsdl\NotificheCittASR_wsdl.xml



# Installing
Vedere il file install.pdf nella cartella DOCS 


# Versioning
Per il versionamento del software si usa la tecnica Semantic Versioning (http://semver.org).

# Authors
La lista delle persone che hanno partecipato alla realizzazione del software sono:
- Davide Grosso
- Giuliano Iunco
- Giuseppe Vezzetti
- Manuela Bontempi
- Michele Mastrorilli
- Nicola Gaudenzi
- Viviana Addari
- Yvonne Carpegna


# Copyrights
© Copyright Regione Piemonte – 2022


# License
EUPL-1.2 Compatibile
Vedere il file LICENSE.txt per i dettagli.