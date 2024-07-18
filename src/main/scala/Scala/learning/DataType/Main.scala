package Scala.learning.DataType

import scala.io.StdIn.readLine

object ScalaDataTypesTutorial {

  def main(args: Array[String]): Unit = {

    // Examples of all basic data types in Scala

    // Byte: 8-bit signed integer
    val byteVal: Byte = 127
    println(s"Byte Value: $byteVal")

    // Short: 16-bit signed integer
    val shortVal: Short = 32767
    println(s"Short Value: $shortVal")

    // Int: 32-bit signed integer
    val intVal: Int = 2147483647
    println(s"Int Value: $intVal")

    // Long: 64-bit signed integer
    val longVal: Long = 9223372036854775807L
    println(s"Long Value: $longVal")

    // Float: 32-bit IEEE 754 floating-point
    val floatVal: Float = 3.14F
    println(s"Float Value: $floatVal")

    // Double: 64-bit IEEE 754 floating-point
    val doubleVal: Double = 3.141592653589793
    println(s"Double Value: $doubleVal")

    // Char: 16-bit unsigned Unicode character
    val charVal: Char = 'A'
    println(s"Char Value: $charVal")

    // String: A sequence of characters
    val stringVal: String = "Hello, Scala!"
    println(s"String Value: $stringVal")

    // Boolean: true or false
    val booleanVal: Boolean = true
    println(s"Boolean Value: $booleanVal")

    // Unit: Corresponds to no value (similar to void in Java)
    val unitVal: Unit = println("This is a Unit type")

    // Any: The root of the Scala type hierarchy
    val anyVal: Any = "Can be any type"
    println(s"Any Value: $anyVal")

    // AnyRef: The base type of all reference types
    val anyRefVal: AnyRef = "Reference type"
    println(s"AnyRef Value: $anyRefVal")

    // AnyVal: The base type of all value types
    val anyValVal: AnyVal = 123
    println(s"AnyVal Value: $anyValVal")

    // Null: The null reference
    val nullVal: String = null
    println(s"Null Value: $nullVal")

    // Nothing: Subtype of every other type (useful for throwing exceptions)
    def nothingVal: Nothing = throw new RuntimeException("This is Nothing type")

    // Option: Represents optional values (either Some or None))
    val someVal: Option[Int] = Some(5)
    val noneVal: Option[Int] = None
    println(s"Some Value: $someVal")
    println(s"None Value: $noneVal")

    // List: An immutable sequence
    val listVal: List[Int] = List(1, 2, 3, 4, 5)
    println(s"List Value: $listVal")

    // Map: A collection of key-value pairs
    val mapVal: Map[String, Int] = Map("one" -> 1, "two" -> 2)
    println(s"Map Value: $mapVal")

    // Tuple: Can hold a fixed number of items of different types
    val tupleVal: (Int, String, Boolean) = (1, "Scala", true)
    println(s"Tuple Value: $tupleVal")

    // Examples of var, val, lazy val, and user input

    var a: Int = 10
    val b: Int = 11
    println(a)
    println(b)

    /**
     * The difference between `var` and `val`:
     * - `var` is a mutable variable, meaning its value can be changed.
     * - `val` is an immutable variable, meaning its value cannot be changed once assigned.
     */
    a = 3  // This is allowed as `a` is mutable

    // We can define a new variable without specifying its data type
    var c = true
    // The type will be automatically inferred as Boolean

    val x = {
      var y: Int = 800
      var z: Int = 200
      z + y
    }
    println(x)

    val q = {
      var w: Int = 500
      var e: Int = 500
      w + e
    }
    println(q)

    /**
     * `lazy val`: The value is not assigned in memory until it is accessed.
     */
    lazy val y = 500
    println(y)
    println(y + 800)

    val name = "exampleName"
    println(name.getClass)
    // To know the type of the variable `name`

    /**
     * Reading input from the user:
     * It reads the input as a String, so we need to convert it to an integer
     * to perform any mathematical operations.
     */
    val userInput = readLine("Think about a number: ").toInt
    val result = userInput * userInput
    println(s"Your number was $userInput, and when multiplied by itself: $result")
  }
}
