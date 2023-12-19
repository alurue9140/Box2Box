package com.example.box2box.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.box2box.ui.theme.MainStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComponentBar(name: String, navController: NavHostController) {
    TopAppBar(
        colors = TopAppBarDefaults.mediumTopAppBarColors(MaterialTheme.colorScheme.background),
        actions = { Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings", tint = MaterialTheme.colorScheme.surface, modifier = Modifier.padding(5.dp).clickable { navController.navigate("Settings") })},
        title = {
            Row (
                modifier = Modifier.clickable { navController.navigate("Activity")},
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(modifier = Modifier.padding(5.dp), imageVector = Icons.Filled.CalendarToday, contentDescription = "Calendar", tint = MaterialTheme.colorScheme.surface)
                Text(text = name, color = MaterialTheme.colorScheme.surface, fontFamily = MainStyle, fontSize = 24.sp)
            }
        }
    )
}