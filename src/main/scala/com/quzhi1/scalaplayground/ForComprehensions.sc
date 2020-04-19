case class User(name: String, age: Int)

val userBase = List(
  User("Travis", 28),
  User("Kelly", 33),
  User("Jennifer", 44),
  User("Dennis", 23)
)

val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
  yield user.name  // i.e. add this to a list

twentySomethings.foreach(name => println(name))  // prints Travis Dennis


def foo(n: Int, v: Int) =
  for (i <- 0 until n;
       j <- 0 until n if i + j == v) // Iterate j based on each i
    yield (i, j)

foo(10, 10) foreach {
  case (i, j) =>
    println(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5) (6, 4) (7, 3) (8, 2) (9, 1)
}

// No yield version
def foo2(n: Int, v: Int) =
  for (i <- 0 until n;
       j <- 0 until n if i + j == v)
    println(s"($i, $j)")

foo2(10, 10)