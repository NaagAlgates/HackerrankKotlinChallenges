package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val n = readLine()!!.toInt()
    var peopleCount = 5
    var cumulative = Math.floorDiv(peopleCount,2)
    repeat((1 until n).count()) {
        peopleCount = ( Math.floorDiv(peopleCount,2))*3
        cumulative +=  Math.floorDiv(peopleCount,2)
    }
    println(cumulative)
}