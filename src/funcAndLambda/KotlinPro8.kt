package funcAndLambda

// 带接收者的函数字面值，可以通过指定的接收者对象来调用一个函数字面值
// 在函数字面值内部，可以调用接收者对象的方法而无需使用任何额外的修饰符
// 类似扩展函数

fun Int.subtract2(otherInt: Int): Int{
    return this - otherInt
}

val isThisStringEqualsInt: String.(Int) -> Boolean = { param -> this.toIntOrNull() == param }

fun main() {
    // subtract是Int的一个扩展函数，接收一个Int类型的变量，返回一个Int结果
    val subtract: Int.(other: Int) -> Int = { other -> this - other }
    // 用匿名函数的形式
    val sum = fun Int.(other: Int): Int = this + other
    val a = 3
    println(a.subtract(2))

    val b = 5
    println(b.subtract2(7))

    println(8.sum(9))

    println("267".isThisStringEqualsInt(267))
}
