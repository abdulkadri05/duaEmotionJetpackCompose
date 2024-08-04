package com.tutorial.duaemotionproject.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tutorial.duaemotionproject.model.Emotion

@Composable
fun EmotionBox(
    emotion: Emotion,
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(4.dp)
            .clickable(onClick = onClick)
            .background(color) // Use the passed color
            .height(120.dp)
            .padding(16.dp)
    ) {
        Text(
            text = emotion.name,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White // White text color for better contrast
        )
    }
}