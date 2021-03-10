package reflection

fun main() {
    val stringList = listOf("a", "ab", "abc")
    println(stringList.map ( String::length ))
    println(stringList.map { length(it) })

    val x = MyClass::x
    println(x.get(MyClass(10)))
}

class MyClass(val x: Int)