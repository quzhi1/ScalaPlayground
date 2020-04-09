# ScalaPlayground
This is a playground for Scala

[https://docs.scala-lang.org/tour/tour-of-scala.html](https://docs.scala-lang.org/tour/tour-of-scala.html)

# Basics
- Like JavaScript, `val` can not be re-assigned, `var` can.
- Methods is "functions of other languages"
- Functions is basically anonymous functions
- Unit is basically void
- Instances of case classes are immutable, and they are compared by value (unlike classes, whose instances are compared by reference).
- You can instantiate object without using class
- Traits are basically interfaces

# Types
![](https://docs.scala-lang.org/resources/images/tour/unified-types-diagram.svg)
- Unit is a value type which carries no meaningful information. There is exactly one instance of Unit which can be declared literally like so: ().
- If Scala is used in the context of a Java runtime environment, AnyRef corresponds to java.lang.Object.

![](https://docs.scala-lang.org/resources/images/tour/type-casting-diagram.svg)
- Nothing is a subtype of all types, also called the bottom type. There is no value that has type Nothing. 
- Null is a subtype of all reference types (i.e. any subtype of AnyRef). It has a single value identified by the keyword literal null.

# Classes, tuples and traits
- Traits == Java interface
- Function can return tuple. Tuple type is `TupleN` (N can be 1-22)
- You can compose a class use `class D extends B with C`, where B is concrete class, and C is a trait. In this case, C is usually an optional trait you can plugin.

# Function and methods
- Function & method can both be directly passed into another function as lambda. Just like go.
- Function can also be return type as lambda
- You can define private helper function inside a function  