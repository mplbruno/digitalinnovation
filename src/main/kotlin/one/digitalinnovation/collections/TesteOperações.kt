package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4500.0)
    for (salario in salarios) {
        println(salario)
    }

    println("-----------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

// No filter é preciso passar algo (predicado) que vai dar uma expressão e aplica em cada objeto e valida
// sendo verdadeira ele vai coletar e alocar em uma outra coleção como resultado

    val salarioMaiorQue2500 = salarios.filter { it> 2500.0 }

    println("-----------------------------")

    salarioMaiorQue2500.forEach { println(it)}

    println("-----------------------------")

    // Conta quantos estão dentor de um "range"

    println(salarios.count { it in 2000.0..5000.0 })

    println("-----------------------------")

    // Busca um valoer especifico se não encontrar retorna null

    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("-----------------------------")
    // Informa se encontrou elemento qualquer em que a expressao seja valida

    println(salarios.any() { it == 1000.0 })
    println(salarios.any() { it == 500.0 })
}

