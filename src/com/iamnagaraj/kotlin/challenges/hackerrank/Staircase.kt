package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val size = readLine()!!.toInt()
    (1..size).forEach{
        println(" ".repeat(size-it)+"#".repeat(it))
    }
}