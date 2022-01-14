package com.scala.basic.learning

import scala.annotation.tailrec
/*
 * This tail recursion function(added the anotation @tailrec) this is ouptimised compaire to normal recursion function
 */
object Recursion_Function {
  def add(a: Int, b: Int): Int =
    {
      /*
	   * One problem associated with using recursive functions is that invoking a recursive function too many
times leads to stack-overflow error. The Scala compiler can optimize recursive functions with tail recursion
so that recursive calls do not use all the stack space, therefore not running into stack-overflow error
	   */
      @tailrec def add(x: Int, y: Int): Int =
        {
          if (y == 0) x
          else add(y, x % y)
        }
      add(a, b)
      /*
       * for tailrec one condition is there.. functions last statement should be the recursion call if not it will throw compilation error
       */
    }
  def main(args: Array[String]) {
    println(add(12, 12))
  }
}