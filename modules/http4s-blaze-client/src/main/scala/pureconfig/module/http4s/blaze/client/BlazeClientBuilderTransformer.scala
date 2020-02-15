package pureconfig.module.http4s.blaze.client

import org.http4s.client.blaze.BlazeClientBuilder

import scala.language.higherKinds

private[client] trait BlazeClientBuilderTransformer {
  def apply[F[_]]: BlazeClientBuilder[F] => BlazeClientBuilder[F]
}