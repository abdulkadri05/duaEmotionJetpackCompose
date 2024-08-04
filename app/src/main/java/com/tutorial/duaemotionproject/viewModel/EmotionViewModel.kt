package com.tutorial.duaemotionproject.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.tutorial.duaemotionproject.model.Emotion

class EmotionViewModel : ViewModel() {
    private val _selectedEmotion = mutableStateOf<Emotion?>(null)
    val selectedEmotion: State<Emotion?> get() = _selectedEmotion

    fun selectEmotion(emotion: Emotion) {
        _selectedEmotion.value = emotion
    }
}
