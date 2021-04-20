object WaitAndNotify extends App {

  class SimpleContainer {
    private var value: Int = 0
    def isEmpty: Boolean = value == 0
    def get = {
      val result = value
      value = 0
      result
    }

    def set(newValue: Int) = {
      value = newValue
      value
    }
  }

  val container = new SimpleContainer // shared object

  val consumer = new Thread(() => {
    println("consumer is waiting...")
    container.synchronized {
      container.wait() // until get notify from another thread
    }
    println("consumer has consumed: " + container.get)
  })


  val producer = new Thread(() => {
    println("producer is working...")
    Thread.sleep(5000)
    val x = 100
    container.synchronized {
      println("producer has produced: " + container.set(x))
      container.notify()
    }
  })

//  consumer.start()
//  producer.start()


  val bell = new Object // shared object
  (1 to 5).foreach(i => {
    new Thread(() => {
      bell.synchronized {
        println(s"thread $i is waiting...")
        bell.wait()
      }
      // notified
      println(s"thread $i is Ahhhhhhhhhh")


    }).start()
  })

  new Thread(() => {
    Thread.sleep(3000)
    bell.synchronized {
      bell.notifyAll()
    }
  }).start()





}











