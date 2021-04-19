object PlayOption extends App {
  val n : Option[Int] = Some(5)
  val n2 : Option[Int] = None

  n match {
    case Some(i) => println(s"Found $i")
    case None => println("Not found")
  }

  println(n.getOrElse(0))
  println(n2.getOrElse(0))

  println(n.map(_ * 2))


}
