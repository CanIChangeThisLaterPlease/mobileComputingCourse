import java.util.*
import badEnigma as firstQuestion
import triangle as thirdQuestion
import ulamSpiral as secondQuestion

fun main() {
    println("Choose Question:")
    //making all entered
    when (readln().trim().lowercase(Locale.getDefault())) {
        //too good to be true solved otherwise with if statements or to lower function
        /*Regex("(?i)^1|one|first$").matches(input) -> firstQuestion()
        Regex("(?i)^2|two|second$").matches(input) -> secondQuestion()
        Regex("(?i)^3|three|third$").matches(input) -> thirdQuestion()*/
        "1", "one", "first" -> firstQuestion()
        "2", "two", "second" -> secondQuestion()
        "3", "three", "third" -> thirdQuestion()
        else -> return main()
    }
    println("\nanother question? if not press enter")
    if (readln().matches("[a-zA-Z1-9_]+".toRegex()))
        return main()
}