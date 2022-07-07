package com.lachlanvass.androidinterviewpractice.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.background(
                color = Color.Cyan,
            ),
            verticalArrangement = Arrangement.Center
        ) {
            Text("Hello")
            Text("World")

            Row(
                modifier = Modifier
                    .background(color = Color.Green)
                    .fillMaxSize(0.5f),
                horizontalArrangement = Arrangement.SpaceAround,

            ) {
                Text("Row")
                Text("Rowrow2")
                Text("Rowrow2")
            }
        }
    }
}