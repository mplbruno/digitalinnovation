package one.digitalinnovation.collections

fun main() {
    val joão = Funcionario("João", 1000.0 )
    val pedro = Funcionario("Pedro", 1000.0 )
    val maria = Funcionario("Maria", 1000.0 )

    val funcionarios = listOf(joão, pedro, maria)

}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome:  $nome
            Salário: $salario
            """.trioIdent()
}
