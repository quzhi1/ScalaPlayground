println("/////////// Declaring value ///////////")
val x: Int = 1 + 1
// x = 2 // won't compile
var y: Int = 1 + 1
y = 3
println(x, y)

println("/////////// Blocks ///////////")
println({
  val x = 1 + 1
  x + 1
})

println("/////////// Methods ///////////")
def square(x: Int): Int = x * x
println(square(2))

println("/////////// Functions ///////////")
val addOne = (x: Int) => x + 1
println(addOne(1))

// Function with param list
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(1, 2)(3))

// Function with no param
def name: String = System.getProperty("user.name")
println("Hello, " + name + "!")

println("/////////// Classes ///////////")

class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}

new Greeter("Hello, ", "!").greet("zhiqu")

println("/////////// Case classes ///////////")

case class Point(x: Int, y: Int)

val point12 = Point(1, 2)
val anotherPoint12 = Point(1, 2)
val point22 = Point(2, 2)

println(point12 == anotherPoint12)
println(point12 == point22)

println("/////////// Objects ///////////")

object IdFactory {
  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }
}

val newId: Int = IdFactory.create()
println(newId) // 1
val newerId: Int = IdFactory.create()
println(newerId) // 2

println("/////////// Traits ///////////")

trait GreeterTrait {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends GreeterTrait

class CustomizableGreeter(prefix: String, postfix: String) extends GreeterTrait {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter = new DefaultGreeter()
greeter.greet("Scala developer") // Hello, Scala developer!

val customGreeter = new CustomizableGreeter("How are you, ", "?")
customGreeter.greet("Scala developer") // How are you, Scala developer?


println("/////////// Main ///////////")

object Main {
  def main(args: Array[String]): Unit =
    println("Hello, Scala developer!")
}