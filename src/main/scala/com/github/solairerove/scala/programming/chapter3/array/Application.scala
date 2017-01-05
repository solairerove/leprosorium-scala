package com.github.solairerove.scala.programming.chapter3.array

object Application {
  def main(args: Array[String]): Unit = {
    val array = Array.apply("Hello ", "World", "!")
    array.foreach(print)
  }
}
