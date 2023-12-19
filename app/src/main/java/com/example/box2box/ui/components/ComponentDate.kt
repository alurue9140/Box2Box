package com.example.box2box.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box2box.ui.theme.MainStyle

@Composable
fun ComponentDate() {
    Column(
        modifier = Modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            color = MaterialTheme.colorScheme.surface,
            text = "Fecha de Nacimiento",
            fontFamily = MainStyle,
            fontSize = 17.sp
        )
        MyDatePickerDialog()
    }
}


