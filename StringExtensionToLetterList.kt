package com.example.exercicios

fun String.toLetterList(): List<String> {
    return this.map { it.toString() }
}

fun main() {
    val palavra = "Diego"
    val letras = palavra.toLetterList()
    letras.forEach { println(it) }
}