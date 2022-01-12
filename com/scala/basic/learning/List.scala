package com.scala.basic.learning
import scala.collection.immutable._

object List_Example {
  def main(args:Array[String]){
    val books: List[String] = List("Scala","Java","Python","Spark")
    println(books.head)
    print(books.tail)
  }
}