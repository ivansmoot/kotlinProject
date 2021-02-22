package funcAndLambda

// 可变参数
fun test(vararg str:String){
    println(str::class.java)
    str.forEach { println(it) }
}

fun main() {
    test("hello", "hello2")
    // *是分散运算符，这里不允许直接传入一个list，必须分散开
    test(*arrayOf("hello3", "hello4"))
}