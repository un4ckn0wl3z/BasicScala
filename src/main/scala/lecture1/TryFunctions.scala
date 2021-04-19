package lecture1

object TryFunctions extends App {
  def mySum(a: Int, b: Int): Int = {
    println("In my sun func")
    a + b
  }


  def multiply(a: Int, b: Int): Int = a * b

  def hello(name: String, id: Int): Unit = {
    // side effect
    println("Hello " + name)
  }

  println(mySum(10,20))

  hello("Anuwat", id = 1)
  hello(id = 2, name = "John")
  println(multiply(5, 5))
}
