import java.util.*

fun main() {
    println("Choose Question:")
    //making all entered
    when (readln().trim().lowercase(Locale.getDefault())) {
        "1", "one", "first" -> q1()
        "2", "two", "second" -> q2()
        "3", "three", "third" -> q3()
        "4", "four", "fourth" -> q4()
        else -> return main()
    }
    println("\nanother question? if not press enter")
    if (readln().matches("[a-zA-Z1-9_]+".toRegex()))
        return main()
}


fun q1() {
    println("Please enter your input of 5 numbers:")
    val arr = IntArray(5)
    var avg = 0
    for (x in arr) {
        arr[x] = readln().toInt()
        avg += arr[x]
    }
    println("Average of the numbers: ${avg/5}")

    var sum = 0
    var counter = 0
    val arrOfI50 = mutableListOf<Int>()
    for (x in 0..4) {
        if (x % 2 == 1) {
            sum += arr[x]
            counter++
        }
        if(arr[x]>50)
            arrOfI50.add(x)
    }
    println("Avg of numbers at odd indices: ${sum/counter}")
    for(i in arrOfI50){
        print("$i ")
    }
    println()
}

fun q2(){
    val string = "Which wristwatches are Swiss wristwatches"
    var count = 0
    for (char in string) {
        if (char == 'w') {
            count++
        }
    }
    println("Number of\"w\"s in the string \"Which wristwatches are Swiss wristwatches\": $count")
}

fun q3(){
    println("Please enter your input of 5 numbers:")
    val arr = IntArray(5)
    for (x in arr) {
        arr[x] = readln().toInt()
    }
    var temp : Int
    for (i in arr.indices) {
        for (j in 0 until arr.size - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    for(x in arr){
        print("$x ")
    }
    println()
}

fun q4(){
    println("Please enter your palindrome")
    val word = readln()
    var reverse = ""
    for(x in word){
        reverse = x + reverse
    }
    if(reverse == word)
        println("This is a palindrome")
    else
        println("This is not a palindrome")
}