object Fac extends App {
  def fac(n: Int) : Int = {
    if (n <= 1)
      1
    else
      n * fac(n-1)

  }

  println(fac(2))
}
