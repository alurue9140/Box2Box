package com.example.box2box.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import com.example.box2box.ui.components.ComponentLogo
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.box2box.ui.components.ComponentLoginButton
import com.example.box2box.ui.components.ComponentUserPassword
import com.example.box2box.ui.viewmodels.LoginViewModel


@Composable
fun Login(loginViewModel: LoginViewModel, navController: NavHostController) {

    val user by loginViewModel.user.observeAsState("")
    val password by loginViewModel.password.observeAsState("")
    val passwordVisible by loginViewModel.passwordVisible.observeAsState(false)

    val userValid = loginViewModel.isEmailValid()
    val passwordValid = loginViewModel.isPasswordValid()
    val loginEnabled = true/*userValid && passwordValid*/

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        ComponentLogo()

        ComponentUserPassword(user, loginViewModel, password, passwordVisible)

        ComponentLoginButton(loginEnabled, navController)

    }
}



