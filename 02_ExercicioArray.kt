fun main() {

    val numbers = intArrayOf(8, 100, 12, 200, 20)
    var max = numbers[0] // variavel para armazenar o maior elemento
    var min = numbers[0] // variavel para armazenar o menor elemento

    // loop para encontrar o maior e o menor elemento

    for (number in numbers) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }
    }

    println("O maior número é: $max")
    println("O menor número é: $min")
}