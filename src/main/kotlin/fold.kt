fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val sum = numbers.fold(0) { accumulator, number ->
        accumulator + number
    }
    println("Sum of numbers : $sum")
}
