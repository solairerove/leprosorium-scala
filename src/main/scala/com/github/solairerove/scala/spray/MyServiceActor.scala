package com.github.solairerove.scala.spray

import akka.actor.{Actor, ActorContext}

class MyServiceActor extends Actor with MyService {

  def actorRefFactory: ActorContext = context

  def receive: Receive = runRoute(myApiRoute)
}
