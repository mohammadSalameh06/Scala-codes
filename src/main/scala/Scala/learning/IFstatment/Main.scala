package Scala.learning.IFstatment

object Main {

  def main(args: Array[String]): Unit = {


    var x = 300
    var z = 400

    // to check variables are equal to eac other
/*
    if (z==x) {
      println("they are equal to equal to each other ")
    }
    else{
      println("they are not equal to each other")
    }
*/



 if (x!=z && x<z ) {

   println("z is not equal to x , and z is greater than x ")
 }
 else if (x==z && x>z){
   println("x is  equal to z , and x is greater than z ")


 }
  }

}
