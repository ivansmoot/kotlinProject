import kotlin.test.assertTrue

fun copy(from: Array<out Any>, to: Array<Any>) {
    assertTrue {to.size == from.size}
    for(i in from.indices){
        to[i] = from[i]
    }
}

fun main() {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array(4) { "hello" }
    for(i in to.indices){
        println(to[i])
    }
    println("-----------------")
    copy(from, to)
    for(i in to.indices){
        println(to[i])
    }
}