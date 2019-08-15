package com.bapspatil.elon.api

import java.net.UnknownHostException

/*
** Created by Bapusaheb Patil {@link https://bapspatil.com}
*/

/**
 * Utils to check the type of HTTP error thrown
 */
class HttpErrorUtils {

    /**
     * Check if the user has list the connexion given the throwable thrown
     * @param throwable throwable to check
     * @return true if he user has lost connexion, false otherwise
     */
    fun hasLostInternet(throwable: Throwable): Boolean {
        return throwable is UnknownHostException
    }
}