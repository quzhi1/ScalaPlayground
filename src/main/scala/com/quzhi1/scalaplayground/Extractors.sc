import scala.util.Random

object CustomerID {

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}

val customer1ID = CustomerID("Sukyoung") // Sukyoung--23098234908
// Following also works
// val customer1ID = CustomerID.apply("Sukyoung")
customer1ID match {
  case CustomerID(name) => println(name) // prints Sukyoung
  case _ => println("Could not extract a CustomerID")
}

// Directly extract
val customer2ID = CustomerID("Nico")
val CustomerID(name) = customer2ID
// Following also works
// val name = CustomerID.unapply(customer2ID).get
println(name)  // prints Nico

// Empty match
val CustomerID(name2) = "--asdfasdfasdf"

// Throw error
val CustomerID(name3) = "-asdfasdfasdf"
