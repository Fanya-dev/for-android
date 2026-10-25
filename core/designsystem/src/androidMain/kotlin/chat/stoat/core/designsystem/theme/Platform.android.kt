package chat.stoat.core.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.DeviceFontFamilyName
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.core.view.ViewCompat
import chat.stoat.core.model.settings.UserInterfaceFont

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
actual fun systemSupportsDynamicColors(): Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

actual fun getDefaultFont(): UserInterfaceFont =
    if (Build.MANUFACTURER == "Google" && Build.MODEL.startsWith("Pixel")) {
        UserInterfaceFont.GoogleSansFlex
    } else {
        UserInterfaceFont.Default
    }

@Composable
internal actual fun dynamicColorScheme(dark: Boolean): ColorScheme {
    val context = LocalContext.current
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        if (dark) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
    } else {
        error("Dynamic colour requires Android 12")
    }
}

@Composable
internal actual fun SystemBarAppearance(isDark: Boolean) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            @Suppress("DEPRECATION")
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = !isDark
        }
    }
}

internal actual val monospaceFallbackFonts: List<Font> = listOf(
    Font(DeviceFontFamilyName("monospace"), FontWeight.Normal, FontStyle.Normal),
    Font(DeviceFontFamilyName("monospace"), FontWeight.Normal, FontStyle.Italic),
)
