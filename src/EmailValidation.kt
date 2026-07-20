fun String.isValidEmail(): Boolean = contains("@") // optional {}, return, this

fun Int.isEven(arg: Int): Boolean {
    println("number: $arg")
    return this % 2 == 0
}

fun Int.isOdd(): Boolean = this %2 != 0
