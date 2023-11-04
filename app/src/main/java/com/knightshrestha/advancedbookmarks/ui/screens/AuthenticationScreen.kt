package com.knightshrestha.advancedbookmarks.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AuthenticationScreen() {
    var isSigningUp by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ) {
        Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Login")
            TextField(value = "", onValueChange = {}, label = { Text(text = "Username")})
            TextField(value = "", onValueChange = {}, label = { Text(text = "Password")})

            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Login")
            }
        }
    }

}