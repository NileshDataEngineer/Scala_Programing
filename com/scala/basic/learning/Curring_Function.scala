package com.scala.basic.learning

object Curring_Function {
  def add(a: Int) = (b: Int) => a + b
  def main(args: Array[String]) {
    print("Curring Function " + add(10)(20))
  }
}