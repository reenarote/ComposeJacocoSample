package com.dev.composejacocosample.utils

import org.junit.Assert.*
import org.junit.Test

class EmailAddressUtilsTest {
    val emailAddressUtils = EmailAddressUtils()

    @Test
    fun returnTrueWhenEmailAddressIsValid() {
        val isValid = emailAddressUtils.validateEmail("abc@gmail.com")
        assertTrue(isValid)
    }

    @Test
    fun returnFalseWhenEmailAddressIsInvalid() {
        val isValid = emailAddressUtils.validateEmail("@@@@abc@gmail.com")
        assertFalse(isValid)
    }

}