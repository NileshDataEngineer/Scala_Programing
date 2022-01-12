package com.scala.basic.learning

object Tuple_Example {
  def main(args: Array[String]) {
    /*
     * Tuple is a collection of elements. Tuples are heterogeneous data structures,
     * i.e., is they can store elements of different data types. A tuple is immutable, unlike an array in scala which is mutable.
     */
    /*
     * Max 22 elements we can store in one tuple if we try to add more than 22 it will give an error
     */
    val tuple_one = (1, "Nilesh", true)
    //This way we can access the tuple elements
    println(tuple_one._1)
    println(tuple_one._2)
    println(tuple_one._3)

    println("Iterator on tuple")
    tuple_one.productIterator.foreach(i => println(i))
  }
}