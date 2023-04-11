import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

fun ulamSpiral() {

    Application.launch(Main::class.java)


    print("Enter a number: ")
    //first problem size of the grid. solved
    val n = readln().toInt()
    val size = findNextSquare(n)
    val grid = Array(size) { IntArray(size) }
    //declared as val because the content of the map changes and not the map itself
    val location = mutableMapOf("x" to n / 2, "y" to n / 2)
    val iterator = mutableMapOf("dx" to 0, "dy" to 0)
    //second problem finding the primes in between
    val primes = primer(size * size)
    print(primes)
    //third knowing how to traverse the indices correctly
    //when do we rotate?
    var direction: Direction = Direction.WEST
    //fourth drawing the array |  -  * I might use graphics for this
}

fun findNextSquare(i: Int): Int {
    var counter = 1
    while (counter <= i + 1)
        if (i <= counter * counter)
            return counter
        else counter++
    return 0
}

fun primer(limit: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in 1..limit)
        if (isPrime(i)) list.add(i) else list.add(0)
    return list
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

enum class Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST
}

class Main : Application() {
     override fun start(primaryStage: Stage) {
        val btn = Button()
        btn.text = "Hello JavaFX!"
        btn.setOnAction { println("Hello JavaFX!") }

        val root = StackPane()
        root.children.add(btn)

        val scene = Scene(root, 300.0, 250.0)

        primaryStage.title = "JavaFX App"
        primaryStage.scene = scene
        primaryStage.show()
    }
}