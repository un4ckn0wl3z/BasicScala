object PlayRegexAndRandom extends App {

  val numPattern = "[0-9]+".r
  val address = "123/4 Moo.10 Bangkok 1000"
  println(numPattern.findFirstIn(address).get)

  numPattern.findAllIn(address).foreach(println)
  println("*" * 50)
  val r = util.Random
  println(r.nextInt(100))
  println(r.nextInt(100))
  println(r.nextInt(100))
  println(r.nextInt(100))



}
