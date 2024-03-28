fun main() {
    val empArray = emptyArray<String>()

    val newArray = empArray + "merhaba" + "Dünya"

    println("Yeni dizinin elemanları")
    for (element in newArray) {
        println(element)
    }
}