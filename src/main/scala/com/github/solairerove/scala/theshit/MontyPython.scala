package com.github.solairerove.scala.theshit

object MontyPython {
  def main(args: Array[String]): Unit = {
    println("Scala")
    piMonteCarlo()
    println("Java")
    MonteCarlo.main()
  }

  def piMonteCarlo(): Unit = {
    def r = math.random()
    println(Seq.fill(100000)(r, r).count{case (a, b) => a * a + b * b < 1} / 250d)
  }
}
