package Scala.learning.Strings

import java.util.Calendar
import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    val username = "mohammad"

    /**
     * accessing the string letter by letter using loop or substring
     */
    /**
     * == Remove the comments ==
     * println(username.substring(0,5))
     * for (l <- username)
     * print(l)
     */


    /**
     * searching in strings
     * @return true or false
     */
    //////////////////////////////////////////////////
    /**
     * == Remove the comments ==
     * println(username.endsWith("ad"))
     * println(username.endsWith("mmad"))
     * println(username.endsWith("a"))
     * println(username.contains("ad"))
     * println(username.contains("mmad"))
     * println(username.contains("a"))
     * println(username.startsWith("ad"))
     * println(username.startsWith("mmad"))
     * println(username.startsWith("a"))
     */






    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.DATE)

    print("Hello! Please enter your name: ")
    val name = readLine()

    println(s"Hello $name! The current year is $currentYear.")
  }
}
