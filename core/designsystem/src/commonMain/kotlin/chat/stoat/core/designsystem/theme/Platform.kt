package chat.stoat.core.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import chat.stoat.core.model.settings.UserInterfaceFont

expect fun systemSupportsDynamicColors(): Boolean

expect fun getDefaultFont(): UserInterfaceFont

/** NOTE: this must only be called when [systemSupportsDynamicColors]`() == true`. */
@Composable
internal expect fun dynamicColorScheme(dark: Boolean): ColorScheme

@Composable
internal expect fun SystemBarAppearance(isDark: Boolean)

internal expect val monospaceFallbackFonts: List<Font>
