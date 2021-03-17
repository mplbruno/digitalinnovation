package one.digitalinnovation.collections

fun main() {
    val joão = Funcionario("João", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 1500.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joão.nome,joão)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.findByid(joão.nome))

    println("-----------------------------")

    //Imprime todo o repositório
    repositorio.findAll().forEach { println(it)}

    println("-----------------------------")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it)}
}
