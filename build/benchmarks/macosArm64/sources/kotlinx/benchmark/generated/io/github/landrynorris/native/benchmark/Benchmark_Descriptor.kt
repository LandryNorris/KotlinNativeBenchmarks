package kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark

import io.github.landrynorris.native.benchmark.Benchmark
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlinx.benchmark.Blackhole
import kotlinx.benchmark.SuiteDescriptor
import kotlinx.benchmark.native.NativeBenchmarkDescriptor

@Suppress("UNUSED_PARAMETER")
object Benchmark_Descriptor {
  private fun setUp(instance: Benchmark) {
  }

  private fun tearDown(instance: Benchmark) {
  }

  private fun parametrize(instance: Benchmark, params: Map<String, String>) {
  }

  private fun bind(function: Benchmark.(Blackhole) -> Any?, bh: Blackhole): Benchmark.() -> Any? = {
      function(bh) }

  fun describe(): SuiteDescriptor<Benchmark> {
    val descriptor = SuiteDescriptor(name = "Benchmark", factory = ::Benchmark, setup = ::setUp,
        teardown = ::tearDown, parametrize = ::parametrize, parameters = listOf(), defaultParameters
        = mapOf())

    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.Benchmark.benchmarkEmptyMethod",
        descriptor, Benchmark::benchmarkEmptyMethod))
    return descriptor
  }
}
