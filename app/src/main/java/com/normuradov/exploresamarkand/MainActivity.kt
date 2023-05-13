package com.normuradov.exploresamarkand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.normuradov.exploresamarkand.data.Repository
import com.normuradov.exploresamarkand.ui.AppScreens
import com.normuradov.exploresamarkand.ui.CategoryScreen
import com.normuradov.exploresamarkand.ui.ExploreSamarkandApp
import com.normuradov.exploresamarkand.ui.theme.ExploreSamarkandTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSize = calculateWindowSizeClass(this)
            ExploreSamarkandTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExploreSamarkandApp(windowSize = windowSize.widthSizeClass)
                }
            }
        }
    }
}