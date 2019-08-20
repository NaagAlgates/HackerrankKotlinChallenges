package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }

    val compare  = a.mapIndexed{index,value->value.compareTo(b[index])}
    print(compare.count{it>0})
    print(" ")
    print(compare.count{it<0})
}
