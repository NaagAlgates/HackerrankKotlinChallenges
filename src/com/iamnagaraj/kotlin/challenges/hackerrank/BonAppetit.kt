package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var temp=0
    bill.forEachIndexed { index, value ->
        if(index != k)  temp += value
    }
    if((temp/2) == b) println("Bon Appetit") else println(b-(temp/2))
}