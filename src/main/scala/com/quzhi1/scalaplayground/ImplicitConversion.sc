import scala.language.implicitConversions

implicit def list2ordered[A](x: List[A])
                            (implicit elem2ordered: A => Ordered[A]): Ordered[List[A]] =
  new Ordered[List[A]] {
    //replace with a more useful implementation
    def compare(that: List[A]): Int = 1
  }

implicit def int2Integer(x: Int) =
  java.lang.Integer.valueOf(x)