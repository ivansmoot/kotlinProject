package delegate

import kotlin.reflect.KProperty

// 委托属性

class MyDelegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String = "$thisRef," +
            "your delegated property name is ${property.name}"

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) = println("$thisRef," +
            "new value is $value")
}

class MyPropertyClass {
    var str :String by MyDelegate()
}

fun main() {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello"
    println(myPropertyClass.str)
}