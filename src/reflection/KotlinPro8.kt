package reflection

import kotlin.reflect.full.functions
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.superclasses

interface Interface1{}

class KotlinPro8(val name: String, private val age: Int): Interface1{
    fun func1(){}
    fun func2(num: Int): Int{return num + this.age}
}

fun main() {
    val kt8 = KotlinPro8::class
    println(kt8.members)
    println(kt8.superclasses)
    println(kt8.memberFunctions)
    println("----------")

    val kot8 = KotlinPro8("ivan", 18)
    val funcToInvoke = kt8.functions.find { it.name == "func2" }
    val age2 = funcToInvoke?.call(kot8, 2)
    println(age2)
}