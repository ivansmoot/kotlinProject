package reflection

/*
    函数引用 '::'
    函数组合
 */

fun <A, B, C> myCompose(f: (A) -> B, g: (B) -> C): (A) -> C {
    return { x -> g(f(x)) }
}

fun length(s: String) = s.length

fun isEven(x: Int) = 0 == x % 2

fun main() {
    val isLengthEven = myCompose(::length, ::isEven)
    val strings = listOf("a", "ab", "abc", "abcd")
    println(strings.filter(isLengthEven))
}