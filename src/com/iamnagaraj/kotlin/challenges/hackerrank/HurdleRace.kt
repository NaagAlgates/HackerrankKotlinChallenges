package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val (_,k) = readLine()!!.split(" ").map { it.toInt() }
    val result = readLine()!!.split(" ").map { it.toInt() }.max()?.minus(k)
    println(if(result!!<0) 0 else result)
}