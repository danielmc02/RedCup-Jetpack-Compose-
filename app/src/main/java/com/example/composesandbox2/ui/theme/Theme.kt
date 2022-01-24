package com.example.composesandbox2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkWhite,
    primaryVariant = RedCrayola,
    secondary = Teal200,
    background = BlackRichFogra
)

private val LightColorPalette = lightColors(
    primary = RedCrayola,
    primaryVariant = RedCrayola,
    secondary = Teal200,
    background = WhiteBabyPowder

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ComposeSandbox2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else
             LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}