/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
*
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.dma.dmaloginccebl.business.dao.dto;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "auth_r_abilitazione")
@SequenceGenerator(name="seq_auth_r_abilitazione", sequenceName="seq_auth_r_abilitazione",allocationSize=1)
public class AbilitazioneDto extends BaseDto {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_auth_r_abilitazione")
    @Column(name = "id")
	private Long id;
	
	@Column(name = "codice_abilitazione")
	private String codiceAbilitazione;
	
	@Column(name = "data_inizio_validita")
	private Timestamp dataInizioValidita;
	
	@Column(name = "data_fine_validita")
	private Timestamp dataFineValidita;
	
	@ManyToOne
	@JoinColumn(name = "id_ruolo_utente", referencedColumnName = "id")
	private RuoloUtenteDto ruoloUtenteDto;
	
	@ManyToOne
	@JoinColumn(name = "id_applicazione", referencedColumnName = "id")
	private ApplicazioneDto applicazioneDto;
	
	@ManyToOne
	@JoinColumn(name = "utecol_id", referencedColumnName = "utecol_id")
	private UtenteCollocazioneDto utenteCollocazioneDto;

	@ManyToOne
	@JoinColumn(name = "fnztree_id", referencedColumnName = "fnztree_id")
	private TreeFunzionalitaDto treeFunzionalitaDto;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodiceAbilitazione() {
		return codiceAbilitazione;
	}

	public void setCodiceAbilitazione(String codiceAbilitazione) {
		this.codiceAbilitazione = codiceAbilitazione;
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

	public RuoloUtenteDto getRuoloUtenteDto() {
		return ruoloUtenteDto;
	}

	public void setRuoloUtenteDto(RuoloUtenteDto ruoloUtenteDto) {
		this.ruoloUtenteDto = ruoloUtenteDto;
	}

	public ApplicazioneDto getApplicazioneDto() {
		return applicazioneDto;
	}

	public void setApplicazioneDto(ApplicazioneDto applicazioneDto) {
		this.applicazioneDto = applicazioneDto;
	}

	public UtenteCollocazioneDto getUtenteCollocazioneDto() {
		return utenteCollocazioneDto;
	}

	public void setUtenteCollocazioneDto(UtenteCollocazioneDto utenteCollocazioneDto) {
		this.utenteCollocazioneDto = utenteCollocazioneDto;
	}

	public TreeFunzionalitaDto getTreeFunzionalitaDto() {
		return treeFunzionalitaDto;
	}

	public void setTreeFunzionalitaDto(TreeFunzionalitaDto treeFunzionalitaDto) {
		this.treeFunzionalitaDto = treeFunzionalitaDto;
	}
	
}
