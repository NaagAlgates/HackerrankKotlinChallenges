package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    var inputList = readLine()!!.split(" ").map { it.toInt() }
    println("%.6f".format(inputList.count { it>0 }.toDouble()/inputList.size))
    println("%.6f".format(inputList.count { it<0 }.toDouble()/inputList.size))
    println("%.6f".format(inputList.count { it==0 }.toDouble()/inputList.size))
}