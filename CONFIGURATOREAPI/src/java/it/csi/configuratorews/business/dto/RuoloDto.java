/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.configuratorews.business.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "auth_d_ruolo")
@SequenceGenerator(name = "seq_auth_d_ruolo", sequenceName = "seq_auth_d_ruolo", allocationSize = 1)
public class RuoloDto extends CatalogoBaseDto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_auth_d_ruolo")
	@Column(name = "id")
	private Long id;

//	@OneToMany(mappedBy = "ruoloDto", cascade = CascadeType.ALL)
//	private Set<LogAuditDto> logAuditDtos;

	@Column(name = "Flag_configuratore")
	private String flagConfiguratore;
	
	@Column(name = "data_aggiornamento")
	private Timestamp dataAggiornamento;
	
	@Column(name = "data_inizio_validita")
	private Timestamp dataInizioValidita;
	
	@Column(name = "data_fine_validita")
	private Timestamp dataFineValidita;

	@Column(name = "visibilita_conf")
	private String visibilitaConf;
	
	@ManyToOne
	@JoinColumn(name = "id_operatore", referencedColumnName = "id")
	private UtenteDto utenteDto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlagConfiguratore() {
		return flagConfiguratore;
	}

	public void setFlagConfiguratore(String flagConfiguratore) {
		this.flagConfiguratore = flagConfiguratore;
	}

	public Timestamp getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(Timestamp dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	public Timestamp getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Timestamp dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Timestamp getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Timestamp dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public UtenteDto getUtenteDto() {
		return utenteDto;
	}

	public void setUtenteDto(UtenteDto utenteDto) {
		this.utenteDto = utenteDto;
	}

	public String getVisibilitaConf() {
		return visibilitaConf;
	}

	public void setVisibilitaConf(String visibilitaConf) {
		this.visibilitaConf = visibilitaConf;
	}

	//	public Set<LogAuditDto> getLogAuditDtos() {
//		return logAuditDtos;
//	}
//
//	public void setLogAuditDtos(Set<LogAuditDto> logAuditDtos) {
//		this.logAuditDtos = logAuditDtos;
//	}
}
