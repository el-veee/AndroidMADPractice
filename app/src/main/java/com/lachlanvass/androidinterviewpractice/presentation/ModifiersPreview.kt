package com.lachlanvass.androidinterviewpractice.presentation

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun ModifiersPreview() {

    val strings = setOf("This", "is", "a", "set", "of", "strings")
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        Column(
            modifier = Modifier
                .padding(60.dp)
                .requiredWidth(100.dp)
                .background(Color.Green),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            Text("HelloWorld", Modifier.offset(50.dp))
            Text("HelloWorld", Modifier.offset(-100.dp, 40.dp) )
            Text("HelloWorld", modifier = Modifier.border(BorderStroke(3.dp, Color.Black)))

//            strings.forEach { it ->
//                Text(it, modifier = Modifier.clickable {
//                    println(it)
//                })
//            }
        }

    }


}