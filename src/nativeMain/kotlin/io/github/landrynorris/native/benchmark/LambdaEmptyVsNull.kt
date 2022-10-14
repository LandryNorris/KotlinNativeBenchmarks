package io.github.landrynorris.native.benchmark

fun nullableLambdaWithNull() {
    doSomethingNullable10Times(null)
}

fun nullableLambdaWithNotNull(): Int {
    var i = 0
    doSomethingNullable10Times { i++ }
    return i
}

fun notNullableLambdaWithEmpty() {
    doSomething10Times {}
}

fun notNullableLambdaWithNotNull(): Int {
    var i = 0
    doSomething10Times { i++ }
    return i
}

private fun doSomethingNullable10Times(block: (() -> Unit)?) {
    repeat(10) { block?.invoke() }
}

private fun doSomething10Times(block: () -> Unit) {
    repeat(10) { block() }
}
