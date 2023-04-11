class Login {
    private val username: String
    private val password: String

    init {
        println("Enter your username: ")
        username = readln().trim()
        println("Enter your password: ")
        password = readln().trim()
    }

    fun CheckUserName(): String { //why not just use boolean?
        val user = "2"+username+"2"
        if(user == "2kotlin2")
            return "OK"
        return "No"
    }

    fun CheckPassword(): String {
        val regex = Regex("FUN", RegexOption.IGNORE_CASE)
        if(regex.replace(password) { "FUN" }== "aaFUNbb")
            return "OK"
        return "No"
    }
    //this was added to reduce hassle in the main function
    fun checkBoth():String{
        if(this.CheckPassword()=="OK"&&this.CheckUserName()=="OK")
            return "You are authorized"
        return "You are not authorized"
    }
}