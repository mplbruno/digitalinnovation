package one.digitalinnovation.collections

fun main() {
    val joão = Funcionario("João", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 1500.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = listOf(joão, pedro, maria)

    //O it nessa interação é o funcionario seja joão, Pedro ou a Maria. É a instância do objeto referenciado em cada
    //variável e alocado em uma posição dentro da lista

    funcionarios.forEach{ println(it) }
    println("------------------------")

    //Imprime somente a Maria

    println(funcionarios.find { it.nome =="Maria" })

    println("------------------------")

    //Ordenar (SortedBy) pelo salário

    funcionarios

        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------------")

    //Agrupar (groupBy) por tipo

    funcionarios
        .groupBy {it.tipoContratacao}
        .forEach { println(it) }

    println("------------------------")


    // Sobrescreve e muda o formato de
    // Funcionario(nome=João, salario=1000.0)
    //para:
    // Nome:    João
    // Salario: 1000.0


}


