println("/////////// Lambdas ///////////")
val salaries = Seq(20000, 70000, 40000)

// Round 1
val doubleSalary = (x: Int) => x * 2
var newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)

// Round 2
newSalaries = salaries.map(x => x * 2) // List(40000, 140000, 80000)

// Round 3
newSalaries = salaries.map(_ * 2) // List(40000, 140000, 80000)

println("/////////// Coercing methods into functions ///////////")

case class WeeklyWeatherForecast(temperatures: Seq[Double]) {

  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // <-- passing the method convertCtoF
}

println("/////////// Functions that accept functions ///////////")

object SalaryRaiser {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)
}

println("/////////// Functions that return functions ///////////")

def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
  val schema = if (ssl) "https://" else "http://"
  (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
}

val domainName = "www.example.com"
def getURL = urlBuilder(ssl = true, domainName)
val endpoint = "users"
val query = "id=1"
val url = getURL(endpoint, query) // "https://www.example.com/users?id=1": String

println("/////////// Recursive ///////////")
def factorial(x: Int): Int = {
  def fact(x: Int, accumulator: Int): Int = {
    if (x <= 1) accumulator
    else fact(x - 1, x * accumulator)
  }

  fact(x, 1)
}

println("Factorial of 2: " + factorial(2))
println("Factorial of 3: " + factorial(3))
