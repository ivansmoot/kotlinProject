package funcAndLambda

fun test(a: Int = 0, b: Int = 1) = println(a - b)

fun test2(a: Int = 1, b: Int = 2, compute: (x: Int, y: Int) -> Unit) {
    compute(a, b)
}

fun main() {
    test2(9, 4, ::test)
    test2(7, 8) { a, b -> println(a - b) }
    test2(b = 5) {
        c, b -> println(c - b)
    }
}