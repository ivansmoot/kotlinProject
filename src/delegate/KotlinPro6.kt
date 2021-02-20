package delegate

import java.util.*

/*
    map委托
    将属性存放在map中
 */

class Student(map: Map<String, Any?>){
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

class Student2(mutableMap: MutableMap<String, Any?>) {
    var address: String by mutableMap
}

fun main() {
    // key要和上面的名称保持一致
    val student = Student(mapOf(
        "name" to "ivan",
        "address" to "sh",
        "age" to 23,
        "birthday" to Date()
    ))
    println(student.address)
    // Map只读，无法写
    // student.name = "xiaowang"
    println("----------")
    val mutableMap: MutableMap<String, Any?> = mutableMapOf(
        "address" to "bj"
    )
    val student2 = Student2(mutableMap)
    println(mutableMap["address"])
    println(student2.address)
    student2.address = "sh"
    println(student2.address)
}