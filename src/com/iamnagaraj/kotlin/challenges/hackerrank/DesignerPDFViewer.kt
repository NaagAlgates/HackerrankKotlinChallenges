package com.iamnagaraj.kotlin.challenges.hackerrank

fun main(args: Array<String>) {
    val values = readLine()!!.split(" ").map { it.toInt() }
    val text = readLine()!!
    println("${text.length * values[text.map { it.toInt()-97 }.maxBy{ values[it] }!!]}")
}