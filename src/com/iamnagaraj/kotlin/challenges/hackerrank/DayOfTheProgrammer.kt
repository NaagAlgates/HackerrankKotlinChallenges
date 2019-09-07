package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    when(val year = readLine()!!.toInt()){
        in 1700..1917-> println("${256-(if(year % 4==0) 244 else 243)}.09.$year")
        1918-> println("${(256-243)}.09.$year")
        else->println("${256- if((year % 4 == 0) && (year %100!=0) || (year %400 ==0)) 244 else 243}.09.$year")
    }
}