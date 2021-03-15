package reflection

import kotlin.reflect.KClass

fun main() {
    val kotlinLang = "kotlin"
    val kClass1: KClass<out String> = kotlinLang::class
    val kClass2: KClass<out String> = "java"::class
    println(kClass1)

    if (kClass1 == kClass2) {
        println("kClass1 == kClass2")
    } else {
        println("kClass1 != kC")
    }
}