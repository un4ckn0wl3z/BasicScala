import java.io.PrintWriter
import scala.io.Source

object PlaySum extends App {
//  val a = Array(10,20).sum
//  println(a)

  def mySum(list: List[Int]) : Int = {
    var sum = 0
    for (i <- list) {
      sum = sum + i
    }
    sum
  }


  def mySum2(list: List[Int]) : Int = {
    list match {
      case Nil => 0
      case x :: tail => x + mySum2(tail)
    }
  }

  val a = mySum2(List(20, 30))
  println(a)

  val src = Source.fromFile("matrix.txt")
  val lines = src.getLines()

  val rowSim = lines.map(line => line.split(" ").map(str => str.toDouble).sum )
  val pw = new PrintWriter("output.txt")
  rowSim.foreach(row => pw.println(row))
  pw.close()


  // Curry


}
