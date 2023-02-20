import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Contributor panel",
        state = rememberWindowState(width = 700.dp, height = 400.dp)
    ) {
        MaterialTheme(colorScheme = lightColorScheme()) {
            ContributorPanel()
        }
    }
}