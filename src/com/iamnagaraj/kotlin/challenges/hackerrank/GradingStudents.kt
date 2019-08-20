package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val originalGrades = readLine()!!.split(" ").map { it.toInt() }
    originalGrades.forEach{
        if(it>37 && ((it+2)%5==0)) println(it+2)
        else if(it>37 && ((it+1)%5==0)) println(it+1)
        else println(it)
    }
}