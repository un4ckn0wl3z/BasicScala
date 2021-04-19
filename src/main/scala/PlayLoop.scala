object PlayLoop extends App {
  // for loop
  for (i <- 1 to 10 if i%2==0) {
    println(i)
  }

  // for yield
  val v = for (i <- 1 to 5) yield {
    i
  }
  println(v)

  val x = for {
    i <- 1 to 2
    j <- i to 3
  } yield {
    println(s"i = $i, j = $j")
    i * j
  }
  println(x)
  x.foreach(println)

  println("*" * 10)
  // while
  var i = 0
  while (i < 2){
    println(i)
    i = i + 1
  }
  println("*" * 10)
  // do .. while
  i = 0
  do {
    println(i)
    i = i + 1
  } while (i < 2)

}
