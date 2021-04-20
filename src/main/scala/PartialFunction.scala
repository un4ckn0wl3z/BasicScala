object PartialFunction extends App {

  val aPartialFunction: Int => Int = { // match pattern
    case 1 => 10
    case 2 => 20
  }

  println(aPartialFunction(1))
  // println(aPartialFunction(3))


  val aPF = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = {
      x == 1 || x == 2
    }

    override def apply(v1: Int): Int = v1 match {
      case 1 => 10
      case 2 => 20
    }
  }

  println(aPF(2))
  println(aPF.isDefinedAt(5))

  val result = if (aPF.isDefinedAt(3)) aPF(3) else 0

  println(result)


  val aPF2: PartialFunction[Int, String] = {
    case 1 => "One"
    case 2 => "Two"
  }

  println(aPF2(1))

  def pf(x: Int) : Int  = x match {
    case 1 => 10
    case 2 => 20
  }

  println(pf(1))

  val chatbot: PartialFunction[String, String] = {
    case "hi" => "Hi my name is ROX"
    case _ => "I dont get it"
  }

  io.Source.stdin.getLines().foreach( line => println(chatbot(line)))




}
