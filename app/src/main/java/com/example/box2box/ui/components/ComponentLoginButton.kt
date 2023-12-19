package com.example.box2box.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ComponentLoginButton(loginEnabled: Boolean, navController: NavHostController) {
    Button(onClick = {navController.navigate("Activity")}, enabled = loginEnabled, modifier = Modifier.padding(top = 10.dp)) {
        Text(text = "Login")
    }
}
