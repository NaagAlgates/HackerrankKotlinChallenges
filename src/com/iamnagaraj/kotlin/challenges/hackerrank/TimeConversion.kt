package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val time = readLine()!!
    val values = time.removeSuffix("PM").removeSuffix("AM").split(":").map { it.toInt() }
    print(
        if (time.endsWith("PM"))
            formatTime(
                listOf(
                    if (values[0] < 12) values[0] + 12 else values[0],
                    values[1],
                    values[2]
                )
            )
        else
            formatTime(
                listOf(
                    if (values[0] < 12) values[0] else 0,
                    values[1],
                    values[2]
                )
            )
    )
}

fun formatTime(data: List<Int>) = data.joinToString(":") { "%02d".format(it) }