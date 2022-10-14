package io.github.landrynorris.native.benchmark

import fibonacci.fibonacciC

fun benchmarkFibonacci40(): Int {
    return fibonacci(40)
}

fun benchmarkCFibonacci40(): Int {
    return fibonacciC(40)
}

fun fibonacci(x: Int): Int = if(x == 0 || x == 1) 1 else fibonacci(x-1) + fibonacci(x-2)

