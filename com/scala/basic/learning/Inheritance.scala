package com.scala.basic.learning

class vahical {
  var colour = "Black"
  val name = "Baleno"
}
class car extends vahical {
  /*
   * Here we want to change the value of variable name which is belong to parent class.
   * In this scenario we need to override the name.
   */
  override val name = "Honda City"
  
  def show() {
    println("Name of Colour of Car " + colour)
    println("Name of Car " + name)

  }
}
object Inheritance {
  def main(args: Array[String]) {
    var obj = new car()
    obj.show()
  }
}