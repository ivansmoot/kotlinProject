package reflection


//拓展属性

val String.firstChar: Char
    get() = this[0]

fun main() {
    val a = "foo"
    println(a.firstChar)
    println(String::firstChar.get(a))
}