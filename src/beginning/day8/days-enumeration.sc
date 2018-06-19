object WeekDay extends Enumeration {
  type WeekDay = Value
  val Mon, Tue, Wed, Thu, Fir, Sat, Sun = Value
}

import WeekDay._

def isWorkingDay(d: WeekDay.WeekDay) = ! (d == WeekDay.Sat || d == WeekDay.Sun)

WeekDay.values filter isWorkingDay foreach println