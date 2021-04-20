import com.google.inject.{Binder, Guice, Inject, Module}

trait Processor {
  def process() : Unit
}

class ActualProcessor extends Processor {
  override def process(): Unit = println("ActualProcessor")
}

class ActualProcessor2 extends Processor {
  override def process(): Unit = println("ActualProcessor2")
}

class OrderService @Inject()(processor: Processor){
  def processOrder() : Unit = {
    processor.process()
  }
}

class DependencyModule extends Module {
  override def configure(binder: Binder): Unit = {
    binder.bind(classOf[Processor]).to(classOf[ActualProcessor2])
  }
}


object PlayInject extends App {
  val injector = Guice.createInjector(new DependencyModule)
  val orderService = injector.getInstance(classOf[OrderService])
  orderService.processOrder()

  val actualProcessor = injector.getInstance(classOf[ActualProcessor])

  actualProcessor.process()

}
