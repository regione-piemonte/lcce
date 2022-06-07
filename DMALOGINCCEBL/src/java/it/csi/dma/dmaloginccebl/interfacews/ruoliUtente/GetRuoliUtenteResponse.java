/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
*
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.dma.dmaloginccebl.interfacews.ruoliUtente;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.dma.dmaloginccebl.interfacews.msg.Errore;
import it.csi.dma.dmaloginccebl.interfacews.msg.RisultatoCodice;
import it.csi.dma.dmaloginccebl.interfacews.msg.ServiceResponse;

@XmlRootElement(name="getRuoliUtenteResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRuoliUtenteResponse", propOrder = {
		"ListaRuoli"
})
public class GetRuoliUtenteResponse extends ServiceResponse {
	
	@XmlElement(namespace = "http://dmac.csi.it/")
	protected Collection<Ruolo> ListaRuoli;
	
	public GetRuoliUtenteResponse(List<Errore> errori, RisultatoCodice esito) {
		super(errori, esito);
	}
	
	public GetRuoliUtenteResponse(RisultatoCodice esito) {
		super(esito);
	}
	
	public GetRuoliUtenteResponse() {
		super();
	}

	public Collection<Ruolo> getListaRuoli() {
		return ListaRuoli;
	}

	public void setListaRuoli(Collection<Ruolo> listaRuoli) {
		ListaRuoli = listaRuoli;
	}
}
