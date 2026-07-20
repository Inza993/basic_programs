fun main() {
    println("Hi")

    println(EmailValidation.isValidEmail("test@mail.com"))
    println(EmailValidation.isValidEmail("testmail.com"))

    println("test@mail.com".isValidEmail())
    println("testmail.com".isValidEmail())

    println(4.isEven(4))
    println(5.isOdd())
}