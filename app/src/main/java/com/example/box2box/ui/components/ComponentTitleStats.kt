package com.example.box2box.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box2box.ui.theme.MainStyle

@Composable
fun ComponentTitleStats() {
    Text(
        text = "RESUMEN DIARIO",
        color = MaterialTheme.colorScheme.surface,
        fontSize = 30.sp,
        modifier = Modifier.padding(10.dp),
        fontFamily = MainStyle
    )
}
