package com.github.solairerove.scala.impatient.function

object Conditional {
  def main(args: Array[String]): Unit = {
    println(max(10, 5))
  }

  def max(x: Int, y: Int): Int = {
    if(x > y) x else y
  }
}
