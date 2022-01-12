package com.scala.basic.learning

object Functions {
  def main(args:Array[String]){
    println("Addition is "+add(2,3))
  }
  /*
   * Scala has both functions and methods. A Scala method is a part of a class that has a name and a signature,
whereas a function in Scala is a complete object that can be assigned to a variable. A function definition can
appear anywhere in a source file.
   */
  def add(a:Int,b:Int):Int=
  {
    val sum=a+b
    return sum
  }
}