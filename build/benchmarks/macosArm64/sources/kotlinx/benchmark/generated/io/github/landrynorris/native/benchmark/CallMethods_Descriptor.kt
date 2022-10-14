package kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark

import io.github.landrynorris.native.benchmark.CallMethods
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlinx.benchmark.Blackhole
import kotlinx.benchmark.SuiteDescriptor
import kotlinx.benchmark.native.NativeBenchmarkDescriptor

@Suppress("UNUSED_PARAMETER")
object CallMethods_Descriptor {
  private fun setUp(instance: CallMethods) {
  }

  private fun tearDown(instance: CallMethods) {
  }

  private fun parametrize(instance: CallMethods, params: Map<String, String>) {
  }

  private fun bind(function: CallMethods.(Blackhole) -> Any?, bh: Blackhole): CallMethods.() -> Any?
      = { function(bh) }

  fun describe(): SuiteDescriptor<CallMethods> {
    val descriptor = SuiteDescriptor(name = "CallMethods", factory = ::CallMethods, setup = ::setUp,
        teardown = ::tearDown, parametrize = ::parametrize, parameters = listOf(), defaultParameters
        = mapOf())

    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.CallMethods.benchmarkExtensionMethod",
        descriptor, CallMethods::benchmarkExtensionMethod))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.CallMethods.benchmarkInstanceMethod",
        descriptor, CallMethods::benchmarkInstanceMethod))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.CallMethods.benchmarkObjectMethod",
        descriptor, CallMethods::benchmarkObjectMethod))
    return descriptor
  }
}
