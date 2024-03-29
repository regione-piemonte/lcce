/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.solconfig.configuratoreweb.business.dao.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "auth_d_catalogo_log_audit")
@SequenceGenerator(name = "seq_auth_d_catalogo_log_audit", sequenceName = "seq_auth_d_catalogo_log_audit", allocationSize = 1)
public class CatalogoLogAuditDto extends CatalogoBaseDto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_auth_d_catalogo_log_audit")
	@Column(name = "id")
	private Long id;

	@Column(name = "descrizione_codice")
	private String descrizioneCodice;

	@Column(name = "tipo")
	private String tipo;

//	@OneToMany(mappedBy = "catalogoLogAuditDto", cascade = CascadeType.ALL)
//	private Set<LogAuditDto> logAuditDtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizioneCodice() {
		return descrizioneCodice;
	}

	public void setDescrizioneCodice(String descrizioneCodice) {
		this.descrizioneCodice = descrizioneCodice;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

//	public Set<LogAuditDto> getLogAuditDtos() {
//		return logAuditDtos;
//	}
//
//	public void setLogAuditDtos(Set<LogAuditDto> logAuditDtos) {
//		this.logAuditDtos = logAuditDtos;
//	}

}
