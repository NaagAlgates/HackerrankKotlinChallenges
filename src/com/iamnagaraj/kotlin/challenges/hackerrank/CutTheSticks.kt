package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    readLine()!!
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    repeat(arr.size){
        arr.filter { it>0 }.min()?.let {min->
            println(arr.filterIndexed { index,value->
                (value-min>=0).also { arr[index] = value-min }
            }.count())
        }
    }
}