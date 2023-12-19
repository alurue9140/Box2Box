package com.example.box2box.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.box2box.ui.viewmodels.LoginViewModel

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ComponentUserPassword(
    user: String,
    loginViewModel: LoginViewModel,
    password: String,
    passwordVisible: Boolean
) {
    TextField(
        value = user,
        singleLine = true,
        onValueChange = { loginViewModel.setUser(it) },
        shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
        label = { Text(text = "User") }
    )

    TextField(
        value = password,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        modifier = Modifier.padding(top = 10.dp),
        onValueChange = { loginViewModel.setPassword(it) },
        shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
        label = { Text(text = "Password") },
        trailingIcon = {
            IconButton(onClick = { loginViewModel.setPasswordVisible(!passwordVisible) }) {
                Icon(
                    if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff, "")
            }
        }
    )
}
