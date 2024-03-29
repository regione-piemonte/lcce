/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.solconfig.configuratoreweb.business.dao.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "auth_r_funzionalita_tree")
@SequenceGenerator(name = "auth_r_funzionalita_tree_fnztree_id_seq", sequenceName = "auth_r_funzionalita_tree_fnztree_id_seq", allocationSize = 1)
public class TreeFunzionalitaDto extends BaseDto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auth_r_funzionalita_tree_fnztree_id_seq")
	@Column(name = "fnztree_id")
	private Long idTreeFunzione;

	@ManyToOne
	@JoinColumn(name = "fnz_id", referencedColumnName = "fnz_id")
	private FunzionalitaDto funzionalitaDto;

	@ManyToOne
	@JoinColumn(name = "fnztree_id_parent", referencedColumnName = "fnztree_id")
	private TreeFunzionalitaDto funzionalitaTreePadreDto;

	@Column(name = "data_inizio_validita")
	private Timestamp dataInizioValidita;

	@Column(name = "data_fine_validita")
	private Timestamp dataFineValidita;
	
	@Column(name = "data_cancellazione")
	private Timestamp dataCancellazione; 
	
	@Column(name = "data_aggiornamento")
	private Timestamp dataAggiornamento;
	
	@Column(name = "cf_operatore")
	private String cfOperatore;

	public Long getIdTreeFunzione() {
		return idTreeFunzione;
	}

	public void setIdTreeFunzione(Long idTreeFunzione) {
		this.idTreeFunzione = idTreeFunzione;
	}

	public FunzionalitaDto getFunzionalitaDto() {
		return funzionalitaDto;
	}

	public void setFunzionalitaDto(FunzionalitaDto funzionalitaDto) {
		this.funzionalitaDto = funzionalitaDto;
	}

	public TreeFunzionalitaDto getFunzionalitaTreePadreDto() {
		return funzionalitaTreePadreDto;
	}

	public void setFunzionalitaTreePadreDto(TreeFunzionalitaDto funzionalitaTreePadreDto) {
		this.funzionalitaTreePadreDto = funzionalitaTreePadreDto;
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

	public String getCfOperatore() {
		return cfOperatore;
	}

	public void setCfOperatore(String cfOperatore) {
		this.cfOperatore = cfOperatore;
	}

	public Timestamp getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Timestamp dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public Timestamp getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(Timestamp dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TreeFunzionalitaDto that = (TreeFunzionalitaDto) o;
		return getIdTreeFunzione().equals(that.getIdTreeFunzione());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdTreeFunzione());
	}

	public TreeFunzionalitaDto() {
	}

	public TreeFunzionalitaDto(FunzionalitaDto funzionalitaDto, TreeFunzionalitaDto funzionalitaPadreDto,
			Timestamp dataInizioValidita, Timestamp dataFineValidita) {
		this.funzionalitaDto = funzionalitaDto;
		this.funzionalitaTreePadreDto = funzionalitaPadreDto;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
	}

	public TreeFunzionalitaDto(BigInteger id, BigInteger idFunzionalita, BigInteger idFunzionalitaPadre,
			Timestamp dataInizioValidita) {
		this.idTreeFunzione = id.longValue();
		FunzionalitaDto funzionalitaDto = new FunzionalitaDto();
		funzionalitaDto.setIdFunzione(idFunzionalita.longValue());
		this.funzionalitaDto = funzionalitaDto;
		TreeFunzionalitaDto funzionalitaPadreDto = new TreeFunzionalitaDto();
		funzionalitaPadreDto.setIdTreeFunzione(idFunzionalitaPadre.longValue());
		this.funzionalitaTreePadreDto = funzionalitaPadreDto;
		this.dataInizioValidita = dataInizioValidita;
	}

	public TreeFunzionalitaDto(BigInteger id, BigInteger idFunzionalita, Timestamp dataInizioValidita) {
		this.idTreeFunzione = id.longValue();
		FunzionalitaDto funzionalitaDto = new FunzionalitaDto();
		funzionalitaDto.setIdFunzione(idFunzionalita.longValue());
		this.funzionalitaDto = funzionalitaDto;
		this.dataInizioValidita = dataInizioValidita;
	}

	public TreeFunzionalitaDto(Long id, Long idFunzionalita, Long idFunzionalitaPadre, Timestamp dataInizioValidita,
			Timestamp dataFineValidita) {
		this.idTreeFunzione = id;
		FunzionalitaDto funzionalitaDto = new FunzionalitaDto();
		funzionalitaDto.setIdFunzione(idFunzionalita);
		this.funzionalitaDto = funzionalitaDto;
		TreeFunzionalitaDto treeFunzionalitaDto = new TreeFunzionalitaDto();
		treeFunzionalitaDto.setIdTreeFunzione(idFunzionalitaPadre);
		this.funzionalitaTreePadreDto = treeFunzionalitaDto;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
	}
}
