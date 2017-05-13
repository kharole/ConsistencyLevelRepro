package controllers

import javax.inject.Inject

import akka.actor.{Actor, ActorLogging, ActorRef, ActorSystem, Props}
import akka.persistence.{PersistentActor, RecoveryCompleted}
import akka.stream.Materializer
import play.api._
import play.api.mvc._

class Application @Inject()(implicit system: ActorSystem, materializer: Materializer) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  val reproActor = system.actorOf(ReproActor.props, "repro-actor")

  object ReproActor {
    def props = Props(new ReproActor("repro-1"))
  }

  class ReproActor(pid: String) extends PersistentActor {

    override def receiveRecover: Receive = {
      case _ =>
    }

    override def receiveCommand: Receive = {
      case _ =>
    }

    override def persistenceId: String = pid
  }

}