import scala.collection.parallel.ParSeq

object PlayParallel extends App {

  val capacity = 10
  val seq = 1 to capacity // serial time process
  val parSeq = ParSeq.tabulate(capacity)(i => i) // parallel time process

  println(seq.size)
  println(parSeq.size)

//  seq.foreach(i => print(s"$i, "))
//  println()
//  parSeq.foreach(i => print(s"$i, "))

  def measure[T](op: => T): Long = {
    val start = System.currentTimeMillis()
    op
    System.currentTimeMillis() - start
  }

  val serialTime = measure {
    seq.map(_ + 1)
  }

  val parallelTime = measure {
    parSeq.map(_ + 1)
  }

  println("serialTime = " + serialTime)
  println("parallelTime = " + parallelTime)





}
