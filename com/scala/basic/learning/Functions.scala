package com.scala.basic.learning

object Functions {
  def main(args: Array[String]) {
    println("Addition is " + add(2, 3))
    //nano() //Call by name
   // delayed(nano()) //Call by parameter
    notdelayed(nano()) //Call by reference
  }
  /*
   * Scala has both functions and methods. A Scala method is a part of a class that has a name and a signature,
whereas a function in Scala is a complete object that can be assigned to a variable. A function definition can
appear anywhere in a source file.
   */
  def add(a: Int, b: Int): Int =
    {
      val sum = a + b
      return sum
    }
  def nano() = {
    println("In Nano ")
    //print(System.nanoTime())
    System.nanoTime()
  }
  def delayed(t: => Long) = {
    println("In Delayed Method")
    println("Delayed Time is " + t)
    t
  }
  def notdelayed(t: Long) = {
    println("In Not Delayed Method")
    println("Not Delayed Time is " + t)
    t
  }
}
/*
 * Addition is 5
In Nano 
In Nano 
In Delayed Method
Delayed Time is 1331534890138300
 */
//when we not use the => operatior

/*
 *Addition is 5
In Nano 
In Delayed Method
In Nano 
Delayed Time is 1331625989883700
In Nano 
 *  
 */
