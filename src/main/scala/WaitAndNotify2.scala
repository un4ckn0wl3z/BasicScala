import scala.collection.mutable

object WaitAndNotify2 extends App {

  val q = new mutable.Queue[Int]()
  val capacity = 3
  val r = util.Random

  val consumer = new Thread(() => {
    while (true){
      q.synchronized {
        if (q.isEmpty) {
          println("[consumer] q is empty, waiting producer...")
          q.wait()
        }
        // not empty
        val value = q.dequeue()
        println("[consumer] consumed " + value)
        q.notify() // wake producer up

      }
      Thread.sleep(r.nextInt(500))
    }
  })

  //

  val producer = new Thread(() => {
    var i: Int = 0

    while (true) {
      q.synchronized {
        if (q.size == capacity) {
          println("[producer] q is full, waiting consumer")
          q.wait()
        }
        // q not full
        q.enqueue(i)
        println("[producer] produced " + i)
        i += 1
        q.notify() // hey consumer
      }
      Thread.sleep(r.nextInt(500))

    }


  })

  consumer.start()
  producer.start()

}
