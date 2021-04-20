object PlayLazy extends App {

  lazy val x: Int = throw new RuntimeException
  //println(x)

  lazy val y: Int = {
    println("inside y")
    10
  }

  println(y)
  println(y)

  def sideEffect : Boolean = {
    println("side effect")
    true
  }

  def simple: Boolean = false

  lazy val lazyCondition:Boolean = sideEffect

  println(if (simple && lazyCondition) "yes" else "no")


}
