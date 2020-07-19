package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine().split(" ").toList()
    val number1 = input[0].toInt()
    val number2 = input[1].toInt()
    println(number1 + number2)
}
