object PlayMatch extends App {
  // pattern matching
  val i = 3
  (i) match {
    case 10 => println("yeah i=10")
    case 2 => println("not 10")
    case _ =>
  }

  val t = (10, "Name")
  println(t._1 + " " + t._2)


  t match {
    case (10, _) => println("Number and Something")
    case (_, "") => println("case 2")
    case (_, "Name") => println("case 3")
    case _ => println("case 4")
  }


  val fb = for (i <- 1 to 20) yield {
    (i%3, i%5) match {
      case (0, 0) => i+"fizzbuzz"
      case (0, _) => i+"fizz"
      case (_, 0) => i+"buzz"
      case _ => i+""
    }
  }

  println(fb)





}
