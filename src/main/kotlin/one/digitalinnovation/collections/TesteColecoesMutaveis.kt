package one.digitalinnovation.collections


fun main() {
    val joão = Funcionario("João", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 1500.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    println("---------- LIST ------------")

    // Lista mutável que pode ser alterada depois inicializada
    val funcionarios = mutableListOf(joão, maria)

    funcionarios.forEach{ println(it) }

    println("----------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("----------------------------")


    funcionarios.remove(joão)
    funcionarios.forEach{ println(it)}

    println("---------- SET ------------")
    val funcionarioset = mutableSetOf(joão)
    funcionarioset.forEach{ println(it)}

    println("----------------------------")

    funcionarioset.add(pedro)
    funcionarioset.add(maria)
    funcionarioset.forEach{ println(it)}

    println("----------------------------")

    funcionarioset.remove(maria)
    funcionarioset.forEach{ println(it)}
}




