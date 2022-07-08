package com.lachlanvass.androidinterviewpractice.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ColorBox() {

    val colors = listOf(Color.Red, Color.Yellow, Color.Green, Color.Cyan)

    val boxColor = remember { mutableStateOf(Color.Yellow) }
    Box(modifier = Modifier
        .background(boxColor.value)
        .clickable {

            boxColor.value = colors.random()

        })
}


@Composable
@Preview
fun ColorBoxPreview() {

    ColorBox()

}