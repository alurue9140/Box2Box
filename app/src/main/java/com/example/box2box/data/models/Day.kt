package com.example.box2box.data.models

import java.util.Date

class Day (
    var name: String = "",
    var date : Date = Date(),
    var lunchs : MutableList<Lunch> = mutableListOf(),
) {

    fun totalKcalDay() : Float{

        var totalKcal = 0f

        lunchs.forEach{ totalKcal+=it.totalKcal() }

        return totalKcal
    }

    fun totalProtDay() : Float{

        var totalProt = 0f

        lunchs.forEach{ totalProt+=it.totalProt() }

        return totalProt
    }

    fun totalCarbsDay() : Float{

        var totalCarbs = 0f

        lunchs.forEach{ totalCarbs+=it.totalCarbs() }

        return totalCarbs
    }

    fun totalFatDay() : Float{

        var totalFat = 0f

        lunchs.forEach{ totalFat+=it.totalFat() }

        return totalFat
    }

}