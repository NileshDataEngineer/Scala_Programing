package com.scala.basic.learning

object Yield_Example {
  def main(args: Array[String]) {
    val sample = 1 to 10
    val yield_sample = for (a <- sample) yield a
    for (x <- yield_sample) {
      println("yield_sample Value is " + x)
    }

    val ary_sample=Array(1,2,3,4,5,6,7,8,9,10)
    val yield_ary=for(a <- ary_sample if a > 5 ) yield a
    
    for(a <- yield_ary){
      println("yield_ary Print the value of "+a)
    }
  }
}