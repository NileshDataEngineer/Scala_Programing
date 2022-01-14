package com.scala.basic.learning

object Function_Composition {
  /*
   * Function composition is a way in which a function is mixed with other functions.
   * During the composition the one function holds the reference to another function in order to fulfill it’s mission.
   */
  def main(args: Array[String]) {
    println((add compose mis)(10))
    println((add compose mis compose mul)(10))
  }
  val add = (a: Int) => { a + 10 }
  val mis = (a: Int) => { a - 2 }
  val mul = (a: Int) => { a * 2 }
}