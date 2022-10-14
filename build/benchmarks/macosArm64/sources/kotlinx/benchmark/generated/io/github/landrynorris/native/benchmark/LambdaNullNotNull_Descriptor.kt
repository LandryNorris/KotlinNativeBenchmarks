package kotlinx.benchmark.generated.io.github.landrynorris.native.benchmark

import io.github.landrynorris.native.benchmark.LambdaNullNotNull
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlinx.benchmark.Blackhole
import kotlinx.benchmark.SuiteDescriptor
import kotlinx.benchmark.native.NativeBenchmarkDescriptor

@Suppress("UNUSED_PARAMETER")
object LambdaNullNotNull_Descriptor {
  private fun setUp(instance: LambdaNullNotNull) {
  }

  private fun tearDown(instance: LambdaNullNotNull) {
  }

  private fun parametrize(instance: LambdaNullNotNull, params: Map<String, String>) {
  }

  private fun bind(function: LambdaNullNotNull.(Blackhole) -> Any?, bh: Blackhole):
      LambdaNullNotNull.() -> Any? = { function(bh) }

  fun describe(): SuiteDescriptor<LambdaNullNotNull> {
    val descriptor = SuiteDescriptor(name = "LambdaNullNotNull", factory = ::LambdaNullNotNull,
        setup = ::setUp, teardown = ::tearDown, parametrize = ::parametrize, parameters = listOf(),
        defaultParameters = mapOf())

    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.LambdaNullNotNull.benchmarkNotNullableLambdaWithEmpty",
        descriptor, LambdaNullNotNull::benchmarkNotNullableLambdaWithEmpty))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.LambdaNullNotNull.benchmarkNotNullableLambdaWithNotNull",
        descriptor, LambdaNullNotNull::benchmarkNotNullableLambdaWithNotNull))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.LambdaNullNotNull.benchmarkNullableLambdaWithNotNull",
        descriptor, LambdaNullNotNull::benchmarkNullableLambdaWithNotNull))
    descriptor.add(NativeBenchmarkDescriptor("io.github.landrynorris.native.benchmark.LambdaNullNotNull.benchmarkNullableLambdaWithNull",
        descriptor, LambdaNullNotNull::benchmarkNullableLambdaWithNull))
    return descriptor
  }
}
