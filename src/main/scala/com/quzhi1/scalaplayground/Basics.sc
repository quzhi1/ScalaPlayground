println("/////////// Declaring value ///////////")
val x: Int = 1 + 1
val addOne = (x: Int) => x + 1
y = 3
println(x, y)

println("/////////// Blocks ///////////")
println({
  val x = 1 + 1
  x + 1
})

println("/////////// Methods ///////////")
val point12 = Point(1, 2)
println(square(2))

println("/////////// Functions ///////////")
val anotherPoint12 = Point(1, 2)
println(addOne(1))
val point22 = Point(2, 2)
println(addThenMultiply(1, 2)(3))
val newId: Int = IdFactory.create()
println("Hello, " + name + "!")

println("/////////// Classes ///////////")
val newerId: Int = IdFactory.create()

new Greeter("Hello, ", "!").greet("zhiqu")

println("/////////// Case classes ///////////")
val greeter = new DefaultGreeter()
val customGreeter = new CustomizableGreeter("How are you, ", "?")
// x = 2 // won't compile
var y: Int = 1 + 1

def square(x: Int): Int = x * x

println(point12 == anotherPoint12)
println(point12 == point22)

println("/////////// Objects ///////////")

// Function with param list
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

// Function with no param
def name: String = System.getProperty("user.name")
println(newId) // 1

trait GreeterTrait {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}
println(newerId) // 2

println("/////////// Traits ///////////")

class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}

case class Point(x: Int, y: Int)

class DefaultGreeter extends GreeterTrait

class CustomizableGreeter(prefix: String, postfix: String) extends GreeterTrait {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}
greeter.greet("Scala developer") // Hello, Scala developer!

object IdFactory {
  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }
}
customGreeter.greet("Scala developer") // How are you, Scala developer?


println("/////////// Main ///////////")

object Main {
  def main(args: Array[String]): Unit =
    println("Hello, Scala developer!")
}
