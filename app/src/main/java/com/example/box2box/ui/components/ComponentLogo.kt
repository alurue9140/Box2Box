package com.example.box2box.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.box2box.R

@Composable
fun ComponentLogo() {
    Image(
        painter = painterResource(id = R.drawable.logoteaw),
        contentDescription = "",
        modifier = Modifier.padding(bottom = 30.dp)
    )
}
