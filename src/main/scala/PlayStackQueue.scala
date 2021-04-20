object PlayStackQueue extends App {

  var s = collection.mutable.Stack[Int]()
  s.push(1)
  s.push(10)
  println(s.top)

  val data = s.pop()
  println(data)
  println(s.top)
  println(s.pop())

  println(s.isEmpty)

  var q = collection.mutable.Queue[String]()

  q.enqueue("Anuwat")
  q.enqueue("Pansa")

  val next = q.dequeue()

  println(next)
  println(q)
  println(q.dequeue())
  println(q.isEmpty)











}
