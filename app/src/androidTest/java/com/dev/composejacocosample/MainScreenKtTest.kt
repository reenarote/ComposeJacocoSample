package com.dev.composejacocosample

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenKtTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun launchMainScreen() {
        composeRule.setContent {
            MainScreen()
        }
        composeRule.onNodeWithTag("greeting").assertIsDisplayed()
    }
}