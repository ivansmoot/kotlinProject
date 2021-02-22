package funcAndLambda

fun <T> convert2list(vararg elements :T): List<T>{
    val result = ArrayList<T>()
    elements.forEach { result.add(it) }
    return result
}

fun main() {
    val getList = convert2list("hello", "world")
    println(getList)
}