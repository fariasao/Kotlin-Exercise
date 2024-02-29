// Crie um sistema de geração de comanda para lanchonete
// inicie criando variaveis para o controle de preço e quantidade de produtos
// Exibir: A quantidade e preço dos produtos, soma, taxa e o total
// use os valores 3 coxinhas e 2 cervejas
// coxinha = 5.0
// cerveja = 15.0

fun main() {
    val coxinha = 5.0
    val cerveja = 15.0
    val qtdCoxinha = 3
    val qtdCerveja = 2
    val soma = (coxinha * qtdCoxinha) + (cerveja * qtdCerveja)
    val taxa = soma * 0.1
    val total = soma + taxa
    println("_______________________________")
    println("Lanchonete FariasAo")
    println("_______________________________")
    println("Quantidade de coxinhas: $qtdCoxinha")
    println("Quantidade de cervejas: $qtdCerveja")
    println("Soma: $soma")
    println("Taxa: $taxa")
    println("Total: %.2f".format(total))
    println("_______________________________")
}