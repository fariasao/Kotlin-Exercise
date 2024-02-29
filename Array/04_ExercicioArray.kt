// buscando elementos do array

fun main() {
    val names = arrayOf("Mariana", "Beatriz", "kaue", "Lucas")
    val name = "kaue"
    var found = false
    for (n in names) {
        if (n == name) {
            found = true
            break
        }
    }
    if (found) {
        println("$name encontrado")
    } else {
        println("$name não encontrado")
    }
    
}