object PlayCaseClass extends App {
  case class Book(id: Int, name: String, author: String)

  val b1 = Book(1, "Onepiece", "Oda")
  val b2 = Book(2, "Scala Programming", "Martin")

  b1 match {
    case Book(1, _, _) => println("this is Onepiece")
    case Book(_, _, "Martin") => println("this is Scala Programming")
    case _ => println("Not match")
  }


}
