package com.example.box2box.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.box2box.data.models.Day


@Composable
fun ComponentStats(day: Day) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        ComponentTitleStats()

        ComponentCircularStats(day)

        ComponentLinearStats(day)

    }
}


