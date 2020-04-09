println("/////////// Mixins ///////////")

abstract class A {
  val message: String
}

class B extends A {
  val message = "I'm an instance of class B"
}

trait C extends A {
  def loudMessage = message.toUpperCase()
}

class D extends B with C

println("/////////// A more concrete example ///////////")

val d = new D
println(d.message) // I'm an instance of class B
println(d.loudMessage) // I'M AN INSTANCE OF CLASS B

abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next(): T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0

  def hasNext = i < s.length

  def next() = {
    val ch = s charAt i
    i += 1
    ch
  }
}

// Because RichIterator is a trait,
// it doesn’t need to implement the abstract members of AbsIterator.
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}