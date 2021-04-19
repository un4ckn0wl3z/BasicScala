object TryDefault extends App {
  def hello(name: String = "unknow", id: Int = 0) : Unit = {
    println("Hello " + name + ", id: " + id)
  }

  hello("Anuwat", 30) // name args
  hello() // default args
}
