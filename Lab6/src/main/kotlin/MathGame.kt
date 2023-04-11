class MathGame {
    private var score = 0
    private var startTime = 0L
    init {
        println("Welcome to the Math Game.\nChoose difficulty level:\n1. Easy\n2. Medium\n3. Hard")
        startGame(readlnOrNull()?.toIntOrNull() ?: 1)
    }
    private fun startGame(level: Int) {
        val maxNumber = when (level) {
            2 -> 50
            3 -> 100
            else -> 10
        }

        val numOperations = when (level) {
            2 -> 3
            3 -> 4
            else -> 2
        }

        val operators = listOf("+", "-", "*", "/")
        println("You will be given $numOperations random operations to solve.")
        println("Your goal is to answer as many questions as possible in 60 seconds.")
        println("Press Enter to start")
        readlnOrNull()

        startTime = System.currentTimeMillis()

        while (System.currentTimeMillis() - startTime < 60000) {
            var expression = ""
            var result = 0
            for (i in 1..numOperations) {
                val num = (1..maxNumber).random()
                val operator = operators.random()
                expression += "$num $operator "
                result = when (operator) {
                    "+" -> result + num
                    "-" -> result - num
                    "*" -> result * num
                    "/" -> result / num
                    else -> result
                }
            }

            print("$expression= ")
            val answer = readlnOrNull()?.toIntOrNull()

            if (answer != null && answer == result) {
                println("Correct!")
                score++
            } else {
                println("Incorrect. The correct answer is $result.")
            }
        }

        println("Time's up! You answered $score questions correctly.")
    }
}