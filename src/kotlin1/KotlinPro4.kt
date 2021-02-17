package kotlin1

// 嵌套类:对应Java的静态内部类

class OuterClass {
    private val str = "hello world"

    class NestedClass {
        fun nestedMethod() = "welcome"
    }
}

// 内部类:对应Java的非静态内部类

class OuterClass2 {
    private val str = "hello world2"

    inner class InnerClass {
//        fun innerMethod() = str
        fun innerMethod() = this@OuterClass2.str
    }
}

fun main() {
    // 嵌套类
    println(OuterClass.NestedClass().nestedMethod())

    val str2 = OuterClass2().InnerClass().innerMethod()
    println(str2)
}