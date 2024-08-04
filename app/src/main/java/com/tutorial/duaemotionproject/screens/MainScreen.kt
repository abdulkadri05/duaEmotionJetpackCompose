package com.tutorial.duaemotionproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tutorial.duaemotionproject.components.TopBar
import com.tutorial.duaemotionproject.model.Emotion

@Composable
fun MainScreen(navController: NavHostController) {
    // Sample list of emotions
    val emotions = listOf(
        Emotion("Happy", "Dua for happiness"),
        Emotion("Sad", "Dua for sadness"),
        Emotion("Angry", "Dua for anger")
        // Add more emotions as needed
    )

    Column {
        TopBar(title = "Emotions")

        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(emotions) { emotion ->
                EmotionBox(emotion = emotion, onClick = {
                    // Navigate to the EmotionScreen with the selected emotion
                    navController.navigate("emotion/${emotion.name}")
                })
            }
        }
    }
}

@Composable
fun EmotionBox(emotion: Emotion, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .clickable(onClick = onClick)
            .background(Color(0xFFE0F7FA)) // Light blue color
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = emotion.name,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )
    }
}
