fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)

    numbers.forEach { number ->
        println(number)
    }
    numbers.forEach {
        println("Karesi: ${it * it}")
    }
}