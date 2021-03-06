package reflection

/*
    属性引用 '::'
 */

const val a = 3
var b = 4

fun main() {
    println(::a)
    println(::a.get())
    println(::a.name)

    ::b.set(10)
    println(b)
    println(::b.get())
}