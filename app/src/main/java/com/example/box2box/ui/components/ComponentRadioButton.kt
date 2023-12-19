package com.example.box2box.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box2box.ui.theme.MainStyle

@Composable
fun ComponentRadioButton(title: String, list : List<String>) {

    var selectedOption by remember { mutableStateOf(list[0] ) }

    Column (
        modifier = Modifier.padding(20.dp).width(110.dp),
        verticalArrangement = Arrangement.Center,
    ) {

        Text(
            color = MaterialTheme.colorScheme.surface,
            text = title,
            fontFamily = MainStyle,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth() // Add this line
        )

        list.forEach {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (it == selectedOption),
                    onClick = { selectedOption = it }
                )
                Text(
                    color = MaterialTheme.colorScheme.surface,
                    text = it,
                    fontFamily = MainStyle,
                )
            }
        }




    }
}