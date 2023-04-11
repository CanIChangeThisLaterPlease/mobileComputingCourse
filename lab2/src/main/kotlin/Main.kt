fun main(args: Array<String>) {
    val grades = mutableListOf<Int>()
    for (i in 1..5) {
        print("Enter grade $i (between 0 and 25): ")
        val grade = readln().toInt()

        if (grade < 0 || grade > 25) {
            println("Grade must be between 0 and 25.")
            return
        }
        grades.add(grade)
    }
    for (i in 0..4)
        grades[i] *= 4

    var count = 0
    for (grade in grades)
        if (grade < 50)
            count++

    println("Number of grades under 50%: $count")
    val total = grades.sum()
    val avg = total.toDouble() / grades.size
    println("Sum of all grades: $total%")
    println("Average grade: $avg%")

    when(avg.toInt()){
        in 50..74 -> println("Good Overall")
        in 75..84 -> println("Very Good")
        in 85..100 -> println("Excellent")
    }



    val x = readln().toInt()
    when(x){
        1-> println("Saturday")
        2-> println("Sunday")
        3-> println("Monday")
        4-> println("Tuesday")
        5-> println("Wednesday")
        6-> println("Thursday")
        7-> println("Friday")
        else -> println("Not a day of the week")
    }

    if (x == 1) {
        println("Saturday")
    } else if (x == 2) {
        println("Sunday")
    } else if (x == 3) {
        println("Monday")
    } else if (x == 4) {
        println("Tuesday")
    } else if (x == 5) {
        println("Wednesday")
    } else if (x == 6) {
        println("Thursday")
    } else if (x == 7) {
        println("Friday")
    } else {
        println("Not a day of the week")
    }
}