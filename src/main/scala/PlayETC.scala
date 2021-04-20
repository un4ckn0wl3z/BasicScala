import java.time.Year

object PlayETC extends App {

  // apply

  class Car(val year: Int)

  object Car {
    def apply(year: Int) = new Car(year)
  }

  println(Car(2004).year)
  println(Car.apply(2009).year)

  // *

  def display(arr: Int*) = {
    arr.foreach(println)
  }

  display(12,13,14,15,99,66)

  val s = "*" * 3 // ***

  val arr = Array.tabulate(5)(x => "*" * (x+1)) // *,**,***,****
  arr.foreach(println)

  for (item <- arr) println(item)

  for (i <- 1 to 4) {
    println("*" * i)
  }

  // collection
  // Seq, Set, Map

  // Seq is mother of Array and List

  val seq1: Seq[Int] = Seq(10,30,30)
  seq1.foreach(println)

  println("*" * 20)

  val set1: Set[Int] = Set(10,30,30)
  set1.foreach(println)

  val list = List("apple", "banana")
  val list2 = list.flatMap(_.toUpperCase())
  println(list2)

  println(List(List(1,2), List(3,4)).flatten)

  val lst1 = List(1,2,3).map(x => "*" * x)
  val lst2 = List(1,2,3).map("*" * _)

  println(lst1)
  println(lst2)






}
