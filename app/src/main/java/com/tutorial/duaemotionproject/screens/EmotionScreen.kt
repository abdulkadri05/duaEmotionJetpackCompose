// file: EmotionScreen.kt
package com.tutorial.duaemotionproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tutorial.duaemotionproject.components.TopBar

@Composable
fun EmotionScreen(emotionName: String) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            TopBar(title = emotionName)

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Details for $emotionName",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }
    }
}
