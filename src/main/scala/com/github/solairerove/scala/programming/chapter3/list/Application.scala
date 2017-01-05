package com.github.solairerove.scala.programming.chapter3.list

object Application {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    println(oneTwo ::: threeFour)
    val array = 1 :: threeFour

    array.foreach(el => print(el))
  }
}
