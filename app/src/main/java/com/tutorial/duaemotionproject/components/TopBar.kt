package com.tutorial.duaemotionproject.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(title: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth() // Ensure the TopBar spans the full width
            .background(Color(0xFF20B2AA)) // Light Sea Green color
            .padding(16.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth() // Ensure text is centered in the Box
        )
    }
}


@Preview
@Composable
fun TopBarPreview(){
    TopBar(title = "Sample Title")
}