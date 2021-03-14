package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // Variável declarada explicitamente
    for (valor in values) {
        println(valor)

    }
    println("---------------------------")

    // O Array utilizando uma expressão  lambda do forEach para fazer a impressão
    values.forEach {
        println(it)  // O it faz o papel da variável valor
    }

    println("---------------------------")

    // Interação pelo índice

    for (index in values.indices) {
        println(values[index])
    }

    println("---------------------------")

    //Interaçao que ordena por padrão do menor pro maior

    values.sort()

    for (index in values.indices) {
        println(values[index])
    }
}