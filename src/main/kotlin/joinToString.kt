fun main() {

    val stringArray = arrayOf("Merhaba", "Dünya", "!")

    val result = stringArray.joinToString(separator = " - ", prefix = "[", postfix = "]")

    println(result) //Çıktı: [Merhaba - Dünya - !]
}

//fun main() {
//
//    val stringArray = arrayOf("Merhaba", "Dünya", "!")
//
//    val result = stringArray.joinToString(separator = " / ", prefix = "{", postfix = "}")
//
//    println(result)
//} //Çıktı: {Merhaba / Dünya / !}
