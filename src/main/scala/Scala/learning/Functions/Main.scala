package Scala.learning.Functions

object Main {


  def showName(name : String): Unit = {
    println(s"my name is $name")
  }

  def yourAge(currentYear:Int = 2024,year:Int): Unit = {

    2024 - year
  }

  def main(args: Array[String]): Unit = {


println(showName("hello world "))

    println(yourAge(year=2002))

    var ag :Int =10



println(s"you will 100 in  ${2024 + ( 100 - ag)}year! )")
  }

}
