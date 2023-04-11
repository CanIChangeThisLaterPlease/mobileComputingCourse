fun triangle() {
    print("Enter the number of rows for the triangle:\n(try 100)\n")
    val rows = readln().toInt()
    for (i in 1..rows) {
        for (j in i..rows)
            print(" ")
        for (k in 1..i)
            print("* ")
        print("\n")
    }
}