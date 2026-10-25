package chat.stoat.core.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import chat.stoat.core.model.data.OverridableColourScheme

fun OverridableColourScheme.applyTo(colorScheme: ColorScheme): ColorScheme {
    var newScheme = colorScheme.copy()

    primary?.let { newScheme = newScheme.copy(primary = Color(it)) }
    onPrimary?.let { newScheme = newScheme.copy(onPrimary = Color(it)) }
    primaryContainer?.let {
        newScheme =
            newScheme.copy(primaryContainer = Color(it))
    }
    onPrimaryContainer?.let {
        newScheme =
            newScheme.copy(onPrimaryContainer = Color(it))
    }
    inversePrimary?.let {
        newScheme =
            newScheme.copy(inversePrimary = Color(it))
    }
    secondary?.let { newScheme = newScheme.copy(secondary = Color(it)) }
    onSecondary?.let { newScheme = newScheme.copy(onSecondary = Color(it)) }
    secondaryContainer?.let {
        newScheme =
            newScheme.copy(secondaryContainer = Color(it))
    }
    onSecondaryContainer?.let {
        newScheme =
            newScheme.copy(onSecondaryContainer = Color(it))
    }
    tertiary?.let { newScheme = newScheme.copy(tertiary = Color(it)) }
    onTertiary?.let { newScheme = newScheme.copy(onTertiary = Color(it)) }
    tertiaryContainer?.let {
        newScheme =
            newScheme.copy(tertiaryContainer = Color(it))
    }
    onTertiaryContainer?.let {
        newScheme =
            newScheme.copy(onTertiaryContainer = Color(it))
    }
    background?.let { newScheme = newScheme.copy(background = Color(it)) }
    onBackground?.let { newScheme = newScheme.copy(onBackground = Color(it)) }
    surface?.let { newScheme = newScheme.copy(surface = Color(it)) }
    onSurface?.let { newScheme = newScheme.copy(onSurface = Color(it)) }
    surfaceVariant?.let {
        newScheme =
            newScheme.copy(surfaceVariant = Color(it))
    }
    onSurfaceVariant?.let {
        newScheme =
            newScheme.copy(onSurfaceVariant = Color(it))
    }
    surfaceTint?.let { newScheme = newScheme.copy(surfaceTint = Color(it)) }
    inverseSurface?.let {
        newScheme =
            newScheme.copy(inverseSurface = Color(it))
    }
    inverseOnSurface?.let {
        newScheme =
            newScheme.copy(inverseOnSurface = Color(it))
    }
    error?.let { newScheme = newScheme.copy(error = Color(it)) }
    onError?.let { newScheme = newScheme.copy(onError = Color(it)) }
    errorContainer?.let {
        newScheme =
            newScheme.copy(errorContainer = Color(it))
    }
    onErrorContainer?.let {
        newScheme =
            newScheme.copy(onErrorContainer = Color(it))
    }
    outline?.let { newScheme = newScheme.copy(outline = Color(it)) }
    outlineVariant?.let {
        newScheme =
            newScheme.copy(outlineVariant = Color(it))
    }
    scrim?.let { newScheme = newScheme.copy(scrim = Color(it)) }

    return newScheme
}
