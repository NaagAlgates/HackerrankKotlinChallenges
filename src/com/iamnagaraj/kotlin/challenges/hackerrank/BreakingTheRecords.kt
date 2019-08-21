package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    var scores = readLine()!!.split(" ").map { it.toInt() }
    var minValue = scores.first()
    var maxValue = minValue
    var minCount = 0
    var maxCount = 0

    scores.forEach{
        if(it < minValue){
            minValue = it
            minCount++
        }else if(it > maxValue){
            maxValue = it
            maxCount++
        }
    }
    println("$maxCount $minCount")
}