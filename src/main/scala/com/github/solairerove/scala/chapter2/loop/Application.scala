package com.github.solairerove.scala.chapter2.loop

object Application {
  def main(args: Array[String]): Unit = {
    val array: Array[String] = Array("Some", "cool", "string", "lol", "!11")

    println("While: ")
    writeArrayWithWhile(array)

    println("\n" + "Foreach: ")
    writeArrayWithForeach(array)

    println("\n" + "More conciseness: ")
    writeArrayShortHand(array)

    println("\n" + "Fore expression: ")
    writeArrayWithForeExpression(array)
  }

  def writeArrayWithWhile(array: Array[String]): Unit = {
    var i: Int = 0

    while (i < array.length) {
      println(array(i))
      i += 1
    }
  }

  def writeArrayWithForeach(array: Array[String]): Unit = {
    array.foreach((el: String) => println(el))
  }

  def writeArrayShortHand(array: Array[String]) {
    array.foreach(println)
  }

  def writeArrayWithForeExpression(array: Array[String]): Unit = {
    for (el <- array) println(el)
  }
}
