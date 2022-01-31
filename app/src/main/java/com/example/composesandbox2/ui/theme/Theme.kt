package com.example.composesandbox2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColors = darkColors(
    primary = DarkRedCrayola,
    primaryVariant = RedCrayola,
    secondary = RedCrayola,
    background = BlackRichFogra
)

private val LightColors = lightColors(
    primary = RedCrayola,
    primaryVariant = DarkRedCrayola,
    secondary = Purple200,
    background = WhiteBabyPowder,
    onBackground = RedCrayola
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
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}