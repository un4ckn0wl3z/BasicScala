import java.util.concurrent.{Executors, RejectedExecutionException}

object PlayThread extends App {

//  val runnable = new Runnable {
//    override def run(): Unit = println("in parallel: " + Thread.currentThread().getName)
//  }
//
//  val t0 = new Thread(runnable)
//  val t1 = new Thread(runnable)
//
//  t0.start()
//  t1.start()

//  t0.join() // wait until t0 finish working
//  println("after t0.join")
//
//  val t2 = new Thread(() => {
//    println("inside t2")
//  })
//
//  t2.start()

  // thread pool
  val pool = Executors.newFixedThreadPool(3)
  pool.execute(() => {
    Thread.sleep(1000)
    println("inside pool1")
  })

  pool.execute(() => {
    println("inside pool2")
  })

  pool.execute(() => {
    println("inside pool3")
  })

  pool.shutdown() // not accept new execute

try {
  pool.execute(() => {
    println("inside pool4")
  })
} catch {
  case ex:RejectedExecutionException => println("OK, Rejected")
}
  println(pool.isShutdown)



}
