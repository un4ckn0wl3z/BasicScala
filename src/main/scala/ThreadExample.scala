object ThreadExample extends App {

  class BankAccount(var amount:Int) {
    override def toString: String = ""+amount
  }

  val bankAccount = new BankAccount(5000)
  println(bankAccount)

  val thread1 = new Thread(() => {
    bankAccount.amount -= 200
  })

  val thread2 = new Thread(() => {
    bankAccount.amount -= 100
  })

  thread1.start()
  thread2.start()

  thread1.join(100)
  thread2.join(100)

  println(bankAccount)



}
