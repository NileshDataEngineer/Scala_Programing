package com.scala.basic.learning

object Closure_Function {
  /*
   * Closure functions are they take only one input and do the calculation depending on
   *  variable which are declared outside the scope.
   */
  var y = 10
  def main(args: Array[String]) {
    println("Clusure Function Value is " + add(10))
  }
  def add(x: Int) = x + y
}