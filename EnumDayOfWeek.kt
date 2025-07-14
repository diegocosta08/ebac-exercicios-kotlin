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

fun main() {
    DayOfWeek.values().forEach {
        println("${it.name} = ${it.day}")
    }
}