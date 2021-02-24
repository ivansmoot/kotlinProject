package funcAndLambda


fun main() {
    // 匿名函数
    // 这样可以，但没必要，因为没法用
//    fun(x: Int, y: Int) = x + y
    val strings = arrayOf("hello", "wor", "kubernetes")
    strings.filter { it.length > 3 }.forEach{ println(it) }

    // 一般是把匿名函数放在lambda表达式里
    strings.filter (fun(str) = str.length > 3).forEach { println(it) }

    // 闭包：lambda和匿名函数可访问外层
    var sum = ""
    strings.filter { it.length > 3 }.forEach {
        sum += it
    }
    println(sum)
}



