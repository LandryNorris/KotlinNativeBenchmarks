package io.github.landrynorris.native.benchmark

import constant.constant10

fun returnConstantOnce(): Double = 10.0

fun returnConstantC(): Double = constant10()

fun returnConstant10Times(): Double {
    var result = 0.0

    repeat(10) {
        result += 10.0
    }

    return result
}

fun returnConstantC10Times(): Double {
    var result = 0.0

    repeat(10) {
        result += constant10()
    }

    return result
}
