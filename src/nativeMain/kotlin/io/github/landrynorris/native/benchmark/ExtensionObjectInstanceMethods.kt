package io.github.landrynorris.native.benchmark

class InstanceMethod {
    fun multiply10(x: Int): Int = x*10
}

object ObjectMethod {
    fun multiply10(x: Int): Int = x*10
}

fun InstanceMethod.extensionMultiply10(x: Int): Int = x*10
