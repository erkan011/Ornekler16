import java.text.NumberFormat
import java.util.*

fun main() {
    val number = 1234567.89
    val format = NumberFormat.getCurrencyInstance(Locale.US)
    val formattedNumber = format.format(number)
    println("Formatted Number: $formattedNumber") //Formatted Number: $1,234,567.89
}