package com.github.solairerove.scala.impatient.basic

import scala.math._
import BigInt.probablePrime
import util.Random

object Basic {
  def main(args: Array[String]): Unit = {
    println(5 + 2)
    println(5.+(3))
    println(1 to 10)
    println(sqrt(2))
    println(pow(2, 4))
    println("crazy" * 3)
    println(BigInt(123456789) * BigInt(123465789))
    println(BigInt(2).pow(1024))
    println(max(2, 10))
    println(probablePrime(100, Random))

    val s = "Hell YEAH 1!"

    println(s(2))
    println(s.last)
    println(s.head)
    println(s.take(2))
    println(s.drop(3))
    println(s.takeRight(4))
    println(s.dropRight(2))
    s.foreach(println)
    for (el <- s) println(el)
    s.foreach(el => println(el))
  }
}
