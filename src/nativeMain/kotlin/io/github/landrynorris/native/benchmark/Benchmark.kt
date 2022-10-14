package io.github.landrynorris.native.benchmark

import kotlinx.benchmark.Benchmark
import kotlinx.benchmark.Scope
import kotlinx.benchmark.State

@Suppress("unused")
@State(Scope.Benchmark)
class Benchmark {

    @Benchmark
    fun benchmarkEmptyMethod() = Unit
}

@Suppress("unused")
@State(Scope.Benchmark)
class Fibonacci {
    @Benchmark
    fun benchmarkFibonacci() = benchmarkFibonacci40()

    @Benchmark
    fun benchmarkFibonacciC() = benchmarkCFibonacci40()
}

@Suppress("unused")
@State(Scope.Benchmark)
class LambdaNullNotNull {
    @Benchmark
    fun benchmarkNullableLambdaWithNull() = nullableLambdaWithNull()

    @Benchmark
    fun benchmarkNullableLambdaWithNotNull() = nullableLambdaWithNotNull()

    @Benchmark
    fun benchmarkNotNullableLambdaWithEmpty() = notNullableLambdaWithEmpty()

    @Benchmark
    fun benchmarkNotNullableLambdaWithNotNull() = notNullableLambdaWithNotNull()
}

@Suppress("unused")
@State(Scope.Benchmark)
class ReturnConstant {
    @Benchmark
    fun benchmarkReturnConstant1Time() = returnConstantOnce()

    @Benchmark
    fun benchmarkReturnConstantC1Time() = returnConstantC()

    @Benchmark
    fun benchmarkReturnConstant10Times() = returnConstant10Times()

    @Benchmark
    fun benchmarkReturnConstantC10Times() = returnConstantC10Times()
}

@Suppress("unused")
@State(Scope.Benchmark)
class CallMethods {
    @Benchmark
    fun benchmarkInstanceMethod(): Int = InstanceMethod().multiply10(100)

    @Benchmark
    fun benchmarkExtensionMethod(): Int = InstanceMethod().extensionMultiply10(100)

    @Benchmark
    fun benchmarkObjectMethod(): Int = ObjectMethod.multiply10(100)
}
