package com.dev.composejacocosample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.dev.composejacocosample.ui.theme.ComposeJacocoSampleTheme

@Composable
fun MainScreen() {
    Greeting(name = "Android", modifier = Modifier.testTag("greeting"))
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
        }
    }

}

@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun GreetingPreviewDark() {
    ComposeJacocoSampleTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeJacocoSampleTheme(darkTheme = true) {
        Greeting("Android")
    }
}
