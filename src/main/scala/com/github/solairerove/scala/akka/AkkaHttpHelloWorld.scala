package com.github.solairerove.scala.akka

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._

object AkkaHttpHelloWorld {
  def main(args: Array[String]): Unit = {

    implicit val actorSystem = ActorSystem("system")
    implicit val actorMaterializer = ActorMaterializer()

    val route = pathSingleSlash {
      get {
        complete {
          "Hello World !"
        }
      }
    }
    Http().bindAndHandle(route, "localhost", 8000)

    println("Server started at 8000")
  }
}
