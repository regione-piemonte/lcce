/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.configuratorews.util.filter;

public enum Operator {
	
	EQ, //(equals)
	NE,  //not equals)
	LT,  //less than)
	LTE,  //less that or equals)
	GT,  //greater than)
	GTE,  //greater than or equals)
	IN,  //in un insieme) - supporta una lista di valori di confronto
	NIN,  //not in) - supporta una lista di valori di confronto
	C,  //contains)
	CI,  //contains, ignore case)
	S,  //starts with)
	SI,  //starts with, ignore case)
	E,  //ends with)
	EI,  //ends with, ignore case)
	
	EXISTS,
	REGEX,


}
