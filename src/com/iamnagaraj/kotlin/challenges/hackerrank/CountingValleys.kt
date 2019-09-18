package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    readLine()!!
    var stepsCount = 0
    var valleyCount =0
    readLine()!!.forEach {
        if(it == 'D') {
            if(stepsCount < 0) valleyCount--
            stepsCount --
        } else {
            if(stepsCount < 0) valleyCount ++
            stepsCount++
        }
    }
    println(valleyCount)
}
