def listOfDuplicates[A](x: A, length: Int): List[A] = {
  if (length < 1)
    Nil
  else
    x :: listOfDuplicates(x, length - 1) // :: means prepend an element on the left to a list on the right.)
}

println(listOfDuplicates[Int](3, 4))  // List(3, 3, 3, 3)

// you don’t always need to explicitly provide the type parameter
println(listOfDuplicates("La", 8))  // List(La, La, La, La, La, La, La, La)