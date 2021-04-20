import monix.execution.Scheduler.{global => scheduler}

import java.util.concurrent.TimeUnit

object MyScheduler extends App {

  var i = 0
  val cancelable = scheduler.scheduleAtFixedRate(0, 1, TimeUnit.SECONDS, () => {
    println("Hello world!!")
    i += 1
  })

  var flag = true
  while (flag) {
    Thread.sleep(100)
    if (i >= 10) {
      cancelable.cancel()
      flag = false
    }
  }


}
