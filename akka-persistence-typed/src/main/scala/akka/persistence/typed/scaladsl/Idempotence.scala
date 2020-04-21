/*
 * Copyright (C) 2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.persistence.typed.scaladsl

case class Idempotence[Command](idempotentWhen: Command => Boolean, idempotenceKey: Command => String)
