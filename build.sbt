organization := "com.github.solairerove"

name := "scala-leprosorium"

version := "0.0.1"

scalaVersion := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

exportJars := true

packageOptions in(Compile, packageBin) += Package.ManifestAttributes(java.util.jar.Attributes.Name.SEALED -> "true")

mainClass in Compile := Some("com.github.solairerove.scala.chapter1.hello.HelloWorld")

libraryDependencies ++= {
  val sprayV = "1.3.4"
  val akkaV = "2.3.9"

  Seq(
    "io.spray"          %% "spray-can"              % sprayV,
    "io.spray"          %% "spray-routing"          % sprayV,
    "com.typesafe.akka" %% "akka-actor"             % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental" % "1.0"
  )
}
