package kotlin_samples

data class Player(val name: String, var score: Int)

class Player1(val name: String, val score: Int)

fun main(args: Array<String>) {
    val firstPlayer = Player("Lauren", 10)
    val firstPlayer1 = Player1("Lauren", 10)

    println(firstPlayer)
    println(firstPlayer1)

    val secondPlayer = firstPlayer.copy() // creates a new object with same values

    println(secondPlayer)
    secondPlayer.score = 20
    println(secondPlayer)
    println(firstPlayer)

    val thirdPlayer = firstPlayer.copy(score = 44)
    println(thirdPlayer)

    // not possible
//    val thirdPlayer1 = firstPlayer1.copy(score = 44)
}
