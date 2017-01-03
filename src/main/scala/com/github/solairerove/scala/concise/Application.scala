package com.github.solairerove.scala.concise

object Application {
  def main(args: Array[String]): Unit = {
    val myClass = new MyClass(1, "Some string")
    println(myClass)

    val anotherClass = new AnotherClass(2, "Another string")
    println(anotherClass)
  }
}
