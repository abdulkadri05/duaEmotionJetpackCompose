package com.tutorial.duaemotionproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.tutorial.duaemotionproject.screens.EmotionScreen
import com.tutorial.duaemotionproject.screens.MainScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController = navController) }
        composable("emotion/{emotionName}") { backStackEntry ->
            val emotionName = backStackEntry.arguments?.getString("emotionName")
            EmotionScreen(emotionName = emotionName)
        }
    }
}
