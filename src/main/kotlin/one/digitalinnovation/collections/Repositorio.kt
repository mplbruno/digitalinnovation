package one.digitalinnovation.collections

// T é um tipo generico
class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T ){
        map[id] = value
    }
    fun findByid(id: String) = map[id]

    // colecao de elementos do map

    fun findAll() = map.values


    fun remove(id: String)=  map.remove(id)

}



