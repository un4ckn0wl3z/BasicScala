object ListArrayTuple extends App {

  // tuple
  val res0 = (10,20,30,40)
  println(res0._1)

  // array -> mutable
  val res1 = Array(10,20,30,40)

  println(res1(2))
  res1(0) = 100
  println(res1.indexOf(100))
  println(res1.product)
  println(res1.sum)
  println(res1.max)
  println(res1.min)


  // list -> immutable

  val res2 = List(3,5,7,9)
  println(res2.size)
  val res3 = res2.appended(11)
  println(res3.filter(x => x > 6))

  val res4 = res1.map(i => i+1)
  println(res4.toList)




}
