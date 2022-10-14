package kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark

import io.github.landrynorris.native.benchmark.Fibonacci
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlinx.benchmark.Blackhole
import kotlinx.benchmark.SuiteDescriptor
import kotlinx.benchmark.native.NativeBenchmarkDescriptor

@Suppress("UNUSED_PARAMETER")
object Fibonacci_Descriptor {
  private fun setUp(instance: Fibonacci) {
  }

  private fun tearDown(instance: Fibonacci) {
  }

  private fun parametrize(instance: Fibonacci, params: Map<String, String>) {
  }

  private fun bind(function: Fibonacci.(Blackhole) -> Any?, bh: Blackhole): Fibonacci.() -> Any? = {
      function(bh) }

  fun describe(): SuiteDescriptor<Fibonacci> {
    val descriptor = SuiteDescriptor(name = "Fibonacci", factory = ::Fibonacci, setup = ::setUp,
        teardown = ::tearDown, parametrize = ::parametrize, parameters = listOf(), defaultParameters
        = mapOf())

    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.Fibonacci.benchmarkFibonacci",
        descriptor, Fibonacci::benchmarkFibonacci))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.Fibonacci.benchmarkFibonacciC",
        descriptor, Fibonacci::benchmarkFibonacciC))
    return descriptor
  }
}
