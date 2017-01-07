package com.github.solairerove.scala.impatient.array

import scala.collection.mutable.ArrayBuffer

object Application {
  def main(args: Array[String]): Unit = {
    fixedArray()
    variableLengthArray()
    traversingArray()
    transformArray()
  }

  def fixedArray(): Unit = {
    val s = Array("Hello", " ", "World", " ", "!")

    s.foreach(print)
    println(s(4))
  }

  def variableLengthArray(): Unit = {
    val s = ArrayBuffer[Int]()

    s += 1
    s += (2, 3, 4)
    s ++= Array(5)
    println(s)
  }

  def traversingArray(): Unit = {
    val s = Array("Hello", " ", "World", " ", "!")

    for (i <- (0 until(s.length, 2)).reverse) println(i + " -> " + s(i))
    for (el <- s) print(el)
    println()
  }

  def transformArray(): Unit = {
    val array = ArrayBuffer[Int]()
    for (i <- 0 to 10) array += i

    val result = for (el <- array if el % 2 == 0) yield el * 2
    println(result)
  }
}
