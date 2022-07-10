package com.lachlanvass.androidinterviewpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.lachlanvass.androidinterviewpractice.presentation.ColorBox
import com.lachlanvass.androidinterviewpractice.presentation.ImageCard
import com.lachlanvass.androidinterviewpractice.presentation.ScrollingList
import com.lachlanvass.androidinterviewpractice.presentation.TextFieldSnackBarShower
import com.lachlanvass.androidinterviewpractice.ui.theme.AndroidInterviewPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidInterviewPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    ScrollingList()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

