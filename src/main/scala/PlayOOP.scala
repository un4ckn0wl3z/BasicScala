object PlayOOP extends App {

  class Car(val year: Int, val model: String) { // public
    println("This is in constructor")
    private val machine: String = "motor"

    def run(distance: Int): Unit = {
      println("This car is RUNNING around " + distance + " meters")
    }

    def fill(l: Int): Unit = {
      println("We've filled oild in " + l + " litres")

    }


  }

  val car1 = new Car(year = 2010, model = "BMW")
  println(car1.model + " " + car1.year)
  car1.run(1000)
  car1.fill(20)


  abstract class Animal {
    def eat
    def walk
  }

  class Cat(val name: String) extends Animal {
    override def eat: Unit = println("Cat is eating")
    override def walk: Unit = println("Cat is walking")
  }

  class Dog extends Animal {
    override def eat: Unit = println("Dog is eating")
    override def walk: Unit = println("Dog is walking")
  }

  class Human {
    def eat = println("human can eating")
    def work = println("human have to work")
  }

  class ModernHuman extends Human with Doctor with Programmer {
    override def work: Unit = {
      // super.work
      println("Modern Human can work smarter than human")
    }
  }

  val cat1 = new Cat("Lucy")
  val dog1 = new Dog
  cat1.walk
  println(cat1.name)
  dog1.walk


  // interface -> trait

  trait Doctor {
    def heal() = println("Doctor like healing")
  }

  trait Programmer {
    def writeCode() = println("Programmer like coding")
  }

  val m1 = new ModernHuman

  m1.eat
  m1.work
  m1.heal()
  m1.writeCode()


}
