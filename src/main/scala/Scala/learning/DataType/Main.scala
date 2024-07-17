package Scala.learning.DataType

object Main {

  def main(args: Array[String]): Unit = {

    var A : Int = 10
val B : Int =11
    println(A)
    println(B)


    // what is the diffrence between var and val
    // var is not imutable data type , that means we can change the value

   // B = 2 is not allowed
   //A=3

// we can define a new variable without giving data type

var C = true
  // so it will automatically define it as an Boolean variable


  val x ={var y : Int = 800 ; var z : Int = 200 ; z+y }

    println (x)
val q = {
  var w :Int=500
  var e : Int=500
  w+e
}
    println(q)

// what is lazy , the lazy datatype is used unassign an value in the memory  unless we use the variable or used
    lazy val Y = 500

    println(Y)

    println(Y+800)



    val Mo = "mohammad"

      println(Mo.getClass)


  }
}