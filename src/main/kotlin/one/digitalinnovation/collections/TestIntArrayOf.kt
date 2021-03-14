package one.digitalinnovation.collections


     // Modo de criar um Array sem estar muito preso de ter que passar a capacidade na estanciação
fun main() {
    val values = intArrayOf(2,3,4,1,10,7)
    //  A forma de interar e as operações são as mesmas
         values.forEach {
             println(it)
         }
         println("------------------")

         values.sort()
             values.forEach {
                 println(it)
             }

         }


