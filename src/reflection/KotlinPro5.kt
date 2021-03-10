package reflection


// 构造方法引用

class B(val x: Int)


// 参数是一个函数，接受一个Int,返回一个B,和B的构造方法一致
fun myMethod(factory: (x: Int) -> B){
    val b = factory(3)
    println(b.x)
}

fun main() {
    // 对B的构造方法引用
    myMethod(::B)
}