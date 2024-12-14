package com.example.coffeshop.ui.theme

import androidx.compose.ui.graphics.Color

// Light Theme Colors
val DarkPrimary = Color(0xFFa05429) // A softer, lighter version of the primary button color
val LightSecondary = Color(0xFFEDEDED) // Slightly toned-down version of white for secondary elements
val LightSurface = Color(0xFFF3F3F3) // Slightly darker than background for surfaces like cards


val PrimaryColor = Color(0xFFD1885E) // Buton ve tema rengi
val SecondaryColor = Color(0xFFf7f7f7)
val DarkBackground = Color(0xFF121212)
val LightBackground = Color(0xFFFFFFFF)

val DarkColorScheme = androidx.compose.material3.darkColorScheme(
    primary = PrimaryColor,
    background = DarkBackground,
    surface = DarkBackground,
    onPrimary = Color.White,
    onBackground = Color.White
)

val LightColorScheme = androidx.compose.material3.lightColorScheme(
    primary = PrimaryColor,
    background = LightBackground,
    surface = LightBackground,
    onPrimary = Color.White,
    onBackground = Color.Black
)




