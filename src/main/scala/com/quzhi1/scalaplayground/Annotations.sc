import scala.annotation.tailrec

// deprecated
@deprecated("deprecation message", "release # which deprecates method")
def hello = "hola"

hello

// tailrec
def factorial(x: Int): Int = {

  @tailrec
  def factorialHelper(x: Int, accumulator: Int): Int = {
    if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
  }
  factorialHelper(x, 1)
}
