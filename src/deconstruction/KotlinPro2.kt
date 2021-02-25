package deconstruction

// 可变/不可变集合

fun main() {
    // 可变
    val stringList = mutableListOf("hello", "world", "hello world")
    // 显式声明是List<String>，不可变
    // 可变集合的只读视图
    val readOnlyView: List<String> = stringList
    println(stringList)
    stringList.add("what")
    println(readOnlyView)
    // 只读，无add方法
    // readOnlyView.add
}