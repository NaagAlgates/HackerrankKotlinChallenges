package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    readLine()!!
    val firstArray = readLine()!!.split(" ").map { it.toInt() }
    val secondArray = readLine()!!.split(" ").map { it.toInt() }

    //var result = mutableSetOf<Int>()
    var result = 0

    val min = firstArray.max()!!
    val max = secondArray.min()!!
    var temp:Boolean
    if (max > min) {
        for (i in min until max+1) {
            temp = false;
            for (j in 0 until firstArray.size) {
                if (i % firstArray[j] == 0) temp = true else {
                    temp = false
                    break
                }
            }
            if(temp) {
                for (k in 0 until secondArray.size) {
                    if (secondArray[k] % i == 0) temp = true else {
                        temp = false
                        break
                    }
                }
                if (temp) result++
            }
        }
    }
    /*result.forEachIndexed{index,value->
        print(value)
        if(index!=result.size-1) print(" ")
    }*/
    println(result)
}