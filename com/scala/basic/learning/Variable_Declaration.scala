package com.scala.basic.learning

object Variable_Declaration {
  def main(args: Array[String]){
    val x = 10
    var y = 20
    println("First Addition "+ (x+y))
   // x = 11  
    /* # here at line 8 we can see the error because we can not re assign the val variable because val is immutable.
    once we declare we can not change it.*/ 
    y = 21 
    println("Second Addition "+ (x+y))
    
    //y = 22.3
    /* # here at line 14 we can see for var we can change the value but we can not chane its type.
     * eg. first value of y is int so here we can not change value of y int to float.. it will throw an error.
     */
    println("Third Addition "+(x+y)) 
    
    lazy val z = x+y
    
    println("Furth Addition "+(x+y+z))
    
    /*Scala’s String is built on Java’s String and adds additional features such as string interpolation to Java’s String.
Following example illustrates a string literal using $ operator */

    var name="Nilesh Shinde"
    
    println(s"This is ${name}") //This feature we can seen in python also
    
  }
  
}