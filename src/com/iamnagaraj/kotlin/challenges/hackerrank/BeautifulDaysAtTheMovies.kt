package com.iamnagaraj.kotlin.challenges.hackerrank

import kotlin.math.abs

fun main() {
    val(i,j,k) = readLine()!!.split(" ").map { it.toInt() }
    var count=0
    (i..j).forEach {
        if( abs(it - getReversed(it))%k==0)
            count++
    }
    println("$count")
}

private fun getReversed(num:Int): Int {
    var reversed =0
    var currentValue= if(num%10==0) num/10 else num
    while (currentValue!=0){
            val digit = currentValue % 10
            reversed = reversed * 10 + digit
            currentValue /= 10
    }
    return reversed
}