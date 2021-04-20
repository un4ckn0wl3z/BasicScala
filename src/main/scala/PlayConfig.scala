import com.typesafe.config.ConfigFactory

object PlayConfig extends App {

  val conf = ConfigFactory.load()
  val what = conf.getInt("what")
  println(what)

  val bar = conf.getInt("foo.bar")
  println(what)

  val name = conf.getString("foo.name")
  println(name)

  val list = conf.getAnyRefList("foo.list")
  println(list)





}
