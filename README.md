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
- Null is a subtype of all reference types (i.e. any subtype of AnyRef). It has a single value identified by the keyword literal `null`.
- Nil is empty collection. So `Nil != null`

# Classes, tuples and traits
- Traits == Java interface
- Function can return tuple. Tuple type is `TupleN` (N can be 1-22)
- You can compose a class use `class D extends B with C`, where B is concrete class, and C is a trait. In this case, C is usually an optional trait you can plugin.
- Case class is a very good way to do immutable class
- Traits and classes can be marked sealed which means all subtypes must be declared in the same file.
- An object with the same name as a class is called a companion object. Conversely, the class is the object’s companion class.

# Function and methods
- Function & method can both be directly passed into another function as lambda. Just like go.
- Function can also be return type as lambda
- You can define private helper function inside a function

# Object
- Can do singleton class
- Can do static class method
- Can do factory method
- `.apply` construct an object; `.unapply` extract an object
- The return type of an `unapply` should be chosen as follows:
    - If it is just a test, return a `Boolean`. For instance `case even()`.
    - If it returns a single sub-value of type T, return an `Option[T]`.
    - If you want to return several sub-values T1,...,Tn, group them in an optional tuple `Option[(T1,...,Tn)]`.

# Classes relationship
- This article explains how scala can delete variance fault in compile time: [Scala与Java之间的型变对比 - 映柳枫鹏的文章 - 知乎](https://zhuanlan.zhihu.com/p/96822693) and [scala 逆变有什么用? - 夏梓耀的回答 - 知乎](https://www.zhihu.com/question/35339328/answer/62632559).
- Variances is used for defining relationship between super-types. If A < B, then it defines the relations of List[A] and List[B].
- Upper type bound makes generic super class possible, e.g. List[T].
- Lower type bound makes generic child class possible. It usually works with covariant type.
- Suppose class B has an inner class A, class C also has an inner class A. In Java, `B.A == C.A`. In scala, `B.A == C.A`.
- `trait` and `abstract class` can have generic too.
- In Java, `A implements B, C`. In scala, `A with B with C` (Since you can't do `A extends B, C`).

 