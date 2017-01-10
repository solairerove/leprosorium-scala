name := "scala-leprosorium"
organization := "com.github.solairerove"
version := "0.0.1"

scalaVersion := "2.12.1"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.4.16"
  val akkaHttpV = "10.0.1"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-http" % akkaHttpV
  )
}

Revolver.settings
enablePlugins(JavaAppPackaging)
