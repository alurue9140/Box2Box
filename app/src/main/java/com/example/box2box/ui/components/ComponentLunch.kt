package com.example.box2box.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box2box.data.models.Lunch
import com.example.box2box.ui.theme.MainStyle

@Composable
fun ComponentLunch(lunch : Lunch) {
    Column(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = lunch.name,
            color = MaterialTheme.colorScheme.surface,
            fontSize = 25.sp,
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, bottom = 5.dp),
            fontFamily = MainStyle
        )
        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "KCAL : ${lunch.totalKcal()}",
                color = MaterialTheme.colorScheme.surface,
                fontSize = 13.sp,
                modifier = Modifier.padding(5.dp),
                fontFamily = MainStyle
            )
            Text(
                text = "P : ${lunch.totalProt()}g",
                color = MaterialTheme.colorScheme.surface,
                fontSize = 13.sp,
                modifier = Modifier.padding(5.dp),
                fontFamily = MainStyle
            )
            Text(
                text = "C : ${lunch.totalCarbs()}g",
                color = MaterialTheme.colorScheme.surface,
                fontSize = 13.sp,
                modifier = Modifier.padding(5.dp),
                fontFamily = MainStyle
            )
            Text(
                text = "G : ${lunch.totalFat()}g",
                color = MaterialTheme.colorScheme.surface,
                fontSize = 13.sp,
                modifier = Modifier.padding(5.dp),
                fontFamily = MainStyle
            )
        }
        Divider(color = MaterialTheme.colorScheme.background, thickness = 2.dp)

        lunch.aliments.forEach {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painterResource(it.type.image), it.name, modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
                    .size(40.dp))

                Text(
                    text = it.name,
                    color = MaterialTheme.colorScheme.surface,
                    fontSize = 22.sp,
                    modifier = Modifier
                        .padding()
                        .weight(3f),
                    fontFamily = MainStyle
                )

                Column (
                    modifier = Modifier.padding(10.dp, end = 15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("${it.g} g", color = MaterialTheme.colorScheme.surface, fontFamily = MainStyle, fontSize = 15.sp)
                    Text("${it.kcal} kcal", color = MaterialTheme.colorScheme.surface, fontFamily = MainStyle, fontSize = 15.sp)
                }

            }

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f),
                contentColor = MaterialTheme.colorScheme.surface,
                containerColor = Color.Transparent
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(40.dp)
                )
            }
            Text(
                text = "INSERTAR ALIMENTO",
                color = MaterialTheme.colorScheme.surfaceTint,
                fontSize = 22.sp,
                modifier = Modifier
                    .padding()
                    .weight(3f),
                fontFamily = MainStyle
            )
        }
        Divider(color = MaterialTheme.colorScheme.background, thickness = 2.dp)


    }
}

