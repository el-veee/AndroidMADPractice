package com.lachlanvass.androidinterviewpractice.presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScrollingList() {

    val scrollState = rememberScrollState() // Use with Column, LazyColumn scrolling by
    // default
    LazyColumn() {

        items(5000) {
            Text(
                text = "$it",
                fontSize = it.sp,
                fontWeight = setOf(
                    FontWeight.Bold,
                    FontWeight.Light,
                    FontWeight.Normal,
                    FontWeight.Thin
                ).random(),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)

            )
        }
    }
}