package com.github.solairerove.scala.spray

import spray.routing.{HttpService, Route}

trait MyService extends HttpService {
  val myApiRoute: Route =
    get {
      complete("Hello World!")
    }
}
