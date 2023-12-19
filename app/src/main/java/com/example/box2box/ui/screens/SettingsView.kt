package com.example.box2box.ui.screens

import android.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.box2box.ui.components.ComponentBar
import com.example.box2box.ui.components.ComponentDate
import com.example.box2box.ui.components.ComponentRadioButton
import com.example.box2box.ui.components.MyDatePickerDialog
import com.example.box2box.ui.theme.MainStyle
import java.text.SimpleDateFormat
import java.util.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Settings(navController: NavHostController) {

    val sex = listOf("Hombre", "Mujer", "Otro")
    val cardio = listOf("1-3", "4-5", "6-+")

    Scaffold (modifier = Modifier.fillMaxSize(), topBar = { ComponentBar("MIERCOLES 13", navController) }, containerColor = MaterialTheme.colorScheme.tertiary) {
        Column (modifier = Modifier.padding(top = it.calculateTopPadding()), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                ComponentRadioButton("Sexo",sex)

                ComponentRadioButton("Cardio",cardio)
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                ComponentDate()
            }

            /*

            var pickerValue by remember { mutableStateOf(0) }

            NumberPicker(
                value = pickerValue,
                range = 0..10,
                onValueChange = {
                    pickerValue = it
                }
            )

             */

        }
    }
}


