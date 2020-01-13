package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val t = readLine()!!.toInt()
    repeat(t){
        val n = readLine()!!.toInt()
        var value = n
        var count =0
        while (value!=0) {
            val divisor = value%10
            value /= if(divisor!=0) {
                if ((n % divisor) == 0) count++
                10
            }else 10
        }
        println(count)
    }
}