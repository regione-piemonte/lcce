/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.configuratorews.business.dao.impl;

import it.csi.configuratorews.business.dao.MessaggiXmlLowDao;
import it.csi.configuratorews.business.dto.MessaggiXmlDto;
import it.csi.configuratorews.util.Constants;
import it.csi.configuratorews.util.Utils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.math.BigInteger;

@Component
public class MessaggiXmlLowDaoImpl extends EntityBaseLowDaoImpl<MessaggiXmlDto, Long> implements MessaggiXmlLowDao {

	Logger log = Logger.getLogger(Constants.APPLICATION_CODE);

	private String getTableName() {
		return "AUTH_L_XML_MESSAGGI"; // TODO costante
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW, noRollbackFor=Exception.class)
	public MessaggiXmlDto insert(MessaggiXmlDto obj) {
		log.info("START - Inserimento override insert xml dao");

		obj.setId(getNextValueSequence());

		Query query = entityManager.createNativeQuery(
				"INSERT INTO " + getTableName() + " (ID, ID_MESSAGGIO, XML_IN, DATA_INSERIMENTO) VALUES "
						+ " (:id, :idMessaggio, pgp_sym_encrypt_bytea(:xmlIn, getGoodPwd('@encryption_key@')), :dataInserimento)");

		query.setParameter("id", obj.getId());
		query.setParameter("idMessaggio", obj.getMessaggiDto().getId());
		query.setParameter("xmlIn", obj.getXmlIn());
		query.setParameter("dataInserimento", Utils.sysdate());

		query.executeUpdate();

		log.info("END - Inserimento override insert xml dao");
		return obj;
	}

	private Long getNextValueSequence() {

		Query query = entityManager.createNativeQuery("SELECT nextval('SEQ_AUTH_L_XML_MESSAGGI')"); // TODO costante
		return ((BigInteger) Utils.getFirstRecord(query.getResultList())).longValue();

	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW, noRollbackFor=Exception.class)
	public void update(MessaggiXmlDto obj) {
		log.info("START - override update xml dao");

		Query query = entityManager.createNativeQuery("UPDATE " + getTableName() + " SET"
				+ " XML_OUT = pgp_sym_encrypt_bytea(:xmlOut, getGoodPwd('@encryption_key@')), DATA_AGGIORNAMENTO = :dataAggiornamento WHERE ID = :id");

		query.setParameter("xmlOut", obj.getXmlOut());
		query.setParameter("dataAggiornamento", Utils.sysdate());
		query.setParameter("id", obj.getId());

		query.executeUpdate();

		log.info("END - override update xml dao");
	}
}