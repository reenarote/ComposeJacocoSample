package com.dev.composejacocosample.utils

class EmailAddressUtils {

    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"

    fun validateEmail(email: String): Boolean {
        return email.matches(emailRegex.toRegex())
    }
}
