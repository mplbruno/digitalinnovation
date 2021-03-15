package one.digitalinnovation.collections

fun main() {
    // Mapa é uma coleção de chaves e seus valores
    // O par (pair) é adicionado como chave e valor no mapa (mapOf)
   val pair: Pair<String,Double> =Pair("Joao", 1000.0)
    val map1= mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v")}

    println("______________________________________")

    // outro tipo de sintax
    // Recurso Infix
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3500.0 )

        map2.forEach{ (k, v) -> println("Chave: $k - Valor: $v")}


}