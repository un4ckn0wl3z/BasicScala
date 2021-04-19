object PlayArgs {
  def main(args: Array[String]): Unit = {
    println(args.length)
    for (arg <- args){
      println(arg)
    }

    print("input: ")
    val name = io.StdIn.readLine()
    println(s"hello $name")

  }
}
