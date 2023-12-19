package com.example.box2box

import Box2BoxTheme
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.box2box.ui.screens.Login
import com.example.box2box.ui.viewmodels.LoginViewModel
import com.example.box2box.ui.screens.Activity
import com.example.box2box.ui.screens.Settings
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box2BoxTheme {
                Scaffold(
                    modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.background)
                ) {
                    val systemUiController = rememberSystemUiController()

                    val navController = rememberNavController()

                    val loginViewModel = LoginViewModel()

                    NavHost(navController = navController, startDestination = "Login") {
                        composable("Login"){ Login(loginViewModel, navController) }
                        composable("Activity"){ Activity(navController) }
                        composable("Settings"){Settings(navController)}
                    }

                    systemUiController.setStatusBarColor(MaterialTheme.colorScheme.background)

                }
            }
        }
    }
}