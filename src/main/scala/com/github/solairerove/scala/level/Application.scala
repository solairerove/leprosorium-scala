package com.github.solairerove.scala.level

object Application {
  def main(args: Array[String]): Unit = {
    val name = "Some string"

    val nameHasUpperCase = name.exists(_.isUpper)
    println(nameHasUpperCase)

    println(UpperCaseUtil.nameHasUpperCase(name))
    println(UpperCaseUtil.nameHasUpperCaseLambdaStyle(name))
  }
}
