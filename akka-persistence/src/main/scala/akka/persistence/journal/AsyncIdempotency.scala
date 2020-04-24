/*
 * Copyright (C) 2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.persistence.journal

import scala.concurrent.Future

trait AsyncIdempotency {

  def asyncCheckIndempotencyKeyExists(persistenceId: String, key: String): Future[Boolean]
}
