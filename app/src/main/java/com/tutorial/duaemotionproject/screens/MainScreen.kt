package com.tutorial.duaemotionproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tutorial.duaemotionproject.components.TopBar
import com.tutorial.duaemotionproject.model.Emotion
import kotlin.random.Random

@Composable
fun MainScreen(navController: NavHostController) {
    // Sample list of emotions
    val emotions = listOf(
        Emotion("Happy", "Dua for happiness"),
        Emotion("Sad", "Dua for sadness"),
        Emotion("Angry", "Dua for anger"),
        Emotion("Calm", "Dua for calmness"),
        Emotion("Excited", "Dua for excitement")
        // Add more emotions as needed
    )

    Column {
        TopBar(title = "Emotions")

        LazyColumn(modifier = Modifier.padding(16.dp)) {
            itemsIndexed(emotions.chunked(2)) { _, rowItems ->
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    rowItems.forEach { emotion ->
                        EmotionBox(
                            emotion = emotion,
                            onClick = {
                                navController.navigate("emotion/${emotion.name}")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
                    if (rowItems.size < 2) {
                        Spacer(modifier = Modifier.weight(1f)) // Adds space if there are less than 2 items in the row
                    }
                }
            }
        }
    }
}

@Composable
fun EmotionBox(emotion: Emotion, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(4.dp)
            .clickable(onClick = onClick)
            .background(randomColor())
            .height(120.dp)
            .padding(16.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = emotion.name,
            style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Bold,
            color = Color.Black // White text color for better contrast
        )
    }
}

@Composable
fun randomColor(): Color {
    val random = Random.Default
    return Color(
        red = random.nextFloat(),
        green = random.nextFloat(),
        blue = random.nextFloat(),
        alpha = 1f
    )
}
