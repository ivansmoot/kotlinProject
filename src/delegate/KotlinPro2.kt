package delegate

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

// 委托属性

class MyDelegate {
    // thisRef必须是属性所有者的类或其超类型
    operator fun getValue(thisRef: MyPropertyClass, property: KProperty<*>): String = "$thisRef," +
            "your delegated property name is ${property.name}"

    operator fun setValue(thisRef: MyPropertyClass, property: KProperty<*>, value: String) = println("$thisRef," +
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