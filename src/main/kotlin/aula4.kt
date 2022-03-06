fun main () {
    val userA = Usuario()
    val userB = Usuario()

    userA.email = "souumemail@gmail.com"
    userB.email = "sououtroemail@hotmail.com"

    println(userA.email)

    userA.capslock()
    userB.capslock()

    userA.updateEmail(newEmail = "souumnovoEmail@gmail.com")

    println(userA.capslock())

    var buttonSucess = Button()
    buttonSucess.text = "Sucesso"
    buttonSucess.colors = "Green"

    var buttonFail = Button()
    buttonFail.text = "Falhou"
    buttonFail.colors = "Red"

    var userAEmailLength = userA.getEmailLength()
    println(userAEmailLength)
}