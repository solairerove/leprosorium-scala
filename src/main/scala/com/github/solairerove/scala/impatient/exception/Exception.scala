package com.github.solairerove.scala.impatient.exception

import java.io.IOException

object Exception {
  def main(args: Array[String]): Unit = {
    try {
      sqrtProcedure(5)
    } catch {
      case ex: IOException => ex.printStackTrace()
    }
  }

  def sqrtProcedure(x: Double): Unit = {
    if (x >= 0) {
      println(scala.math.sqrt(x))
    } else throw new IllegalArgumentException("x should not be negative")
  }
}
