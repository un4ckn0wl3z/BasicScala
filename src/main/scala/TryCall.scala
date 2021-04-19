object TryCall extends App {
  // call by name, call by value

  def byValue(n: Long): Unit = {
    println("by value: " + n)
    println("by value: " + n)
  }

  def byName(n: => Long): Unit = {
    println("by name: " + n)
    println("by name: " + n)
  }

  byValue(System.nanoTime())
  byName(System.nanoTime())

  def measure[T](operation: => T): Long = {
    val time = System.currentTimeMillis()
    operation
    System.currentTimeMillis() - time
  }

  val list = (1 to 10000000).toList
  val usedTime = measure {
    list.map(_ + 1)
  }

  println(usedTime)


}
