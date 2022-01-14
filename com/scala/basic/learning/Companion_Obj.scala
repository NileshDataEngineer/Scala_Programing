package com.scala.basic.learning

object Companion_Obj {
  /*
   * Companion object is known as an object whose name is same as the name of the class.
   * Or In other words, when an object and a class have the same name,
   *  then that object is known as the companion object and the class is known as companion class.
   */
  /*
   * A companion object is allowed to access both private methods and private fields of the class.
   */
  def main(args: Array[String]) {
    val obj = new Companion_Obj()
    println("Name " + obj.name + " Address " + obj.address)

  }
}
class Companion_Obj {
  private var name = "Nilesh"
  private var address = "Pune"

}