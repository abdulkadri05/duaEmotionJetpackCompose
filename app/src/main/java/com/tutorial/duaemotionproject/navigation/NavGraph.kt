package com.tutorial.duaemotionproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tutorial.duaemotionproject.screens.EmotionScreen
import com.tutorial.duaemotionproject.screens.MainScreen

@Composable
fun NavGraph(navController: NavHostController = rememberNavController(), modifier: Modifier) {
    NavHost(navController = navController, startDestination = "main") {
        composable(route = "main") {
            MainScreen(navController = navController)
        }
        composable(route = "emotion/{emotionName}") { backStackEntry ->
            val emotionName = backStackEntry.arguments?.getString("emotionName") ?: ""
            EmotionScreen(emotionName = emotionName)
        }
    }
}
