package com.example.box2box.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box2box.data.models.Day
import com.example.box2box.ui.theme.MainStyle


@Composable
fun ComponentLinearStats(day: Day) {
    LinearProgressIndicator(
        0.8f,
        color = MaterialTheme.colorScheme.background,
        trackColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, end = 40.dp, start = 40.dp)
    )
    Text(
        text = "${day.totalKcalDay()} / 2400 kcal",
        modifier = Modifier.padding(10.dp),
        color = MaterialTheme.colorScheme.surface,
        fontFamily = MainStyle,
        fontSize = 25.sp
    )
}
