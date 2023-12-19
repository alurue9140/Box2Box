package com.example.box2box.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box2box.ui.theme.MainStyle

@Composable
fun ComponentCircular(progress : Float, limit : Float, text : String) {

    Box(modifier = Modifier
            .size(113.dp)
            .padding(4.dp)
    ) {
        CircularProgressIndicator(
            progress/limit,
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier
                .fillMaxSize(),
            strokeWidth = 5.dp
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = text,
                color = Color.White,
                fontFamily = MainStyle,
                fontSize = 15.sp
            )
            Text(
                text = "$progress/$limit",
                color = Color.White,
                fontFamily = MainStyle,
                fontSize = 15.sp
            )
        }
    }

}