object PlaySingleton extends App {
  // singleton = static class

  class Book {
    println("inside book")

  }

  object Car {
    println("inside car")
  }

  object Calculator {
    def Add(a: Int, b: Int): Int = {
      a + b
    }

    def Add(a: Int, b: Int, c: Int): Int = {
      a + b + c
    }
  }

  Car
  new Book
  // overload
  println(Calculator.Add(10, 3))
  println(Calculator.Add(10, 3, 24))



}
