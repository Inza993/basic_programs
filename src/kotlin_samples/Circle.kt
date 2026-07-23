package kotlin_samples

class Circle(var name: String = "primary", x: Int) {
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
}

fun main() {
    val c = Circle(5)
    println(c.name)
    val c1 = Circle(x = 10)
    println(c1.name)
}
