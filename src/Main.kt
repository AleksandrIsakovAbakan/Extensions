import kotlin.math.sqrt

fun main() {

    var int = 5
    println(int)
    println(int.squaring())
    println()

    var string = "мир"
    println(string)
    println("Привет ".concat(string))
    println()

    string = "Привет мир"
    println(string)
    println(string.lastIndex())
    println()

    int = 16
    println(int)
    println(gettingSquareRoot(int))
}

/*
Написать функцию расширения возведения в квадрат целого числа.
*/
fun Int.squaring() = this * this

/*
Написать функцию расширения конкатенации строк.
*/
fun String.concat(string: String) = this + string

/*
Написать функцию расширения определения последнего индекса в строке.
*/
fun String.lastIndex() = if (this.isNotEmpty()) this.length - 1 else 0

/*
Написать функцию получения квадратного корня из целого числа.
*/
fun gettingSquareRoot(int: Int) = sqrt(int.toDouble())
