println("/////////// Drive type inference ///////////")

//def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B): B
val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//def firstWay = foldLeft1[Int, Int](numbers, 0, _ + _)
//def secondWay = foldLeft1(numbers, 0, (a: Int, b: Int) => a + b)

println("/////////// Implicit parameters ///////////")

//def execute(arg: Int)(implicit ec: scala.concurrent.ExecutionContext)

println("/////////// Partial application ///////////")

val numberFunc = numbers.foldLeft(List[Int]()) _

val squares = numberFunc((xs, x) => xs :+ x*x)
println(squares) // List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

val cubes = numberFunc((xs, x) => xs :+ x*x*x)
println(cubes)  // List(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000)