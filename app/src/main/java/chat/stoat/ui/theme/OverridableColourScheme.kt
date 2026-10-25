package chat.stoat.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import chat.stoat.core.model.data.OverridableColourScheme
import chat.stoat.shared.resources.Res
import chat.stoat.shared.resources.settings_appearance_colour_overrides_background
import chat.stoat.shared.resources.settings_appearance_colour_overrides_error
import chat.stoat.shared.resources.settings_appearance_colour_overrides_error_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_inverse_on_surface
import chat.stoat.shared.resources.settings_appearance_colour_overrides_inverse_primary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_inverse_surface
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_background
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_error
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_error_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_primary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_primary_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_secondary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_secondary_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_surface
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_surface_variant
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_tertiary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_on_tertiary_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_outline
import chat.stoat.shared.resources.settings_appearance_colour_overrides_outline_variant
import chat.stoat.shared.resources.settings_appearance_colour_overrides_primary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_primary_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_scrim
import chat.stoat.shared.resources.settings_appearance_colour_overrides_secondary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_secondary_container
import chat.stoat.shared.resources.settings_appearance_colour_overrides_surface
import chat.stoat.shared.resources.settings_appearance_colour_overrides_surface_tint
import chat.stoat.shared.resources.settings_appearance_colour_overrides_surface_variant
import chat.stoat.shared.resources.settings_appearance_colour_overrides_tertiary
import chat.stoat.shared.resources.settings_appearance_colour_overrides_tertiary_container
import org.jetbrains.compose.resources.StringResource


fun OverridableColourScheme.applyFromKeyValueMap(map: Map<String, Int>): OverridableColourScheme {
    var newScheme = this

    map.filterKeys { it in overridableColourSchemeFieldNames }.forEach { (key, value) ->
        when (key) {
            "primary" -> newScheme = newScheme.copy(primary = value)
            "onPrimary" -> newScheme = newScheme.copy(onPrimary = value)
            "primaryContainer" -> newScheme = newScheme.copy(primaryContainer = value)
            "onPrimaryContainer" -> newScheme =
                newScheme.copy(onPrimaryContainer = value)

            "inversePrimary" -> newScheme = newScheme.copy(inversePrimary = (value))
            "secondary" -> newScheme = newScheme.copy(secondary = (value))
            "onSecondary" -> newScheme = newScheme.copy(onSecondary = (value))
            "secondaryContainer" -> newScheme =
                newScheme.copy(secondaryContainer = (value))

            "onSecondaryContainer" -> newScheme =
                newScheme.copy(onSecondaryContainer = (value))

            "tertiary" -> newScheme = newScheme.copy(tertiary = (value))
            "onTertiary" -> newScheme = newScheme.copy(onTertiary = (value))
            "tertiaryContainer" -> newScheme = newScheme.copy(tertiaryContainer = (value))
            "onTertiaryContainer" -> newScheme =
                newScheme.copy(onTertiaryContainer = (value))

            "background" -> newScheme = newScheme.copy(background = (value))
            "onBackground" -> newScheme = newScheme.copy(onBackground = (value))
            "surface" -> newScheme = newScheme.copy(surface = (value))
            "onSurface" -> newScheme = newScheme.copy(onSurface = (value))
            "surfaceVariant" -> newScheme = newScheme.copy(surfaceVariant = (value))
            "onSurfaceVariant" -> newScheme = newScheme.copy(onSurfaceVariant = (value))
            "surfaceTint" -> newScheme = newScheme.copy(surfaceTint = (value))
            "inverseSurface" -> newScheme = newScheme.copy(inverseSurface = (value))
            "inverseOnSurface" -> newScheme = newScheme.copy(inverseOnSurface = (value))
            "error" -> newScheme = newScheme.copy(error = (value))
            "onError" -> newScheme = newScheme.copy(onError = (value))
            "errorContainer" -> newScheme = newScheme.copy(errorContainer = (value))
            "onErrorContainer" -> newScheme = newScheme.copy(onErrorContainer = (value))
            "outline" -> newScheme = newScheme.copy(outline = (value))
            "outlineVariant" -> newScheme = newScheme.copy(outlineVariant = (value))
            "scrim" -> newScheme = newScheme.copy(scrim = (value))
        }
    }

    return newScheme
}

fun OverridableColourScheme.getFieldByName(name: String): Int? {
    return when (name) {
        "primary" -> primary
        "onPrimary" -> onPrimary
        "primaryContainer" -> primaryContainer
        "onPrimaryContainer" -> onPrimaryContainer
        "inversePrimary" -> inversePrimary
        "secondary" -> secondary
        "onSecondary" -> onSecondary
        "secondaryContainer" -> secondaryContainer
        "onSecondaryContainer" -> onSecondaryContainer
        "tertiary" -> tertiary
        "onTertiary" -> onTertiary
        "tertiaryContainer" -> tertiaryContainer
        "onTertiaryContainer" -> onTertiaryContainer
        "background" -> background
        "onBackground" -> onBackground
        "surface" -> surface
        "onSurface" -> onSurface
        "surfaceVariant" -> surfaceVariant
        "onSurfaceVariant" -> onSurfaceVariant
        "surfaceTint" -> surfaceTint
        "inverseSurface" -> inverseSurface
        "inverseOnSurface" -> inverseOnSurface
        "error" -> error
        "onError" -> onError
        "errorContainer" -> errorContainer
        "onErrorContainer" -> onErrorContainer
        "outline" -> outline
        "outlineVariant" -> outlineVariant
        "scrim" -> scrim
        else -> null
    }
}

val overridableColourSchemeFieldNames: List<String>
    get() = listOf(
        "primary",
        "onPrimary",
        "primaryContainer",
        "onPrimaryContainer",
        "inversePrimary",
        "secondary",
        "onSecondary",
        "secondaryContainer",
        "onSecondaryContainer",
        "tertiary",
        "onTertiary",
        "tertiaryContainer",
        "onTertiaryContainer",
        "background",
        "onBackground",
        "surface",
        "onSurface",
        "surfaceVariant",
        "onSurfaceVariant",
        "surfaceTint",
        "inverseSurface",
        "inverseOnSurface",
        "error",
        "onError",
        "errorContainer",
        "onErrorContainer",
        "outline",
        "outlineVariant",
        "scrim"
    )

val overridableColourSchemeFieldNameToResource: Map<String, StringResource>
    get() = mapOf(
        "primary" to Res.string.settings_appearance_colour_overrides_primary,
        "onPrimary" to Res.string.settings_appearance_colour_overrides_on_primary,
        "primaryContainer" to Res.string.settings_appearance_colour_overrides_primary_container,
        "onPrimaryContainer" to Res.string.settings_appearance_colour_overrides_on_primary_container,
        "inversePrimary" to Res.string.settings_appearance_colour_overrides_inverse_primary,
        "secondary" to Res.string.settings_appearance_colour_overrides_secondary,
        "onSecondary" to Res.string.settings_appearance_colour_overrides_on_secondary,
        "secondaryContainer" to Res.string.settings_appearance_colour_overrides_secondary_container,
        "onSecondaryContainer" to Res.string.settings_appearance_colour_overrides_on_secondary_container,
        "tertiary" to Res.string.settings_appearance_colour_overrides_tertiary,
        "onTertiary" to Res.string.settings_appearance_colour_overrides_on_tertiary,
        "tertiaryContainer" to Res.string.settings_appearance_colour_overrides_tertiary_container,
        "onTertiaryContainer" to Res.string.settings_appearance_colour_overrides_on_tertiary_container,
        "background" to Res.string.settings_appearance_colour_overrides_background,
        "onBackground" to Res.string.settings_appearance_colour_overrides_on_background,
        "surface" to Res.string.settings_appearance_colour_overrides_surface,
        "onSurface" to Res.string.settings_appearance_colour_overrides_on_surface,
        "surfaceVariant" to Res.string.settings_appearance_colour_overrides_surface_variant,
        "onSurfaceVariant" to Res.string.settings_appearance_colour_overrides_on_surface_variant,
        "surfaceTint" to Res.string.settings_appearance_colour_overrides_surface_tint,
        "inverseSurface" to Res.string.settings_appearance_colour_overrides_inverse_surface,
        "inverseOnSurface" to Res.string.settings_appearance_colour_overrides_inverse_on_surface,
        "error" to Res.string.settings_appearance_colour_overrides_error,
        "onError" to Res.string.settings_appearance_colour_overrides_on_error,
        "errorContainer" to Res.string.settings_appearance_colour_overrides_error_container,
        "onErrorContainer" to Res.string.settings_appearance_colour_overrides_on_error_container,
        "outline" to Res.string.settings_appearance_colour_overrides_outline,
        "outlineVariant" to Res.string.settings_appearance_colour_overrides_outline_variant,
        "scrim" to Res.string.settings_appearance_colour_overrides_scrim
    )


fun ColorScheme.getFieldByName(name: String): Int? {
    return when (name) {
        "primary" -> primary.toArgb()
        "onPrimary" -> onPrimary.toArgb()
        "primaryContainer" -> primaryContainer.toArgb()
        "onPrimaryContainer" -> onPrimaryContainer.toArgb()
        "inversePrimary" -> inversePrimary.toArgb()
        "secondary" -> secondary.toArgb()
        "onSecondary" -> onSecondary.toArgb()
        "secondaryContainer" -> secondaryContainer.toArgb()
        "onSecondaryContainer" -> onSecondaryContainer.toArgb()
        "tertiary" -> tertiary.toArgb()
        "onTertiary" -> onTertiary.toArgb()
        "tertiaryContainer" -> tertiaryContainer.toArgb()
        "onTertiaryContainer" -> onTertiaryContainer.toArgb()
        "background" -> background.toArgb()
        "onBackground" -> onBackground.toArgb()
        "surface" -> surface.toArgb()
        "onSurface" -> onSurface.toArgb()
        "surfaceVariant" -> surfaceVariant.toArgb()
        "onSurfaceVariant" -> onSurfaceVariant.toArgb()
        "surfaceTint" -> surfaceTint.toArgb()
        "inverseSurface" -> inverseSurface.toArgb()
        "inverseOnSurface" -> inverseOnSurface.toArgb()
        "error" -> error.toArgb()
        "onError" -> onError.toArgb()
        "errorContainer" -> errorContainer.toArgb()
        "onErrorContainer" -> onErrorContainer.toArgb()
        "outline" -> outline.toArgb()
        "outlineVariant" -> outlineVariant.toArgb()
        "scrim" -> scrim.toArgb()
        else -> null
    }
}