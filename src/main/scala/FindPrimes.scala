object FindPrimes extends App {
  def isPrime(n: Int): Boolean = {
    if(n>=2){
      var prime = true
      for (i <- 2 to n -1){
        if(n%i == 0){
          prime = false
        }
      }
      prime
    }else{
      false
    }
  }

  // input 10, output  2 3 5 7
  println(isPrime(2))
  println(isPrime(3))
  println(isPrime(4))

  var input = 10000000
  var c = 0
  var x = 1
  while (c < input){
    if(isPrime(x)){
      c = c + 1
      print(x + " ")
    }
    x = x + 1
  }



}
