import com.google.gson.Gson

object PlayJson extends App {

  case class Book(id: Int, name: String)
  val book1 = Book(1, "Scala Programming")

  val gson = new Gson()
  val jsonString = gson.toJson(book1)

  println(jsonString)


  val book2 = gson.fromJson(jsonString, classOf[Book])
  println(s"${book2.id} : ${book2.name}")


}
