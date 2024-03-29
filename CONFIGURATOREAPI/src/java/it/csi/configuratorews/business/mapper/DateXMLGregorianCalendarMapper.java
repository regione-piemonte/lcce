/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.configuratorews.business.mapper;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateXMLGregorianCalendarMapper extends BaseMapper<Date, XMLGregorianCalendar> {

	@Override
	public XMLGregorianCalendar to(Date source) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(source);

		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (DatatypeConfigurationException e) {
			throw new IllegalStateException("Errore nella conversione in XMLGregorianCalendar. "+e.getMessage(), e);
		}
	}

	@Override
	public Date from(XMLGregorianCalendar dest) {
		if (dest == null) {
			return null;
		}

		return dest.toGregorianCalendar().getTime();
	}

}
