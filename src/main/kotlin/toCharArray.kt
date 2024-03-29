fun main() {
    val str = "hello, kotlin!"
    val charArray = str.toCharArray()
    println("Dizge: $str")
    println("karakter dizisi: ")
    charArray.forEach { println(it) }
}