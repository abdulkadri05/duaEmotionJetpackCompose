package com.tutorial.duaemotionproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.tutorial.duaemotionproject.duas.DuaViewModel
import com.tutorial.duaemotionproject.navigation.NavGraph
import com.tutorial.duaemotionproject.ui.theme.DuaEmotionProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DuaEmotionProjectTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    val duaViewModel: DuaViewModel = viewModel()
                    NavGraph(navController = navController, viewModel = duaViewModel)
                }
            }
        }
    }
}
