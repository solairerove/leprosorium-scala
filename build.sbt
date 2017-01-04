name := "leprosorium"

version := "0.0.1"

organization := "com.github.solairerove"

scalaVersion := "2.12.1"

exportJars := true

packageOptions in(Compile, packageBin) += Package.ManifestAttributes(java.util.jar.Attributes.Name.SEALED -> "true")

mainClass in Compile := Some("com.github.solairerove.scala.chapter1.hello.HelloWorld")
