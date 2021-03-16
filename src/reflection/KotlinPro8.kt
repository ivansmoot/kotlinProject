package reflection

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.functions
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.superclasses

interface Interface1{}

class KotlinPro8(val name: String, private val age: Int): Interface1{
    fun func(num: Int): Int{return num + this.age}
    var add = "sh"
}

fun main() {
    val kt8 = KotlinPro8::class
    println(kt8.members)
    println(kt8.superclasses)
    println(kt8.memberFunctions)
    println("----------")


    val kot8 = KotlinPro8("ivan", 18)

    // 调用类方法
    val funcToInvoke = kt8.functions.find { it.name == "func" }
    val age2 = funcToInvoke?.call(kot8, 2)
    println(age2)

    // 获取类属性
    val address = kt8.members.find { it.name == "add" }
    val address2 = kt8.memberProperties.find { it.name == "add" }
    println(address?.call(kot8))
    println(address2?.call(kot8))

    // 修改类属性
    if (address2 is KMutableProperty<*>) {
        address2.setter.call(kot8, "sh2")
        println(address2?.call(kot8))
    }
}