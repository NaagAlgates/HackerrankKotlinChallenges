package com.iamnagaraj.kotlin.challenges.hackerrank

import java.util.*

fun main() {
    val (n,k,q) = readLine()!!.split(" ").map { it.toInt() }
    val arrayContents= readLine()!!.split(" ").map { it.toInt() }
    Collections.rotate(arrayContents,k)
    repeat(q){
        println(arrayContents[readLine()!!.toInt()])
    }
}