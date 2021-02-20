package delegate

import kotlin.properties.Delegates

// 可观测属性
class Person {
    // 初始值
    // 在属性被赋值之后回调
    var age: Int by Delegates.observable(20) {
        property, oldValue, newValue ->
        println("${property.name}, $oldValue, $newValue")
    }

    var name: String by Delegates.vetoable("ivan") {
            _, _, newValue ->
        newValue.startsWith("i")
    }
}

fun main() {
    var person = Person()
    println(person.age)
    println("------")
    person.age = 30
    println(person.age)
    println("------")
    println(person.name)
    // 赋值非i开头，被拒绝
    person.name = "xiaowang"
    println(person.name)
    person.name = "iii"
    println(person.name)
}