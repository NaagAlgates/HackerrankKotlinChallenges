package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }
    //println(values.groupingBy { it }.eachCount().map { it.value }.max())
    val grouping = values.groupingBy { it }
    println(values.size - grouping.eachCount().map { it.value }.max()!!)
}