fun toplam(vararg sayilar: Int): Int{
    var toplam = 0
    for (sayi in sayilar){
        toplam +=sayi
    }
    return toplam
}

fun main() {
    val sonuc1 = toplam(1,2,3,4)
    val sonuc2 = toplam(5,6,7,8)
    val sonuc3 = toplam(9,10,11)
    println(sonuc1)
    println(sonuc2)
    println(sonuc3)
}