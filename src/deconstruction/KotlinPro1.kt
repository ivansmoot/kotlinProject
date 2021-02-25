package deconstruction

// 解构声明
data class MyResult(val result: String, val status: Int)

fun MyMethod(): MyResult {
    return MyResult("Success", 1)
}

// Pair可以返回两个值
fun MyMethod2(): Pair<String, Int>{
    return Pair("Fail", -1)
}

fun main() {
    // 不需要这样提取属性
//    val myResult = MyMethod()
//    myResult.result
//    myResult.status
    // 解构赋值
    val (result, status) = MyMethod()

    // 中缀表达式形式
    val map = mapOf("a" to "aa", "b" to "bb", "c" to "cc")
    for((k, v) in map){
        println("$k, $v")
    }
}
