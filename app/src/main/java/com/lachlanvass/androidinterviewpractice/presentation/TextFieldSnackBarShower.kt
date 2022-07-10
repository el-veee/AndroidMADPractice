package com.lachlanvass.androidinterviewpractice.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Composable
fun TextFieldSnackBarShower() {

    val scaffoldState = rememberScaffoldState()

    var textFieldState by remember {
        mutableStateOf("") // directly represents the value. Not the mutableState object
    }

    var scope = rememberCoroutineScope()

    Surface {

        Scaffold(
            modifier = Modifier.fillMaxSize(),
            scaffoldState = scaffoldState
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp)
            ) {

                TextField(
                    value = textFieldState,
                    label = {
                        Text(
                            "Enter Text"
                        )
                    },
                    onValueChange = {
                        textFieldState = it
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = {

                    scope.launch {

                        scaffoldState.snackbarHostState.showSnackbar(
                            "Hello $textFieldState",
                            duration = SnackbarDuration.Long
                        )
                    }
                }) {
                    Text(text = "Please Greet me")
                }
            }
        }
    }
}

@Composable
@Preview
fun TextFieldSnackBarShowerPreview() {

    TextFieldSnackBarShowerPreview()
}