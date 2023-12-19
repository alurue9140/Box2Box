package com.example.box2box.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.box2box.data.models.Aliment
import com.example.box2box.data.models.AlimentType
import com.example.box2box.data.models.Day
import com.example.box2box.data.models.Lunch
import com.example.box2box.ui.components.ComponentBar
import com.example.box2box.ui.components.ComponentLunch
import com.example.box2box.ui.components.ComponentStats
import java.util.Calendar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Activity(navController: NavHostController) {

    var aliments1 = mutableListOf(Aliment("Yogur", 100f, 52f, 10f, 3f, 1f, AlimentType.LACTEOS), Aliment("Muesli", 100f,401f, 9f, 52f, 12f, AlimentType.CEREALES))

    var aliments2 = mutableListOf(Aliment("Pollo", 100f, 195f, 29.55f, 0f, 7.72f, AlimentType.CARNE_BLANCA), Aliment("Arroz", 100f,351f, 7.3f, 77f, 1.3f, AlimentType.CEREALES))

    var aliments3 = mutableListOf(Aliment("Merluza", 100f, 89f, 16f, 0f, 3f, AlimentType.PESCADOS_MARISCOS), Aliment("Muesli", 100f,87f, 2f, 20f, 0f, AlimentType.OTROS))

    var lunchs = mutableListOf(Lunch("DESAYUNO", aliments1),Lunch("COMIDA", aliments2),Lunch("CENA", aliments3))

    var day = Day("MIERCOLES 13", Calendar.getInstance().time, lunchs)

    Scaffold (modifier = Modifier.fillMaxSize(), topBar = { ComponentBar(day.name, navController) }, containerColor = MaterialTheme.colorScheme.tertiary) {
        Column (modifier = Modifier.padding(top = it.calculateTopPadding()), horizontalAlignment = Alignment.CenterHorizontally) {

            ComponentStats(day)

            Column (modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())) {

                lunchs.forEach {
                    ComponentLunch(it)
                }

            }


        }
    }
}


