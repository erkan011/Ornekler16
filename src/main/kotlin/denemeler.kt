//class Kullanici {
//    var ad: String = ""
//    var yas: Int = 0
//        private set
//
//    fun yasArtir(){
//        yas++
//    }
//}
//
//fun main() {
//    val kullanici = Kullanici()
//    kullanici.ad = "Erkan"
//    //kullanici.yas = 30  //hatalı
//    kullanici.yasArtir()
//    println("${kullanici.ad} isimli kullanıcının yaşı artırdıktan sonra yeni yaşı: ${kullanici.yas}")
//}







//fun kullaniciGirisKontrolu(kullanici: String,sifre:String):Boolean{
//    return kullanici == "Erkan" && sifre == "19051905"
//}
//fun main() {
//    println("Lütfen Adınızı Giriniz: ")
//    val kullaniciAdi= readlnOrNull()
//
//    println("lütfen Şifrenizi Giriniz: ")
//    val sifre = readlnOrNull()
//    if (kullaniciAdi != null && sifre != null){
//        val kullaniciGirisDurumu = kullaniciGirisKontrolu(kullaniciAdi,sifre)
//
//    if (kullaniciGirisDurumu){
//        println("Giriş Başarılı")
//    }else{
//        println("kullanıcı adı veya şifre yanlış")
//    }
//}else{
//    println("Geçersiz Giriş")
//    }
//}





//fun bolmeIslemi(a: Int, b: Int): Int {
//    return a/b
//}
//fun main() {
//    val sayi1 = 10
//    val sayi2 = 0
//    try {
//        val sonuc = bolmeIslemi(sayi1, sayi2)
//        println("Sonuç: $sonuc")
//    }catch (e: ArithmeticException) {
//        println("Hata: ${e.message}")
//        println("Bölme işlemi başarısız oldu.")
//    }
//}





//fun main() {
//    val liste = listOf("Erkan", "Eymen", "Burak", "Ayten", "Cahit")
//
//    for (index in liste.indices){
//        println("Indis $index: ${liste[index]}")
//    }
//}




//fun main() {
//    val liste = listOf("Erkan", "Eymen", "Burak", "Ayten", "Cahit")
//    val baslangicIndisi = 2
//    val bitisIndisi = 4
//
//    for (index in baslangicIndisi..bitisIndisi)
//        println("Indis $index: ${liste[index]}")
//}



//class TemporaryData {
//     private var kullaniciAdi: String = ""
//     private var yas: Int = 0
//
//    fun veriGirisi(kullaniciAdi: String, yas:Int){
//        this.kullaniciAdi = kullaniciAdi
//        this.yas = yas
//        println("Geçici veriler başarıyla kaydedildi")
//    }
//
//    fun verGoster(){
//        println("Kullanıcı Adı: $kullaniciAdi, Yaş: $yas")
//    }
//
//    fun veriSil(){
//        kullaniciAdi = ""
//        yas = 0
//        println("Geçici veriler silindi")
//    }
//}
//
//fun main() {
//    val temporaryData = TemporaryData()
//    temporaryData.veriGirisi("Erkan", 22)
//    temporaryData.verGoster()
//
//    temporaryData.veriSil()
//    temporaryData.verGoster()
//}


//sealed interface Animal{
//    fun makeSound(): String
//}
//
//data object Dog : Animal {
//    override fun makeSound(): String {
//        return "woof!"
//    }
//}
//
//data object Cat : Animal {
//    override fun makeSound(): String {
//        return "meow!!"
//    }
//}
//
//data object Cow : Animal {
//    override fun makeSound(): String {
//        return "moo!!"
//    }
//}
//
//fun main() {
//    val animals : List<Animal> = listOf(Dog, Cat, Cow)
//    for (animal in animals) {
//        println(animal.makeSound())
//    }
//}


//abstract class Vehicle {
//    abstract fun start()
//
//    abstract fun stop()
//}
//
//class Car : Vehicle(){
//    override fun start() {
//        println("Car is Starting")
//    }
//
//    override fun stop() {
//        println("car is Stopping")
//    }
//}
//
//fun main() {
//    val car = Car()
//    car.start()
//    car.stop()
//}




