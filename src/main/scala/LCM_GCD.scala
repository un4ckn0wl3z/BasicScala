object LCM_GCD extends App {

  // input number: 2
  // input #1
  // input #2
  // lcm = 20

  def getLCM(arr: Seq[Int]): Int = {
    var s = arr.max
    var found = false
    while (!found) {
      if(arr.forall(s % _ == 0)) {
        found = true
      }else{
        s += 1
      }
    }
    s
  }

  def getGCD(arr: Seq[Int]): Int = {
    var s = arr.max
    var found = false
    while (!found){
      if(arr.forall(_ % s == 0)) {
        found = true
      }else{
        s -= 1
      }
    }
    s
  }


  print("input number: ")
  val n = io.StdIn.readInt()
  var arr: Seq[Int] = Seq.empty
  for (i <- 1 to n) {
    print(s"input #$i: ")
    arr = arr :+ io.StdIn.readInt()
  }


  println(s"lcm = ${getLCM(arr)}")
  println(s"gcd = ${getGCD(arr)}")







}
