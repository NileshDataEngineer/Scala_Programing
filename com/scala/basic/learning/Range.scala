package com.scala.basic.learning

object Ranges {
  def main(args:Array[String]){
    val test=1 to 5
    for (a <- test){
      println("To "+a)
    }
    val testtwo=1 until 5
    for (a <- testtwo){
      println("Until "+a)
    }
    //Creating a Range Using the Method By
    val testthree=1 to 20 by 2
    for(a <- testthree){
      println("By Method "+ a)
    }
  }
}