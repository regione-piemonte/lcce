/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.solconfig.configuratoreweb.business.dao;

import java.util.Collection;

import it.csi.solconfig.configuratoreweb.business.dao.dto.BaseDto;

public interface EntityBaseLowDao<T extends BaseDto, E> {
	
	public T insert(T obj);
	
	public void update(T obj);
	
	public T findByPrimaryId(E id);
	
	public Collection<T> findAll(T obj);

	public Collection<T> findByFilter(T obj) throws Exception;
	
	

}
