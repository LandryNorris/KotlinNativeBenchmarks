package kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark

import io.github.landrynorris.native.benchmark.ReturnConstant
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlinx.benchmark.Blackhole
import kotlinx.benchmark.SuiteDescriptor
import kotlinx.benchmark.native.NativeBenchmarkDescriptor

@Suppress("UNUSED_PARAMETER")
object ReturnConstant_Descriptor {
  private fun setUp(instance: ReturnConstant) {
  }

  private fun tearDown(instance: ReturnConstant) {
  }

  private fun parametrize(instance: ReturnConstant, params: Map<String, String>) {
  }

  private fun bind(function: ReturnConstant.(Blackhole) -> Any?, bh: Blackhole):
      ReturnConstant.() -> Any? = { function(bh) }

  fun describe(): SuiteDescriptor<ReturnConstant> {
    val descriptor = SuiteDescriptor(name = "ReturnConstant", factory = ::ReturnConstant, setup =
        ::setUp, teardown = ::tearDown, parametrize = ::parametrize, parameters = listOf(),
        defaultParameters = mapOf())

    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.ReturnConstant.benchmarkReturnConstant10Times",
        descriptor, ReturnConstant::benchmarkReturnConstant10Times))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.ReturnConstant.benchmarkReturnConstant1Time",
        descriptor, ReturnConstant::benchmarkReturnConstant1Time))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.ReturnConstant.benchmarkReturnConstantC10Times",
        descriptor, ReturnConstant::benchmarkReturnConstantC10Times))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.ReturnConstant.benchmarkReturnConstantC1Time",
        descriptor, ReturnConstant::benchmarkReturnConstantC1Time))
    return descriptor
  }
}
