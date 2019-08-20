package com.iamnagaraj.kotlin.challenges.hackerrank

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val firstVal = sc.nextInt()
    val secondVal = sc.nextInt()
    val sum = add(firstVal, secondVal)
    print(sum)
}

fun add(a:Int,b:Int) = a+b