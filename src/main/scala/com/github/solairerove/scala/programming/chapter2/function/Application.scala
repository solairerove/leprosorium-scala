package com.github.solairerove.scala.programming.chapter2.function

object Application {
  def main(args: Array[String]): Unit = {
    println(max(3, 5))
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
}
