package com.github.solairerove.scala.impatient.function

object Function {
  def main(args: Array[String]): Unit = {
    fac(3)
    decorate("Dogma")
    sum(1, 2, 3, 4, 5)
    countDown(5)
    prod("qwerty")
  }

  def fac(n: Int): Unit = {
    var r = 1
    for (i <- 1 to n) r = r * i
    println(r)
  }

  def decorate(str: String, left: String = "[", right: String = "]"): Unit = {
    println(left + str + right)
  }

  def sum(args: Int*): Unit = {
    var result = 0
    for (arg <- args) result += arg
    println(result)
  }

  def countDown(n: Int): Unit = {
    for (i <- Range(n, 0, -1)) print(i + " ")
    println()
  }

  def prod(s: String): Unit = {
    var res: Long = 1
    s.foreach(ch => res *= ch)
    println(res)
  }
}
