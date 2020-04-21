package akka.persistence.journal

import scala.concurrent.Future

trait AsyncIdempotency {

  def asyncCheckIndempotencyKeyExists(persistenceId: String, key: String): Future[Boolean]
}
