package com.lachlanvass.androidinterviewpractice.presentation

import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.lachlanvass.androidinterviewpractice.R

@Composable
fun TextStyling(content: String) {

    val fontFamily = FontFamily(
        Font(R.font.roboto_bold, FontWeight.Bold)
    )


    Text(
        text = buildAnnotatedString {

            withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {

                append("Hello")

            }

            withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) {

                append("World")

            }
        },
        color = Color.Red,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        textDecoration = TextDecoration.LineThrough,
        modifier = Modifier
            .background(Color(0xFF7381FF))
    )
}

@Composable
@Preview
fun TextStylingPreview() {

    TextStyling("Default")

}