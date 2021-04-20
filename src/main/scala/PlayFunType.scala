object PlayFunType extends App {

  val addFunc = (x: Int, y: Int) => x + y // lamda
  println(addFunc(10, 20))

  val add5 = (x: Int) => addFunc(x, 5)
  println(add5(50))

  val addF = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  println(addF(10))

  val addF2 = new ((Int, Int) => Int) { // syntactic sugar
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  println(addF2(10, 30))

  def concat: (String, String) => String = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(concat("Anuwat", ".k"))



}
