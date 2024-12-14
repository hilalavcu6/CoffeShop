package com.example.coffeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeshop.ui.theme.CoffeeOnboardingTheme
import com.example.coffeshop.ui.theme.CoffeeOnboardingTheme
import com.example.coffeshop.ui.theme.DarkPrimary
import com.example.coffeshop.ui.theme.PrimaryColor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeOnboardingTheme {
                CoffeeOnboardingScreen()
            }
        }
    }
}

@Composable
fun CoffeeOnboardingScreen(darkTheme:Boolean= isSystemInDarkTheme()) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Arkaplan görseli
        Image(
            painter = painterResource(id = R.drawable.coffeson),
            contentDescription = stringResource(R.string.onboarding_title),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Üstüne gradyan efekt
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.8f)
                        )
                    )
                )
        )

        // Yazı ve butonlar
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.onboarding_title),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 8.dp), textAlign = TextAlign.Center
            )

            Text(
                text = stringResource(R.string.onboarding_subtitle),
                style = TextStyle(
                    color = Color.White.copy(alpha = 0.7f),
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(bottom = 32.dp), textAlign = TextAlign.Center
            )

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor =if(darkTheme) DarkPrimary else PrimaryColor),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(0.7f)
            ) {
                Text(
                    text = stringResource(R.string.onboarding_button_start),
                    style = TextStyle(
                        color = if(darkTheme) Color.Gray else Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}
