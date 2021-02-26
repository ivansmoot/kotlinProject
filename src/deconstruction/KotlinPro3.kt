package deconstruction

import java.lang.NumberFormatException

// 异常

fun main() {
    val a = "a"
    val result = try {
        a.toInt()
    } catch (ex: NumberFormatException) {
        ex
    } finally {
        println("final")
    }
    println(result)

    val str1: String? = null
    val str2 = str1?: throw IllegalArgumentException("str1 must not null")
    println(str2)
}
