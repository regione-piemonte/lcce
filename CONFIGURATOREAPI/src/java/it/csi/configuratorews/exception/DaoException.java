/*
* SPDX-FileCopyrightText: (C) Copyright 2022Regione Piemonte
* 
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.configuratorews.exception;

/**
 * @generated
 */
public class DaoException extends Exception {
    /**
     * @generated
     */
    protected Throwable throwable;

    /**
     * Method 'DaoException'
     * 
     * @param message
     * @generated
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * Method 'DaoException'
     * 
     * @param message
     * @param throwable
     * @generated
     */
    public DaoException(String message, Throwable throwable) {
        super(message);
        this.throwable = throwable;
    }

    /**
     * Method 'getCause'
     * 
     * @return Throwable
     * @generated
     */
    public Throwable getCause() {
        return throwable;
    }

}
