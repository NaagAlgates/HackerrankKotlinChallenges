package com.iamnagaraj.kotlin.challenges.hackerrank

import kotlin.math.abs


fun main() {
    val (rd,rm,ry) = readLine()!!.split(" ").map { it.toInt() }
    val (dd,dm,dy) = readLine()!!.split(" ").map { it.toInt() }
    val yearDiff = dy-ry
    val monthDiff = dm-rm
    val dateDiff = dd-rd
    if(yearDiff<0) println(10000*abs(yearDiff))
    else if (monthDiff < 0 && yearDiff<0) println(500*abs(monthDiff))
    else if (monthDiff == 0 && dateDiff < 0&& yearDiff<0) println(15*abs(dateDiff))
    else println(0)
}