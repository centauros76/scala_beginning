package beginning.day3

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._


/**
  * Created by Rene on 2018. 5. 9..
  */
object WorldDate {

  def main(args: Array[String]) {
    val now = new java.util.Date
    val df = getDateInstance(LONG, Locale.UK)
    println(df format now)
  }
}
