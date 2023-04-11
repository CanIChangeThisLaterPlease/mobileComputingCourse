fun main(args: Array<String>) {
    //first
    val pi = 3.14159
    var r = 4.23
    var h = 7.11
    var x = (1.0/3.0)
    var V = x*pi*r*r*h
    println(V)
    //second
    var one = 5
    var two = 3
    var three = 6
    var four = 20
    println("sum: ${one+two+three+four}\naverage: ${one+two+three+four/4}")
    //third
    var string1 = "apple"
    var string2 = "pineapple"
    println(string1 == string2)
    println(string1.length > string2.length)
    println(string1[3] == string2[3])
    println(string1 + string2)


}