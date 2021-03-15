package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 1500.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    //Conjunto
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //Imprime o conjunto funcionarios1

    funcionarios1.forEach{ println(it) }
    println("--------------------------")

    //Imprime o conjunto funcionarios2

    funcionarios2.forEach{ println(it) }

    println("--------------------------")

    // Cria a variavel união dos conjuntos

    val resultunion = funcionarios1.union(funcionarios2)

    //Imprime união/subtração e interseção dos conjuntos

    resultunion.forEach{ println(it) }

    println("--------------------------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("--------------------------")


    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }
}

