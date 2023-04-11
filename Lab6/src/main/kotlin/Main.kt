import java.util.*

fun main() {
    println("Choose Question:")
    when (readln().trim().lowercase(Locale.getDefault())) {
        //Didn't have time to make this fancy I have a lot of exams although this is exactly what the question asked.
        "1", "one", "first" -> println(Login().checkBoth())
        //I was inspired to make this by my alarm which forces you to solve problems to turn it off
        "2", "two", "second" -> MathGame()
        else -> return main()
    }
    println("\nanother question? if not press enter")
    if (readln().matches("[a-zA-Z1-9_]+".toRegex()))
        return main()
}