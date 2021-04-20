object PlayTupleAndMap extends App {

  // Tuple

  val t1 = (10, "Name1", "LastName1")
  println(t1._1)
  println(t1._2)
  println(t1._3)

  val t2 = t1.copy(_2 = "Name2")
  println(t2._1)
  println(t2._2)
  println(t2._3)

  // Map

  val dict: Map[Int,String] = Map((1,"One"), 2 -> "Two")
  println(dict)
  println(dict.keys)
  dict.values.foreach(println)

  val newPair = (3, "Three")
  val newDict = dict + newPair
  println(newDict.contains(3))
  println(newDict)

  val phonebook: Map[String, String] = Map("Anuwat" -> "0612400xxx")






}
