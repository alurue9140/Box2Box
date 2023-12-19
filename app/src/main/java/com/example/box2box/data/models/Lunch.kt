package com.example.box2box.data.models

import kotlin.math.roundToInt

class Lunch(

    var name: String = "",
    var aliments : MutableList<Aliment> = mutableListOf(),

) {

    fun totalKcal() : Float{

        var tKcal = 0f

        aliments.forEach {
            tKcal += it.kcal
        }

        return tKcal.roundToInt().toFloat()
    }

    fun totalProt() : Float{

        var tProte = 0f

        aliments.forEach {
            tProte += it.prote
        }

        return tProte.roundToInt().toFloat()
    }

    fun totalCarbs() : Float{

        var tCarbs = 0f

        aliments.forEach {
            tCarbs += it.carbs
        }

        return tCarbs.roundToInt().toFloat()
    }

    fun totalFat() : Float{

        var tFat = 0f

        aliments.forEach {
            tFat += it.fat
        }

        return tFat.roundToInt().toFloat()
    }
}