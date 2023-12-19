package com.example.box2box.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.box2box.data.models.Day

@Composable
fun ComponentCircularStats(day: Day) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 10.dp, start = 10.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ComponentCircular(day.totalProtDay(), 150f, "Proteínas")
        ComponentCircular(day.totalCarbsDay(), 192f, "Carbs")
        ComponentCircular(day.totalFatDay(), 62f, "Grasas")
    }
}