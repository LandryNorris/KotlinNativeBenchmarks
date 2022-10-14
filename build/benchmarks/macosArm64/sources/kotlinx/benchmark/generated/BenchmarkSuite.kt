package kotlinx.benchmark.generated

import kotlin.Array
import kotlin.String
import kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark.Benchmark_Descriptor
import kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark.CallMethods_Descriptor
import kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark.Fibonacci_Descriptor
import kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark.LambdaNullNotNull_Descriptor
import kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark.ReturnConstant_Descriptor
import kotlinx.benchmark.native.NativeExecutor

fun main(args: Array<out String>) {
  val executor = NativeExecutor("macosArm64", args)
  executor.suite(Benchmark_Descriptor.describe())
  executor.suite(CallMethods_Descriptor.describe())
  executor.suite(Fibonacci_Descriptor.describe())
  executor.suite(LambdaNullNotNull_Descriptor.describe())
  executor.suite(ReturnConstant_Descriptor.describe())
  executor.run()
}
