object ValueVar extends App {
  // value, variable, data type
  var i: Int = 10
  val s: String = "Hello"
  val b: Boolean = true
  val amount: Double = 20.55
  val c: Char = 'A'
  val f: Float = 10.55f

  i = 20

  i = 20
  i = i + 5
  i += 10

  i = i.+(1)
  i = i - 5
  i -= 3
  i *= 2
  i /= 2

  i = i % 2
  i = 3

  if (i==2){
    println("Yes i = 2")
  }
  else if (i==3) {
    println("Yes i = 3")
  }
  else {
    println(s"No i = $i")
  }

  println(i)

  val a = if (i==3) 10 else 20
  println(a)

  val two = {
    println("Enter here!!")
    2
  }
  println(two)

  val x = 15 - 18 * 3 // -39
  println(x)

  val pi = math.Pi

  println(pi)
  println("%1.2f".format(pi))
  println(f"$pi%1.3f")

  val y = 10.5
  println("%2.0f".format(y))

  print("Input name: ")
  val name = io.StdIn.readLine()

  println(f"Hi ${name}")

  // type inference



}
