/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.dma.puawa.business.dao;

import java.util.Collection;

import it.csi.dma.puawa.business.dao.dto.RuoloDto;

public interface RuoloLowDao extends CatalogoBaseLowDao<RuoloDto, Long>{

	Collection<RuoloDto> findByUtenteCodiceFiscale(String codiceFiscale);
}
