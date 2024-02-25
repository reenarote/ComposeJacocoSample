package com.dev.composejacocosample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dev.composejacocosample.ui.theme.ComposeJacocoSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeJacocoSampleTheme {
                MainScreen()
            }
        }
    }
}


