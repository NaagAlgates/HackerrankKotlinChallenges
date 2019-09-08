package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val k = readLine()!!.split(" ").last().toInt()
    val mealCost = readLine()!!.split(" ").map { it.toInt() }
    val charged = readLine()!!.toInt()

    val actual = mealCost.filterIndexed { index, i ->
        index!=k
    }.sum()/2
    println(if(charged == actual) "Bon Appetit" else charged-actual)
}