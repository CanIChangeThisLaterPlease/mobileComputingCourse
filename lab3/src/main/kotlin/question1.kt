fun badEnigma() {
    //skipped because it was not needed
    /* println("Please enter the username:")
     val userName = readlnOrNull()

     println("Please enter the password:")
     val password = readlnOrNull()

     if (userName == "Student" && password == "stu@C403") {*/
    println("Enter E for (encryption) or D for (decryption):")
    val encOrDec = readln()
    println("Enter the code:")
    val input = readln().trim()
    if (encOrDec == "E" || encOrDec == "e") {
        for (i in input) {
            //code being a built-in property
            print("${i.code} ")
        }
    } else {
        if (encOrDec == "D" || encOrDec == "d") {
            val decryption = input.split(" ")
            for (i in decryption) {
                print(i.toInt().toChar())
            }
        } else {
            print("Incorrect input")
        }
    }
    //}
}