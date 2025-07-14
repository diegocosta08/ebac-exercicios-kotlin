package com.example.exercicios

enum class DayOfWeek(val day: String) {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")
}

object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(day: DayOfWeek) {
        currentDay = day
    }

    fun isWeekend(): Boolean {
        return currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY
    }
}

fun main() {
    println("É fim de semana? ${UtilityHelper.isWeekend()}")

    UtilityHelper.setCurrentDay(DayOfWeek.TUESDAY)

    println("É fim de semana? ${UtilityHelper.isWeekend()}")
}