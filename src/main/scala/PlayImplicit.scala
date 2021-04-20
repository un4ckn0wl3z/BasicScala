object PlayImplicit extends App {

  // simple 1
  case class Person(name: String) {
    def greet : String = s"Hi $name"
  }

  implicit def toPerson(str: String) : Person = Person(str)

  println("Anuwat".greet)

  // simple 2

  def decrease(a:Int)(b:Int) : Int = a - b
  println(decrease(10)(5)) // 5

  def increase(a:Int)(implicit amount: Int) : Int = a + amount
  implicit val defaultAmount = 10
  println(increase(2)) // 12


  // simple 3

  implicit class RichInt(value: Int){
    def isEven: Boolean = value % 2 == 0
    def sqrt: Double = Math.sqrt(value)
  }

  println(10.isEven)
  println(10.sqrt)

  // simple 4

  implicit def strToInt(str: String): Int = Integer.valueOf(str)

  println("500" / 4)









}
