import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
object PlayFuture extends App {

 val f = Future {
    println("print this text in near future")
  }
  // Await.result(f, 1.second)

  println("Hi")
  println("there!")

  val myFuture = Future { //Future[Int]
    Thread.sleep(1000)
    100
    throw new RuntimeException("let's fail")
  }
  myFuture.onComplete {
    case util.Success(value) => println("Success value = " + value)
    case util.Failure(exception) => exception match {
      case ex:Exception => println("got exception: " + ex.getMessage)
    }
  }
  //println(myFuture)
  Thread.sleep(1100)





}
