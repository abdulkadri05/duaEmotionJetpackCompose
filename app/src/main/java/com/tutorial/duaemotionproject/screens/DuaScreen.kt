package com.tutorial.duaemotionproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.tutorial.duaemotionproject.duas.DuaViewModel

@Composable
fun DuaScreen(emotionName: String?, viewModel: DuaViewModel) {
    // Fetch the dua using the viewModel
    val dua = viewModel.getDua(emotionName ?: "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // Set the background color to black
            .padding(16.dp), // Padding around the edges of the screen
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Center content vertically
    ) {
        // Arabic Dua
        Text(
            text = dua.arabic,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp) // Space below the Arabic text
        )

        // English Translation
        Text(
            text = dua.english,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp) // Space below the English text
        )

        // Transliteration
        Text(
            text = dua.transliteration,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}
