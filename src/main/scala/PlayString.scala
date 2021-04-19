object PlayString extends App {
  val s = "Hello World"
  val c = 'A'

  println(s.take(3))
  println(s.substring(6, 8))
  println(s.slice(6, 8))
  println(s.concat(" This is a book"))
  println(s.patch(5, " Oops", 0))


}
