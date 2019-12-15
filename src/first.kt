import java.util.*

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var max = 0
    for (i in values) {
        val x = values.filter { it==i }.size
        println("Value of I - $i, Size: $x")
        val y = values.filter { it==i-1 } .size
        println("Value of I - ${i-1}, Size: $y")
        if (x+y>max) max = x+y
    }
    println(max)
}