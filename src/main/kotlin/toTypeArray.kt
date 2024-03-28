fun main() {
    val numbersList = listOf(1,2,3,4,5,6,7,8,9)

    val numbersArray = numbersList.toTypedArray()

    println("Dizi Elemanları: ")

    for (number in numbersArray){
        println(number)
    }
}