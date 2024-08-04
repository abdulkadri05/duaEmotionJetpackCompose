package com.tutorial.duaemotionproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tutorial.duaemotionproject.components.EmotionBox
import com.tutorial.duaemotionproject.components.TopBar
import com.tutorial.duaemotionproject.model.Emotion

@Composable
fun MainScreen(navController: NavHostController) {

    // Sample list of emotions
    val emotions = listOf(
        Emotion("Happy", "Dua for happiness"),
        Emotion("Angry", "Dua for anger"),
        Emotion("Calm", "Dua for calmness"),
        Emotion("Excited", "Dua for excitement"),
        Emotion("Sad", "Dua for sadness"),
        Emotion("Fearful", "Dua for fear"),
        Emotion("Grateful", "Dua for gratitude"),
        Emotion("Confident", "Dua for confidence"),
        Emotion("Tired", "Dua for tiredness"),
        Emotion("Stressed", "Dua for stress"),
        Emotion("Lonely", "Dua for loneliness"),
        Emotion("Hopeful", "Dua for hope"),
        Emotion("Overwhelmed", "Dua for feeling overwhelmed"),
        Emotion("Bored", "Dua for boredom")
        // Add more emotions as needed
    )



    // Predefined list of unique colors
    val colors = listOf(
        Color(0xFFFFA07A), // Light Salmon
        Color(0xFF20B2AA), // Light Sea Green
        Color(0xFFFFD700), // Gold
        Color(0xFFADFF2F), // Green Yellow
        Color(0xFF6495ED)  // Cornflower Blue
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) { // Ensure the background is black
        Column {
            TopBar(title = "Emotions")

            LazyColumn(modifier = Modifier.padding(16.dp)) {
                itemsIndexed(emotions.chunked(2)) { index, rowItems ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        rowItems.forEachIndexed { i, emotion ->
                            EmotionBox(
                                emotion = emotion,
                                color = colors[(index * 2 + i) % colors.size],
                                onClick = {
                                    navController.navigate("dua/${emotion.name}") // Adjust path as needed
                                },
                                modifier = Modifier.weight(1f)
                            )
                        }
                        if (rowItems.size < 2) {
                            Spacer(modifier = Modifier.weight(1f)) // Add space if less than 2 items
                        }
                    }
                }
            }
        }
    }
}
