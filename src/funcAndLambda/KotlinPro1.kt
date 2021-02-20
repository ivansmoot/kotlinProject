package funcAndLambda

// 函数的默认参数
fun sum(a: Int = 10, b: Int = 20) = println(a + b)

open class A {
    open fun method(a: Int, b: Int = 4) = a + b
}

class B: A() {
    // 子类重写父类的方法，不能显式声明默认值，但是是有的
    override fun method(a: Int, b: Int) = a - b
}

fun main() {
    sum()
    sum(1)
    sum(1,2)
    sum(b = 3)
    println("----------")
    val b = B()
    val c = b.method(1)
    println(c)
}