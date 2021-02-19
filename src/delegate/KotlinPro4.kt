package delegate

import kotlin.properties.Delegates

// 非空属性
class MyPerson {
    var address: String by Delegates.notNull()
}

fun main() {
    var myPerson = MyPerson()
    myPerson.address = "sh"
    println(myPerson.address)
}