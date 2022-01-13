package com.scala.basic.learning

class Book {
  var firstBooK = "Scala"
  var secondBook = "Java"

}
object Book_Main {
  def main(args: Array[String]) {

    var obj = new Book()
    println("First Book is " + obj.firstBooK + "  & Second Book is " + obj.secondBook)
  }
}