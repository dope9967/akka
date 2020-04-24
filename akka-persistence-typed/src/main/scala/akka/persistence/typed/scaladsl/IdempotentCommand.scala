/*
 * Copyright (C) 2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.persistence.typed.scaladsl

import akka.actor.typed.ActorRef

trait IdempotentCommand {
  val idempotencyKey: String
  val replyTo: ActorRef[IdempotenceReply]
}

trait IdempotenceReply
case object IdempotenceFailure extends IdempotenceReply
