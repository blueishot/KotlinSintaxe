fun main () {
    val oldInt: Int = 3
    val newInt = oldInt.plus(30)
    println(newInt)

    // O método plus irá fazer a somatória.

    private val MAX_NAME_LENGTH = 7 // O private só vai deixar com que essa váriavel seja vísivel dentro desse object
    // e utilizando o padrão UPPER_CASE que em todas constantes imutáveis podemos utilizar letra maiúscula




}

class aula5 {
    companion object{
        var count = 0
        fun resetCount () {
            count = 0
        }

        const val countExample = 10
        // O const é uma constante em tempo de compilação, usamos para compilação
    }

    //O companion object é utilizado para que tudo se torne propriedade e comportamento dentro da class
}

object Database {
    var name = "Desconhecido"
    var userLogged: Usuario? = null
}