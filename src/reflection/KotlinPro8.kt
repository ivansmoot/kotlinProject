package reflection

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.superclasses

interface Interface1{}

class KotlinPro8(val name: String, val age: Int): Interface1{
    fun func1(){}
    fun func2(): Int{return 1}
}

fun main() {
    val kt8 = KotlinPro8::class
    println(kt8.members)
    println(kt8.superclasses)
    println(kt8.memberFunctions)
}