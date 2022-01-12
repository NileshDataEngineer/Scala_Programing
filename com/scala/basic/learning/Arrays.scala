package com.scala.basic.learning

object Arrays {
  def main(args:Array[String]){
    //var books:Array[String]=new Array[String](5)
    var books=Array("Nilesh","Swati","Shreya","Sandeep","Sumit")
    
    println("Print the array elements")
    printArray(books)
    
    println("Access the array elements")
    
    println("Array Element "+books(0))
    
    books(1)="Reyansh"
    
    println("Array elements after the replacment")
    
    printArray(books)
    
    
  }
   def printArray(books:Array[String]){
    for(a <- books){
      println("Array Values : "+a)
    }
  }
}