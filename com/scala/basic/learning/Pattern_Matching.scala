package com.scala.basic.learning

object Pattern_Matching {
  def main(Args:Array[String]){
    print_num(-10)
    var anyList=List("Nilesh",1,3,5.3,"Pune",'a')
    for (a <- anyList){
      type_check(a)
    }
  }
  def print_num(a:Int){
    a match{
      case 0|10|20 => println("Zero")
      case a if a <= 0   => println("Its less than 1 value")
      case 2 => println("Two")
      case _ => println("Other than 0,1,2")
    }
  }
  def type_check(a:Any){
    a match{
      case i:Int => println("Its Integer")
      case j:String => println("Its String")
      case k:Double => println("Its Float")
      case other => println("Not Identified "+other)
    }
  }
}