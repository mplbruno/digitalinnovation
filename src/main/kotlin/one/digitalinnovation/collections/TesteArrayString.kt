package one.digitalinnovation.collections


//Como padrão tem que ter o Tipo <> o tamanho(size) e uma inicialização {}

fun main() {
    // Dependendo do valor da inialização ela já infere. Como a inicialização está sendo String a IDE avisa que não
    // precisa deixar explicito o tipo <String>
    // val nomes =  Array<String>(3){""}

    val nomes =  Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "zazá"
    nomes[2] = "José"

// Intera da mesma forma

    for (nome in nomes) {
        println(nome)

    }
    println("--------------------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("--------------------")

    // Instanciação menos verbosa

    val nomes2 = arrayOf("Maria","Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }


}