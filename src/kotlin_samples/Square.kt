package kotlin_samples

class Square(var name: String = "primary", x: Int) {
    init {
        println("x: $x")
    }
    init {
        println("init 2")
    }
    constructor(i: Int) : this("secondary", 1) {
        println("i: $i")
        this.name = name+i
    }

    constructor(b: Boolean): this(x = 2) {
        println("b: $b")
        this.name = name+b
    }

    constructor(c: Float): this(x = changeValueToInt(c))

}

fun changeValueToInt(c: Float): Int {
    return c.toInt()
}

fun main() {
    val c = Square(5)
    println(c.name)
    val c1 = Square(x = 10)
    println(c1.name)
}
