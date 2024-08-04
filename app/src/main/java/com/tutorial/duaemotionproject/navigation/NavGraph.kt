// file: NavGraph.kt
package com.tutorial.duaemotionproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tutorial.duaemotionproject.duas.DuaViewModel
import com.tutorial.duaemotionproject.screens.DuaScreen
import com.tutorial.duaemotionproject.screens.EmotionScreen
import com.tutorial.duaemotionproject.screens.MainScreen

@Composable
fun NavGraph(navController: NavHostController, viewModel: DuaViewModel) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController = navController) }
        composable("emotion/{emotionName}") { backStackEntry ->
            val emotionName = backStackEntry.arguments?.getString("emotionName")
            if (emotionName != null) {
                EmotionScreen(emotionName = emotionName)
            }
        }
        composable("dua/{emotionName}") { backStackEntry ->
            val emotionName = backStackEntry.arguments?.getString("emotionName")
            DuaScreen(emotionName = emotionName, viewModel = viewModel)
        }
    }
}