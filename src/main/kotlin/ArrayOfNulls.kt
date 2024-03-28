fun main() {
    val nullArray = arrayOfNulls<String>(5)
    nullArray[0] = "First"
    nullArray[1] = "Second"
    nullArray[2] = "Third"

    for (element in nullArray){
        println(element)
    }
}