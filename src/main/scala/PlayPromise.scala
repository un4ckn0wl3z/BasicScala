import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Promise

object PlayPromise extends App {

  val promise = Promise[Int]()
  promise.future.onComplete {
    case util.Success(value) => println("promise future success: " + value)
    case util.Failure(exception) =>
  }

   new Thread(() => {
     println("fetching the number")
     Thread.sleep(3000)
     promise.success(99)
     println("done")
   }).start()






}
