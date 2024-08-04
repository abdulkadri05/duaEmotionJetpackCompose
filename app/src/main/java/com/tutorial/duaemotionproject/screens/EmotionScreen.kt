package com.tutorial.duaemotionproject.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.tutorial.duaemotionproject.model.Emotion


@Composable
fun EmotionScreen(emotionName: Any) {
    var selectedEmotion by remember { mutableStateOf<Emotion?>(null) }


}