package com.github.solairerove.scala.impatient.array

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object Application {
  def main(args: Array[String]): Unit = {
    fixedArray()
    variableLengthArray()
    traversingArray()
    transformArray()
    commonAlgorithms()
    randomArray(5)
    adjacentTransform()
    positiveNegative()
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

    var result = for (el <- array if el % 2 == 0) yield el * 2
    println(result)

    result = array.filter(_ % 2 == 0).map(2 * _)
    println(result)

    result = array filter {
      _ % 2 == 0
    } map {
      2 * _
    }
    println(result)

    val fuckAlgorithm = new DeleteAllNegativeButTheFirst()
    fuckAlgorithm.deleteAllNegative()
    val javaResult = fuckAlgorithm.getArray
    println(javaResult)

    val a = ArrayBuffer.apply(0, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5)
    val indexes = for (i <- a.indices if a(i) < 0) yield i
    for (j <- (1 until indexes.length).reverse) a.remove(indexes(j))
    println(a)
  }

  def commonAlgorithms(): Unit = {
    println(Array(1, 2, 3, 4, 5).sum)
    println(ArrayBuffer("Mary", "had", "a", "little", "lamb").max)
    println(ArrayBuffer(1, 2, 3, 4, 5).sortWith(_ > _))

    val a = Array(5, 4, 3, 2, 1)
    scala.util.Sorting.quickSort(a)
    a.foreach(print)
    println()
    println(a.mkString(" and "))
    println(a.mkString("<", ",", ">"))
  }

  def randomArray(n: Int): Unit = {
    val array = Array[Int](n)
    for (i <- array.indices) array(i) = Random.nextInt(n)
    println("Random array: " + array.mkString("<", ",", ">"))
  }

  def adjacentTransform(): Unit = {
    val array = Array(1, 2, 3, 4, 5)

    val result = for (i <- array.indices)
      yield if (i % 2 == 0)
        if (i < array.length - 1) array(i + 1) else array(i)
      else
        array(i - 1)

    println("Adjacent: " + result)
  }

  def positiveNegative(): Unit = {
    val array = Array(10, 7, -5, 11, -44, 0, 22, -22, -100, 77, -5)
    val result = array.filter(_ > 0) ++ array.filter(_ <= 0)

    print("Positive negative: ")
    for (el <- result) print(el + " ")
    println()
  }
}
