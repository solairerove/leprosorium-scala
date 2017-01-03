package com.github.solairerove.scala.small

object SmallProgram {
  def main(args: Array[String]): Unit = {
    var capital = Map("US" -> "Washington", "France" ->  "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("Japan"))
  }
}
