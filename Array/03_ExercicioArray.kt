// media dos elementos

fun main() {
    val values = doubleArrayOf(12.5, 9.8, 15.2, 18.7, 20.0)
    var sum = 0.0
    for (value in values) {
        sum += value
    }
    val average = sum / values.size
    println("A média dos elementos é: $average")
}
