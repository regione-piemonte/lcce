/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
*
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.dma.dmaloginccebl.business.dao;

import java.util.List;

import it.csi.dma.dmaloginccebl.business.dao.dto.CollocazioneDto;

public interface CollocazioneLowDao extends EntityBaseLowDao<CollocazioneDto, Long> {

	List<CollocazioneDto> findByFilterAndDF(String codiceCollocazione, String codiceAzienda);
}
