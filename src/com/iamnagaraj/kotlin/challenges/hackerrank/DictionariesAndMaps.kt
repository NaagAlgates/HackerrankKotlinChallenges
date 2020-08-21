package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val phoneBook = mutableMapOf<Any,Any>()
    val totalEntries = readLine()!!.toInt()
    repeat(totalEntries) {
        val (key, value) = readLine()!!.split(" ")
        phoneBook[key] = value
    }
    repeat(totalEntries) {
        val searchString = readLine()!!
        if(phoneBook.containsKey(searchString))
            println("$searchString=${phoneBook[searchString]}")
        else
            println("Not found")
    }
}