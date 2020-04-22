// Don't need to declare type of a val
val businessName = "Montreux Jazz Café"

// No need to define return type
def squareOf(x: Int) = x * x

// Doesn't work for recursive method
//def fac(n: Int) = if (n == 0) 1 else n * fac(n - 1)

// Type inference in generic class
case class MyPair[A, B](x: A, y: B)

val p = MyPair(1, "scala") // type: MyPair[Int, String]

// Type inference in generic method
def id[T](x: T) = x
val q = id(1) // type: Int

// Type inference in lambda
// Hey, I have seen this in Java 8
Seq(1, 3, 4).map(x => x * 2)  // List(2, 6, 8)

// Still, please specify type, otherwise the second line can't compile
var obj = null
//obj = new AnyRef