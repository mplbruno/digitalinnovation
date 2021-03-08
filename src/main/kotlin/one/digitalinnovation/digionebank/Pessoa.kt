package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "marcos"
     var cpf: String = "123.123.123-11"
         private set

    constructor()

    fun pessoainfo() = "$nome e $cpf"
}

fun main() {
    val marcos = Pessoa()

    println(marcos.pessoainfo())

}



