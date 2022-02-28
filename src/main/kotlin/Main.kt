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

    val clothes = "To"
    if (clothes.length < 3) {
        println("Essa roupa tem menos de 3 letras")
    } else {
        println("Essa roupa tem mais de 3 letras")
    }

    val preco = 90_000
    if (preco > 30_000) {
        println("Você ganhou 40% de desconto")
    } else if (preco > 20_000) {
        println("Você ganhou 30% de desconto")
    } else if (preco > 15_000) {
        println("Você ganhou 20% de desconto")
    } else {
        println("Você não merece desconto")
    }

    val condition1 = "Teste"
    val condition2 = 10

    if (condition1 == "Teste" && condition2 == 11) {
        println("Você inseriu tudo corretamente")
    } else {
        println("Você inseriu algo errado")
    }

    val caractere:String? = "Lunático"

    val qtdDeCaracteres = caractere?.length ?: 0
    println(qtdDeCaracteres)
}