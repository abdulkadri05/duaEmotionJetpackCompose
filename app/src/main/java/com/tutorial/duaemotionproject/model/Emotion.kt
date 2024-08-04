package com.tutorial.duaemotionproject.model

data class Emotion(
    val name: String,
    val content: String
) {
    // Return the content as the dua
    val dua: String
        get() = content
}
