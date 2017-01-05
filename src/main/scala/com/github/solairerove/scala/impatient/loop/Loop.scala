package com.github.solairerove.scala.impatient.loop

object Loop {
  def main(args: Array[String]): Unit = {
    val string: String = "Some AWESOME cool string"

    for (i <- 0 to string.length) print(i + " ")

    println()
    for (i <- 0 until string.length) print(string(i))

    println()
    for (s <- string) print(s)

    println()
    string.foreach(s => print(s))

    // some fucking rich shit for comprehensions

    println()
    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")

    println()
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")

    println()
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")

    println()
    for (i <- 1 to 10) yield i % 3
  }
}
