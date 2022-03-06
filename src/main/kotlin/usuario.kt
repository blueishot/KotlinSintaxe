class Usuario {
    var email: String = ""

    fun capslock () {
        println(email.uppercase())
    }

    fun updateEmail (newEmail: String) {
        email = newEmail
    }

    fun getEmailLength(): Int {
        return email.length
    }
}