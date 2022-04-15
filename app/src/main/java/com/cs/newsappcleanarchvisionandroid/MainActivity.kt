package com.cs.newsappcleanarchvisionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cs.newsappcleanarchvisionandroid.presentation.screens.HomeScreen
import com.cs.newsappcleanarchvisionandroid.ui.theme.NewsAppCleanArchVisionAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppCleanArchVisionAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   MyApp {
                       HomeScreen()
                   }
                }
            }
        }
    }
}

@Composable
fun MyApp(content : @Composable () -> Unit) {

    content()
}