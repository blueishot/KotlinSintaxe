fun main() {
    // Aula 1
    var product = "chocolate"
    val business = "Losangulo"
    var work:String = "emprego"
    product = "biscoito"
    println(product::class)
    println(business)
    val pergunta = 10
    val resposta = pergunta.toDouble()
    println(resposta)
    // isso é um comentário
    // git test

    //Aula 2

    val numero:Long = 1_000_000
    println(numero)

    //Operadores (+ - * /)

    var idade = 10
    idade = idade + 12
    println(idade)

    val booleana = false
    println(booleana)
    println(!booleana)

    //char

    val userName = "Caio"
    val userNameFirstLetter = 'C'
    val pularLinha = '\n'
    val identar = '\t'
    println(userNameFirstLetter)
    println(userName + pularLinha + userNameFirstLetter)
    println(userName + identar + userNameFirstLetter)

    val tamanhoDoUserName = userName.length
    println(tamanhoDoUserName)

    val nomesMaiusculos = userName.uppercase()
    println(nomesMaiusculos)

    val nomesMinus = userName.lowercase()
    println(nomesMinus)

    val mensagem = """
       Olá Usuário,
       Seu produto chegou!
    """.trimIndent()

    val mensagem2 = """
        Olá Usuário,
        Seu produto chegou!
    """.replaceIndent(newIndent = ";")

    println(mensagem)
    println(mensagem2)

    val usuario = "Diego"
    val usuarioIdade = 42
    println("Olá " + usuario + ", Sua idade é " + usuarioIdade)
    println("Olá $usuario, sua idade é $usuarioIdade")
    println("Sua idade ano que vem é de ${usuarioIdade + 1}")
}