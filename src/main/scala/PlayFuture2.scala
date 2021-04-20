import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object PlayFuture2 extends App {

  val f1 = Future {
    3
  }

  val f2 = Future {
    6
  }

  // for-comprehensive

  val sumf = for {
    a <- f1
    b <- f2
  } yield a + b

  sumf.onComplete {
    case util.Success(value) => println("sum = " + value)
    case util.Failure(exception) =>
  }

  Thread.sleep(100)



}
