package kotlin_samples

import java.util.Arrays

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    println(Arrays.toString(args))

    val test = printHello()
    println(test)
    drive(false)// ⇒ driving fast
    drive(true, "slow")// ⇒ driving slow
    drive(speed = "turtle-like", isSafetyEnabled = true)// ⇒ driving turtle-like

}

fun printHello() {
    println("Hello World")
}

fun drive(isSafetyEnabled: Boolean, speed: String = "fast") {
    println("driving $speed")
    println("safety $isSafetyEnabled")
}
