import PlayEnum.WeekDay.WeekDay

object PlayEnum extends App {

  object WeekDay extends Enumeration {
    type WeekDay = Value
    val Sun, Mon, Tue, Wed, Thu, Fri, Sat = Value
  }

  def isWorkingDay(day: WeekDay): Boolean = {
    !(day == WeekDay.Sat || day == WeekDay.Sun)
  }

  val day = WeekDay.Mon
  println(isWorkingDay(day))


  object Month {
    val Jan = 1
    val Feb = 2
    val Mar = 3
    val Apr = 4

  }








}
