object PlayGeneric extends App {

  // generic
  // companion object

  class MyList[T](value: T){
    println("inside MyList")

    def showValue = {
      if (value.isInstanceOf[Int]){
        println("This is Int: " + value)
      }
      else if (value.isInstanceOf[String]){
        println("This is String: " + value)
      }
      else {
        println("unknown: " + value)
      }
    }
  }

  val intList = new MyList[Int](100)
  val stringList = new MyList[String]("Hello")
  val doubleList = new MyList[Double](10.34)


  intList.showValue
  stringList.showValue
  doubleList.showValue


  // companion object

  object MyList {
    def apply[T](value: T): MyList[T] = new MyList(value)
    def emptyList[T] = println("This is empty")
  }

  MyList.emptyList[Int]
  MyList.emptyList[String]
  MyList.apply("Hello").showValue
  MyList.apply(10000).showValue




}
